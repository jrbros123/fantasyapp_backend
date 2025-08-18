package com.example.fantasy_nba.player;

import jakarta.persistence.*;

@Entity
@Table(name = "player_stats")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer rk;

    @Column(name = "player")
    private String player;

    private Integer age;
    private String team;
    private String pos;
    private Integer g;
    private Integer gs;
    private Double mp;
    private Double fg;
    private Double fga;

    @Column(name = "fg_percent")
    private Double fgPercent;

    @Column(name = "_3p")
    private Double threeP;

    @Column(name = "_3pa")
    private Double threePA;

    @Column(name = "_3p_percent")
    private Double threePPercent;

    @Column(name = "_2p")
    private Double twoP;

    @Column(name = "_2pa")
    private Double twoPA;

    @Column(name = "_2p_percent")
    private Double twoPPercent;

    @Column(name = "efg_percent")
    private Double efgPercent;

    private Double ft;
    private Double fta;

    @Column(name = "ft_percent")
    private Double ftPercent;

    private Double orb;
    private Double drb;
    private Double trb;
    private Double ast;
    private Double stl;
    private Double blk;
    private Double tov;
    private Double pf;
    private Double pts;

    private String awards;

    @Column(name = "player_additional")
    private String playerAdditional;

    // ----------- Getters and Setters -----------

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getRk() { return rk; }
    public void setRk(Integer rk) { this.rk = rk; }

    public String getPlayer() { return player; }
    public void setPlayer(String player) { this.player = player; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    public String getPos() { return pos; }
    public void setPos(String pos) { this.pos = pos; }

    public Integer getG() { return g; }
    public void setG(Integer g) { this.g = g; }

    public Integer getGs() { return gs; }
    public void setGs(Integer gs) { this.gs = gs; }

    public Double getMp() { return mp; }
    public void setMp(Double mp) { this.mp = mp; }

    public Double getFg() { return fg; }
    public void setFg(Double fg) { this.fg = fg; }

    public Double getFga() { return fga; }
    public void setFga(Double fga) { this.fga = fga; }

    public Double getFgPercent() { return fgPercent; }
    public void setFgPercent(Double fgPercent) { this.fgPercent = fgPercent; }

    public Double getThreeP() { return threeP; }
    public void setThreeP(Double threeP) { this.threeP = threeP; }

    public Double getThreePA() { return threePA; }
    public void setThreePA(Double threePA) { this.threePA = threePA; }

    public Double getThreePPercent() { return threePPercent; }
    public void setThreePPercent(Double threePPercent) { this.threePPercent = threePPercent; }

    public Double getTwoP() { return twoP; }
    public void setTwoP(Double twoP) { this.twoP = twoP; }

    public Double getTwoPA() { return twoPA; }
    public void setTwoPA(Double twoPA) { this.twoPA = twoPA; }

    public Double getTwoPPercent() { return twoPPercent; }
    public void setTwoPPercent(Double twoPPercent) { this.twoPPercent = twoPPercent; }

    public Double getEfgPercent() { return efgPercent; }
    public void setEfgPercent(Double efgPercent) { this.efgPercent = efgPercent; }

    public Double getFt() { return ft; }
    public void setFt(Double ft) { this.ft = ft; }

    public Double getFta() { return fta; }
    public void setFta(Double fta) { this.fta = fta; }

    public Double getFtPercent() { return ftPercent; }
    public void setFtPercent(Double ftPercent) { this.ftPercent = ftPercent; }

    public Double getOrb() { return orb; }
    public void setOrb(Double orb) { this.orb = orb; }

    public Double getDrb() { return drb; }
    public void setDrb(Double drb) { this.drb = drb; }

    public Double getTrb() { return trb; }
    public void setTrb(Double trb) { this.trb = trb; }

    public Double getAst() { return ast; }
    public void setAst(Double ast) { this.ast = ast; }

    public Double getStl() { return stl; }
    public void setStl(Double stl) { this.stl = stl; }

    public Double getBlk() { return blk; }
    public void setBlk(Double blk) { this.blk = blk; }

    public Double getTov() { return tov; }
    public void setTov(Double tov) { this.tov = tov; }

    public Double getPf() { return pf; }
    public void setPf(Double pf) { this.pf = pf; }

    public Double getPts() { return pts; }
    public void setPts(Double pts) { this.pts = pts; }

    public String getAwards() { return awards; }
    public void setAwards(String awards) { this.awards = awards; }

    public String getPlayerAdditional() { return playerAdditional; }
    public void setPlayerAdditional(String playerAdditional) { this.playerAdditional = playerAdditional; }
}
