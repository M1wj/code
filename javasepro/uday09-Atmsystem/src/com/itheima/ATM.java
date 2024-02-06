package com.itheima;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);
    private Account loginAcc;//记住登录系统的账户

    /** 启动欢迎系统展示欢迎界面 */
    public void start()
    {
        while (true) {
            System.out.println("===欢迎您进入ATM系统===");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择");
            int command=sc.nextInt();
            switch(command)
            {
                case 1:
                    //用户登录
                    login();
                    break;
                case 2:
                    //用户开户
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作");
            }
        }
    }

    /** 完成用户开户操作*/
    private void createAccount()
    {
        System.out.println("==系统开户操作==");
        //1.创建一个账户对象，用于封装用户的开户信息
        Account acc=new Account();

        //2.提示用户自己输入信息
        System.out.println("请输入您的账户名称：");
        String name=sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请输入您的性别");
            char sex=sc.next().charAt(0);
            if(sex=='男'||sex=='女'){
                acc.setSex(sex);
                break;
            }
            else{
                System.out.println("您输入的性别有误，性别只能为男或者为女");
            }
        }

        while (true) {
            System.out.println("请输入您的账户密码:");
            String passWord=sc.next();
            System.out.println("请输入您的确认密码:");
            String okPassWord=sc.next();
            if(passWord.equals(okPassWord))
            {
                acc.setPassWord(passWord);
                break;
            }
            else{
                System.out.println("您两次输入的密码不一致");
            }
        }

        System.out.println("请输入您的取现额度");
        double limit=sc.nextDouble();
        acc.setLimit(limit);

        //重点：我们需要为用户随机生成一个银行账号，并且不能重复8位数字
        String newCardId=createCardId();
        acc.setCardId(newCardId);

        //将此对象存入到账户集合中
        accounts.add(acc);
        System.out.println("恭喜您" + acc.getUserName() + "开户成功,您的卡号是："+acc.getCardId());


    }

    /**登录界面*/
    private void login()
    {
        System.out.println("===系统登录===");
        if(accounts.size()==0)
        {
            System.out.println("当前系统中无账户");
            return;
        }

        //2.系统中存在账户对象，可以开始进行登录操作
        while (true) {
            System.out.println("请您输入您的卡号：");
            String cardId=sc.next();
            Account acc=getAccountByIdCard(cardId);
            if(acc==null)
            {
                //卡号不存在
                System.out.println("您输入的卡号不存在");
            }
            else{
                //存在，让用户输入密码
                while (true) {
                    System.out.println("请输入您的登录密码：");
                    String passWord=sc.next();
                    if(acc.getPassWord().equals(passWord))
                    {
                        loginAcc=acc;
                        //正确登录成功
                        System.out.println("恭喜您," + acc.getUserName() + "成功登录系统，您的卡号为：" + acc.getCardId());
                        //展示登录后的操作界面
                        showUserCommand();
                        return;//跳出并结束当前登录方法
                    }
                    else{
                        System.out.println("您输入的密码不争取请重新输入");
                    }
                }
            }
        }
    }
    /** 展示登录后的操作界面*/
    private void showUserCommand()
    {
        while (true) {
            System.out.println(loginAcc.getUserName()+"您可以选择如下功能进行账户处理====");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.密码修改");
            System.out.println("6.退出");
            System.out.println("7.注销当前账户");
            System.out.println("请选择");
            int command=sc.nextInt();
            switch (command)
            {
                case 1:
                    //查询账户
                    showLoginAccount();
                    break;
                case 2:
                    //存款
                    depositMoney();
                    break;
                case 3:
                    //取款
                    drawMoney();
                    break;
                case 4:
                    //转账
                    transferMoney();
                    break;
                case 5:
                    //密码修改
                    updatePassWord();
                    return;
                case 6:
                    //退出
                    System.out.println(loginAcc.getUserName() + "欢迎您退出，感谢使用！");
                    return;
                case 7:
                    //注销账户
                    if(deleteAccount()){
                        return;
                    }
                    break;
                default:
                    System.out.println("您当前所选择的操作不正确");
            }
        }

    }
    //修改密码
    private void updatePassWord() {
        System.out.println("==账户密码修改操作==");
        System.out.println("请输入当前密码");
        String passWord=sc.next();

        if(loginAcc.getPassWord().equals(passWord)){
            while (true) {
                System.out.println("请输入新密码");
                String  newPassWord=sc.next();
                System.out.println("请再次输入新密码");
                String  oknewPassWord=sc.next();
                if(newPassWord.equals(oknewPassWord))
                {
                    loginAcc.setPassWord(oknewPassWord);
                    System.out.println("恭喜您修改成功");
                    return;
                }else{
                    System.out.println("您输入的2此密码不一致");
                }
            }
        }
        else{
            System.out.println("您输入的密码不正确");
        }
    }

    //销户
    private boolean deleteAccount() {

        System.out.println("==进行销户操作==");

        //1.问问用户是否确定销户
        System.out.println("请问您确定销户吗？y/n");
        String command=sc.next();
        switch (command)
        {
            case "y":
                //判断是否有钱
                if(loginAcc.getMoney()==0)
                {
                    accounts.remove(loginAcc);
                    System.out.println("您好您的账户已经销毁");
                    return true;
                }
                else{
                    System.out.println("对不起您账户中有钱，不能销毁");
                    return false;
                }
            default:
                System.out.println("好的您的账户保留");
                return false;
        }
    }

    //转账
    private void transferMoney() {
        System.out.println("==转账==");
        //1.判断系统中是否存在其他账户
        if(accounts.size()<2)
        {
            System.out.println("当前系统中不足两个账户，无法向其他用户转账");
            return;
        }

        //2.判断自己的账户是否有钱
        if(loginAcc.getMoney()==0)
        {
            System.out.println("您的余额为0，不可转账");
            return;
        }

        //3.开始转账
        while (true) {
            System.out.println("请您输入对方的卡号：");
            String cardId=sc.next();

            //4.判断该卡号是否正确
            Account acc=getAccountByIdCard(cardId);
            if(acc==null){
                System.out.println("您输入的卡号账户不存在");
            }
            else{
                //对方的账户存在，继续让用户验证其姓氏
                String name="*"+acc.getUserName().substring(1);
                System.out.println("请您输入" + name + "的姓氏");
                String preName=sc.next();
                //判断这个姓氏是否正确
                if(acc.getUserName().startsWith(preName)){
                    //认证通过
                    while (true) {
                        System.out.println("请您输入给对方转账的金额");
                        double money= sc.nextDouble();
                        //判断该金额是否超过自己的余额
                        if(loginAcc.getMoney()>=money)
                        {
                            //没有超过可以转账，更新自己的余额
                            loginAcc.setMoney(loginAcc.getMoney()-money);
                            //更新对方账户的余额
                            acc.setMoney(acc.getMoney()+money);
                            System.out.println("您转账成功了");
                            return;
                        }
                    }
                }
                else{
                    System.out.println("对不起您输入的姓氏有问题");
                }
            }
        }

    }

    //取钱
    private void drawMoney() {
        System.out.println("==取钱操作==");
        if(loginAcc.getMoney()<100)
        {
            System.out.println("您的余额不足100元，不允许取款~~");
            return;
        }

        //判断余额是否充足
        while (true) {
            System.out.println("请您输入取款金额");
            double money= sc.nextDouble();

            if(loginAcc.getMoney()>=money)
            {
                //余额足够
                //判断是否超过限额
                if(loginAcc.getLimit()<money)
                {
                    System.out.println("您的去款超出了限额");
                }
                else
                {
                    //可以取款成功
                    loginAcc.setMoney(loginAcc.getMoney()-money);
                    System.out.println("您取款" + money + "成功，余额：" + loginAcc.getMoney());
                    break;
                }
            }
            else{
                System.out.println("余额不足，您的账户中的余额为：" + loginAcc.getMoney());
            }
        }

    }

    //存钱
    private void depositMoney() {
        System.out.println("==存钱操作");
        System.out.println("请您输入存款金额");
        double money=sc.nextDouble();
        loginAcc.setMoney(loginAcc.getMoney()+money);
        System.out.println("恭喜您，您存钱：" + money + "成功，存钱后余额为：" + loginAcc.getMoney());
    }

    /**展示当前的登录信息*/
    private void showLoginAccount(){
        System.out.println("当前您的账户信息如下");
        System.out.println("卡号"+loginAcc.getCardId());
        System.out.println("户主"+loginAcc.getUserName());
        System.out.println("余额"+loginAcc.getMoney());
        System.out.println("每次取现额度"+loginAcc.getLimit());

    }

    /**返回一个8位数字的卡号，并且这个卡号不能与其他账户的卡号重复*/
    private String createCardId()
    {
        while (true) {
            String cardId="";
            Random r=new Random();
            for(int i=0;i<8;i++)
            {
                int data=r.nextInt(10);
                cardId+=data;
            }

            //判断cardId中记住的卡号，是否与其他账户的卡号重复了，没有重复，作为一个新卡号返回
            Account acc=getAccountByIdCard(cardId);
            if(acc==null)
            {
                return cardId;
            }
        }

    }


    /** 更具卡号查询账户对象返回 accounts=[c1,c2,c3...]*/
    private Account getAccountByIdCard(String cardId){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc=accounts.get(i);
            if(acc.getCardId().equals(cardId))
            {
                return acc;
            }
        }
        return null;
    }

}
