class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        // 易伤，承受更高伤害; 检查对方是否易伤
        return fighter.isVulnerable() ? 10 : 6;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter {
    // 法术准备状态
    private boolean prepareStatus = false;

    public void prepareSpell() {
        this.prepareStatus = true;
    }

    @Override
    boolean isVulnerable() {
        // 已准备，非易伤; 未准备，易伤
        return this.prepareStatus ? false : true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        // 与 fighter 无关
        return this.prepareStatus ? 12 : 3;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}