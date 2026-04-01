package com.jeepark.onestep.util;

public class Model_B {

    public static double predict(double[] input) {
        double rawScore = score(input);

        return Math.max(1.0, Math.min(5.0, rawScore));
    }


    public static double score(double[] input) {
        double var0;
        if (input[0] < 12.0) {
            if (input[1] < 2.0) {
                if (input[4] < 4.0) {
                    if (input[3] < 1.97) {
                        if (input[3] < 1.4) {
                            var0 = 0.00015561655;
                        } else {
                            var0 = -0.0020548683;
                        }
                    } else {
                        if (input[3] < 2.95) {
                            var0 = -0.00008628319;
                        } else {
                            var0 = 0.0005732868;
                        }
                    }
                } else {
                    if (input[3] < 3.32) {
                        if (input[3] < 2.64) {
                            var0 = -0.0008306237;
                        } else {
                            var0 = 0.00031536928;
                        }
                    } else {
                        if (input[3] < 4.81) {
                            var0 = -0.0015195037;
                        } else {
                            var0 = 0.0006876866;
                        }
                    }
                }
            } else {
                if (input[4] < 6.0) {
                    if (input[3] < 4.02) {
                        if (input[3] < 3.22) {
                            var0 = 0.0001527514;
                        } else {
                            var0 = 0.001626412;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var0 = 0.0010622764;
                        } else {
                            var0 = -0.0012456173;
                        }
                    }
                } else {
                    if (input[3] < 3.61) {
                        if (input[3] < 1.69) {
                            var0 = -0.0006946236;
                        } else {
                            var0 = 0.0009733806;
                        }
                    } else {
                        if (input[2] < 2.0) {
                            var0 = 0.0008339286;
                        } else {
                            var0 = 0.004197755;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.93) {
                if (input[2] < 9.0) {
                    if (input[1] < 5.0) {
                        if (input[1] < 4.0) {
                            var0 = -0.000089949695;
                        } else {
                            var0 = -0.0004988616;
                        }
                    } else {
                        if (input[0] < 35.0) {
                            var0 = 0.0006834156;
                        } else {
                            var0 = -0.00006816635;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[0] < 52.0) {
                            var0 = 0.00014489538;
                        } else {
                            var0 = -0.0005976853;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var0 = 0.000044307566;
                        } else {
                            var0 = 0.003398461;
                        }
                    }
                }
            } else {
                if (input[4] < 5.0) {
                    if (input[1] < 2.0) {
                        if (input[4] < 3.0) {
                            var0 = -0.0004242599;
                        } else {
                            var0 = 0.0026207606;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var0 = -0.00001577735;
                        } else {
                            var0 = -0.0012417282;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 4.95) {
                            var0 = -0.0008705814;
                        } else {
                            var0 = 0.002666068;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var0 = 0.0050730254;
                        } else {
                            var0 = 0.0014047463;
                        }
                    }
                }
            }
        }
        double var1;
        if (input[0] < 89.0) {
            if (input[3] < 2.01) {
                if (input[3] < 1.93) {
                    if (input[3] < 1.83) {
                        if (input[3] < 1.25) {
                            var1 = -0.0004710621;
                        } else {
                            var1 = -0.00007652717;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var1 = -0.00020422669;
                        } else {
                            var1 = 0.0013107059;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 15.0) {
                            var1 = -0.00048881344;
                        } else {
                            var1 = -0.0026117086;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var1 = -0.0012803174;
                        } else {
                            var1 = 0.0000863916;
                        }
                    }
                }
            } else {
                if (input[4] < 2.0) {
                    if (input[3] < 2.73) {
                        if (input[1] < 4.0) {
                            var1 = -0.0002236615;
                        } else {
                            var1 = -0.0029149693;
                        }
                    } else {
                        if (input[0] < 10.0) {
                            var1 = -0.0007886476;
                        } else {
                            var1 = -0.000025796335;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 31.0) {
                            var1 = 0.000368264;
                        } else {
                            var1 = -0.00001591302;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var1 = 0.000009438816;
                        } else {
                            var1 = 0.0014893279;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.77) {
                if (input[4] < 4.0) {
                    if (input[3] < 3.07) {
                        if (input[3] < 1.22) {
                            var1 = 0.0008059099;
                        } else {
                            var1 = -0.0006706044;
                        }
                    } else {
                        if (input[3] < 3.13) {
                            var1 = 0.0014790647;
                        } else {
                            var1 = 0.00025692215;
                        }
                    }
                } else {
                    if (input[3] < 3.28) {
                        if (input[2] < 9.0) {
                            var1 = -0.0005063167;
                        } else {
                            var1 = 0.0005944163;
                        }
                    } else {
                        if (input[2] < 3.0) {
                            var1 = -0.0032494143;
                        } else {
                            var1 = -0.0006529073;
                        }
                    }
                }
            } else {
                if (input[4] < 5.0) {
                    if (input[2] < 1.0) {
                        var1 = 0.0018083394;
                    } else {
                        if (input[3] < 4.86) {
                            var1 = 0.00046043398;
                        } else {
                            var1 = -0.00057186285;
                        }
                    }
                } else {
                    var1 = 0.0029066612;
                }
            }
        }
        double var2;
        if (input[3] < 4.93) {
            if (input[0] < 12.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 1.97) {
                            var2 = -0.0011488431;
                        } else {
                            var2 = 0.0002819812;
                        }
                    } else {
                        if (input[2] < 2.0) {
                            var2 = 0.000011136631;
                        } else {
                            var2 = -0.0010135074;
                        }
                    }
                } else {
                    if (input[4] < 5.0) {
                        if (input[3] < 3.71) {
                            var2 = 0.00035576453;
                        } else {
                            var2 = -0.00055715046;
                        }
                    } else {
                        if (input[3] < 3.53) {
                            var2 = 0.0004992822;
                        } else {
                            var2 = 0.0028079266;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[0] < 61.0) {
                            var2 = 0.0000735294;
                        } else {
                            var2 = 0.0009215632;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var2 = -0.00021805882;
                        } else {
                            var2 = -0.0010199612;
                        }
                    }
                } else {
                    if (input[3] < 1.25) {
                        if (input[1] < 2.0) {
                            var2 = 0.0011354118;
                        } else {
                            var2 = -0.001579145;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var2 = -0.00062007195;
                        } else {
                            var2 = 0.00025988367;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        var2 = -0.0004076332;
                    } else {
                        var2 = 0.0029428685;
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var2 = -0.00031100598;
                        } else {
                            var2 = 0.0029574751;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var2 = 0.00008119686;
                        } else {
                            var2 = -0.0024191237;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var2 = 0.0018841446;
                    } else {
                        if (input[0] < 23.0) {
                            var2 = -0.00007509589;
                        } else {
                            var2 = -0.0015351058;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var2 = 0.0054450314;
                    } else {
                        var2 = 0.0014140527;
                    }
                }
            }
        }
        double var3;
        if (input[0] < 89.0) {
            if (input[3] < 2.01) {
                if (input[3] < 1.93) {
                    if (input[3] < 1.72) {
                        if (input[1] < 2.0) {
                            var3 = 0.00009335699;
                        } else {
                            var3 = -0.0003163339;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var3 = -0.00090217293;
                        } else {
                            var3 = 0.0010068784;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[2] < 3.0) {
                            var3 = -0.0005269125;
                        } else {
                            var3 = -0.003960267;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var3 = -0.0012097639;
                        } else {
                            var3 = 0.000062711755;
                        }
                    }
                }
            } else {
                if (input[4] < 2.0) {
                    if (input[3] < 2.73) {
                        if (input[2] < 4.0) {
                            var3 = 0.00051865424;
                        } else {
                            var3 = -0.0019929705;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var3 = 0.00036889993;
                        } else {
                            var3 = -0.00019329578;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[0] < 56.0) {
                            var3 = -0.00043962864;
                        } else {
                            var3 = 0.00039603296;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var3 = 0.00017119879;
                        } else {
                            var3 = 0.0008271897;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.76) {
                if (input[4] < 4.0) {
                    if (input[3] < 3.07) {
                        if (input[3] < 1.22) {
                            var3 = 0.00075486157;
                        } else {
                            var3 = -0.0006373348;
                        }
                    } else {
                        if (input[3] < 3.13) {
                            var3 = 0.0014089585;
                        } else {
                            var3 = 0.000236998;
                        }
                    }
                } else {
                    if (input[3] < 3.28) {
                        if (input[2] < 9.0) {
                            var3 = -0.00046872892;
                        } else {
                            var3 = 0.0005606587;
                        }
                    } else {
                        if (input[2] < 3.0) {
                            var3 = -0.0032770094;
                        } else {
                            var3 = -0.0006268424;
                        }
                    }
                }
            } else {
                if (input[4] < 5.0) {
                    if (input[2] < 1.0) {
                        var3 = 0.0017685831;
                    } else {
                        if (input[3] < 4.86) {
                            var3 = 0.00043939947;
                        } else {
                            var3 = -0.0005628864;
                        }
                    }
                } else {
                    if (input[0] < 99.0) {
                        var3 = 0.0027277963;
                    } else {
                        var3 = 0.00022703409;
                    }
                }
            }
        }
        double var4;
        if (input[0] < 66.0) {
            if (input[1] < 2.0) {
                if (input[3] < 1.33) {
                    if (input[0] < 24.0) {
                        var4 = 0.00052741374;
                    } else {
                        var4 = 0.0008940284;
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[3] < 2.97) {
                            var4 = -0.00025743688;
                        } else {
                            var4 = 0.00047606145;
                        }
                    } else {
                        if (input[3] < 1.87) {
                            var4 = -0.0017356639;
                        } else {
                            var4 = -0.00039721953;
                        }
                    }
                }
            } else {
                if (input[3] < 1.43) {
                    if (input[1] < 3.0) {
                        if (input[2] < 4.0) {
                            var4 = 0.0000051885845;
                        } else {
                            var4 = -0.0014616546;
                        }
                    } else {
                        if (input[3] < 1.06) {
                            var4 = -0.0013353828;
                        } else {
                            var4 = -0.00014328469;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.9) {
                            var4 = 0.0014037736;
                        } else {
                            var4 = -0.00069409533;
                        }
                    } else {
                        if (input[0] < 12.0) {
                            var4 = 0.00087637577;
                        } else {
                            var4 = 0.0002560275;
                        }
                    }
                }
            }
        } else {
            if (input[1] < 2.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 5.0) {
                        if (input[3] < 3.22) {
                            var4 = 0.0005474011;
                        } else {
                            var4 = -0.00013426259;
                        }
                    } else {
                        if (input[3] < 3.82) {
                            var4 = 0.00075475307;
                        } else {
                            var4 = 0.0034644639;
                        }
                    }
                } else {
                    if (input[3] < 1.47) {
                        if (input[3] < 1.3) {
                            var4 = 0.0011773158;
                        } else {
                            var4 = 0.0003044814;
                        }
                    } else {
                        if (input[3] < 1.82) {
                            var4 = -0.0021116955;
                        } else {
                            var4 = -0.000061537714;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 1.57) {
                        if (input[3] < 1.32) {
                            var4 = 0.0013197253;
                        } else {
                            var4 = 0.00034321143;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var4 = -0.00016713666;
                        } else {
                            var4 = -0.0018222826;
                        }
                    }
                } else {
                    if (input[3] < 1.37) {
                        if (input[2] < 7.0) {
                            var4 = -0.0024560348;
                        } else {
                            var4 = -0.0009289525;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var4 = -0.0004505335;
                        } else {
                            var4 = 0.00021955425;
                        }
                    }
                }
            }
        }
        double var5;
        if (input[3] < 4.17) {
            if (input[3] < 4.03) {
                if (input[3] < 3.86) {
                    if (input[1] < 5.0) {
                        if (input[2] < 9.0) {
                            var5 = -0.00019674782;
                        } else {
                            var5 = 0.00011783616;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var5 = -0.00015281851;
                        } else {
                            var5 = 0.00054970145;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[2] < 4.0) {
                            var5 = 0.00085976155;
                        } else {
                            var5 = -0.00050175615;
                        }
                    } else {
                        if (input[0] < 34.0) {
                            var5 = 0.0025054265;
                        } else {
                            var5 = 0.00086516485;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[4] < 2.0) {
                            var5 = -0.0002239426;
                        } else {
                            var5 = 0.0012346319;
                        }
                    } else {
                        if (input[0] < 63.0) {
                            var5 = -0.0003826912;
                        } else {
                            var5 = 0.0005616941;
                        }
                    }
                } else {
                    if (input[0] < 80.0) {
                        if (input[2] < 10.0) {
                            var5 = -0.0027163157;
                        } else {
                            var5 = 0.00095351535;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var5 = -0.00085670856;
                        } else {
                            var5 = 0.004027756;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[0] < 56.0) {
                            var5 = -0.00032965784;
                        } else {
                            var5 = 0.00023592103;
                        }
                    } else {
                        if (input[0] < 49.0) {
                            var5 = 0.0023611092;
                        } else {
                            var5 = 0.000070338865;
                        }
                    }
                } else {
                    if (input[0] < 14.0) {
                        if (input[4] < 4.0) {
                            var5 = -0.00024311915;
                        } else {
                            var5 = -0.0016442938;
                        }
                    } else {
                        if (input[3] < 4.7) {
                            var5 = 0.00021544354;
                        } else {
                            var5 = -0.00042490914;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 3.0) {
                        if (input[0] < 57.0) {
                            var5 = 0.0008598333;
                        } else {
                            var5 = 0.002899245;
                        }
                    } else {
                        if (input[0] < 22.0) {
                            var5 = 0.0023578822;
                        } else {
                            var5 = -0.0034481895;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.29) {
                            var5 = 0.00090626033;
                        } else {
                            var5 = -0.003233616;
                        }
                    } else {
                        if (input[3] < 4.52) {
                            var5 = 0.0010915088;
                        } else {
                            var5 = 0.0036290132;
                        }
                    }
                }
            }
        }
        double var6;
        if (input[3] < 4.93) {
            if (input[0] < 12.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 1.97) {
                            var6 = -0.0010555059;
                        } else {
                            var6 = 0.00030181473;
                        }
                    } else {
                        if (input[3] < 3.32) {
                            var6 = -0.0003110629;
                        } else {
                            var6 = -0.0011932368;
                        }
                    }
                } else {
                    if (input[4] < 5.0) {
                        if (input[3] < 3.71) {
                            var6 = 0.00032154942;
                        } else {
                            var6 = -0.00055016705;
                        }
                    } else {
                        if (input[3] < 3.53) {
                            var6 = 0.00043489132;
                        } else {
                            var6 = 0.0025680508;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.86) {
                            var6 = 0.00015074536;
                        } else {
                            var6 = 0.0009663766;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var6 = -0.00002144899;
                        } else {
                            var6 = -0.00066661445;
                        }
                    }
                } else {
                    if (input[3] < 1.25) {
                        if (input[1] < 2.0) {
                            var6 = 0.0010257037;
                        } else {
                            var6 = -0.0014291389;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var6 = -0.0005465195;
                        } else {
                            var6 = 0.00023237285;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        if (input[2] < 5.0) {
                            var6 = -0.00042843024;
                        } else {
                            var6 = -0.00009183884;
                        }
                    } else {
                        var6 = 0.0027637768;
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var6 = -0.00027653747;
                        } else {
                            var6 = 0.002796617;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var6 = 0.00008014866;
                        } else {
                            var6 = -0.0023106837;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var6 = 0.0017427563;
                    } else {
                        if (input[0] < 23.0) {
                            var6 = 0.000028544664;
                        } else {
                            var6 = -0.001424265;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var6 = 0.0050596874;
                    } else {
                        var6 = 0.0013076623;
                    }
                }
            }
        }
        double var7;
        if (input[0] < 89.0) {
            if (input[3] < 2.01) {
                if (input[3] < 1.93) {
                    if (input[3] < 1.83) {
                        if (input[2] < 4.0) {
                            var7 = -0.00037586258;
                        } else {
                            var7 = -0.000016790078;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var7 = -0.00009280294;
                        } else {
                            var7 = 0.0011747846;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 15.0) {
                            var7 = -0.00043743252;
                        } else {
                            var7 = -0.002394395;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var7 = -0.0011245151;
                        } else {
                            var7 = 0.00004826596;
                        }
                    }
                }
            } else {
                if (input[4] < 2.0) {
                    if (input[3] < 2.73) {
                        if (input[1] < 4.0) {
                            var7 = -0.00014986964;
                        } else {
                            var7 = -0.002693307;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var7 = -0.0001469974;
                        } else {
                            var7 = 0.00044639688;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[1] < 5.0) {
                            var7 = 0.000017772782;
                        } else {
                            var7 = 0.0004431457;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var7 = -0.00003776494;
                        } else {
                            var7 = 0.0013130618;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.76) {
                if (input[4] < 4.0) {
                    if (input[3] < 3.07) {
                        if (input[0] < 90.0) {
                            var7 = 0.00081217755;
                        } else {
                            var7 = -0.0005885984;
                        }
                    } else {
                        if (input[3] < 3.13) {
                            var7 = 0.0013463736;
                        } else {
                            var7 = 0.00021713386;
                        }
                    }
                } else {
                    if (input[3] < 3.28) {
                        if (input[0] < 94.0) {
                            var7 = -0.00068158034;
                        } else {
                            var7 = 0.00006609006;
                        }
                    } else {
                        if (input[2] < 3.0) {
                            var7 = -0.0030114441;
                        } else {
                            var7 = -0.0006243747;
                        }
                    }
                }
            } else {
                if (input[4] < 5.0) {
                    if (input[2] < 1.0) {
                        var7 = 0.0017848313;
                    } else {
                        if (input[3] < 4.88) {
                            var7 = 0.00023679335;
                        } else {
                            var7 = -0.00074216427;
                        }
                    }
                } else {
                    if (input[2] < 2.0) {
                        if (input[0] < 90.0) {
                            var7 = 0.0013480723;
                        } else {
                            var7 = 0.0003895283;
                        }
                    } else {
                        var7 = 0.0028002763;
                    }
                }
            }
        }
        double var8;
        if (input[0] < 68.0) {
            if (input[1] < 2.0) {
                if (input[3] < 1.33) {
                    if (input[0] < 27.0) {
                        var8 = 0.000540673;
                    } else {
                        var8 = 0.00089029217;
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[0] < 6.0) {
                            var8 = -0.00096244103;
                        } else {
                            var8 = 0.00026320605;
                        }
                    } else {
                        if (input[3] < 1.87) {
                            var8 = -0.0016381684;
                        } else {
                            var8 = -0.00035056742;
                        }
                    }
                }
            } else {
                if (input[3] < 1.57) {
                    if (input[1] < 3.0) {
                        if (input[2] < 5.0) {
                            var8 = -0.00025286622;
                        } else {
                            var8 = -0.0011300759;
                        }
                    } else {
                        if (input[3] < 1.1) {
                            var8 = -0.00085202506;
                        } else {
                            var8 = -0.00008894927;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.9) {
                            var8 = 0.0018266026;
                        } else {
                            var8 = -0.000634968;
                        }
                    } else {
                        if (input[2] < 10.0) {
                            var8 = 0.00027130404;
                        } else {
                            var8 = 0.001100354;
                        }
                    }
                }
            }
        } else {
            if (input[1] < 2.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 5.0) {
                        if (input[3] < 1.91) {
                            var8 = 0.0007759205;
                        } else {
                            var8 = 0.00007292269;
                        }
                    } else {
                        if (input[3] < 3.82) {
                            var8 = 0.00077544776;
                        } else {
                            var8 = 0.002814145;
                        }
                    }
                } else {
                    if (input[3] < 1.47) {
                        if (input[3] < 1.3) {
                            var8 = 0.0010608493;
                        } else {
                            var8 = 0.00032395523;
                        }
                    } else {
                        if (input[3] < 1.82) {
                            var8 = -0.0019507429;
                        } else {
                            var8 = 0.000006074751;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 1.63) {
                        if (input[3] < 1.32) {
                            var8 = 0.0013110287;
                        } else {
                            var8 = 0.00030817863;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var8 = -0.00010078;
                        } else {
                            var8 = -0.0016687548;
                        }
                    }
                } else {
                    if (input[3] < 1.37) {
                        if (input[2] < 9.0) {
                            var8 = -0.0019844533;
                        } else {
                            var8 = -0.0005550034;
                        }
                    } else {
                        if (input[3] < 3.69) {
                            var8 = -0.00013102284;
                        } else {
                            var8 = 0.00037688643;
                        }
                    }
                }
            }
        }
        double var9;
        if (input[3] < 4.93) {
            if (input[0] < 12.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 1.97) {
                            var9 = -0.00096699264;
                        } else {
                            var9 = 0.0002980069;
                        }
                    } else {
                        if (input[3] < 3.32) {
                            var9 = -0.00027794702;
                        } else {
                            var9 = -0.0011187786;
                        }
                    }
                } else {
                    if (input[4] < 5.0) {
                        if (input[3] < 3.8) {
                            var9 = 0.00029306873;
                        } else {
                            var9 = -0.0005628945;
                        }
                    } else {
                        if (input[3] < 3.53) {
                            var9 = 0.00039990392;
                        } else {
                            var9 = 0.0024162168;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[0] < 60.0) {
                            var9 = 0.00006289323;
                        } else {
                            var9 = 0.00077856926;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var9 = -0.00001455442;
                        } else {
                            var9 = -0.000616555;
                        }
                    }
                } else {
                    if (input[3] < 1.25) {
                        if (input[1] < 2.0) {
                            var9 = 0.0009360329;
                        } else {
                            var9 = -0.0013098797;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var9 = -0.00049487496;
                        } else {
                            var9 = 0.00020896693;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        if (input[2] < 5.0) {
                            var9 = -0.00041054093;
                        } else {
                            var9 = -0.00008122921;
                        }
                    } else {
                        var9 = 0.002607062;
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var9 = -0.00025028927;
                        } else {
                            var9 = 0.002705148;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var9 = 0.00005910652;
                        } else {
                            var9 = -0.0022262002;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var9 = 0.001692158;
                    } else {
                        if (input[0] < 23.0) {
                            var9 = 0.000036144258;
                        } else {
                            var9 = -0.0013878703;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var9 = 0.004830198;
                    } else {
                        var9 = 0.0011992216;
                    }
                }
            }
        }
        double var10;
        if (input[0] < 89.0) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[1] < 4.0) {
                        if (input[3] < 2.97) {
                            var10 = -0.00011641266;
                        } else {
                            var10 = 0.000115019146;
                        }
                    } else {
                        if (input[2] < 8.0) {
                            var10 = -0.00019105447;
                        } else {
                            var10 = -0.0009145423;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[0] < 52.0) {
                            var10 = 0.00015416218;
                        } else {
                            var10 = -0.0004614416;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var10 = 0.00043187445;
                        } else {
                            var10 = 0.0044419975;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 2.95) {
                        if (input[3] < 2.57) {
                            var10 = -0.00019302127;
                        } else {
                            var10 = 0.0018496804;
                        }
                    } else {
                        if (input[3] < 3.01) {
                            var10 = -0.0027830224;
                        } else {
                            var10 = -0.00023561898;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.4) {
                            var10 = -0.00033816727;
                        } else {
                            var10 = 0.0017992601;
                        }
                    } else {
                        if (input[3] < 4.0) {
                            var10 = 0.0011862268;
                        } else {
                            var10 = 0.000021451711;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.76) {
                if (input[4] < 4.0) {
                    if (input[3] < 3.07) {
                        if (input[0] < 91.0) {
                            var10 = 0.00035556415;
                        } else {
                            var10 = -0.00062743825;
                        }
                    } else {
                        if (input[4] < 3.0) {
                            var10 = 0.00008331647;
                        } else {
                            var10 = 0.00083616434;
                        }
                    }
                } else {
                    if (input[3] < 3.28) {
                        if (input[0] < 94.0) {
                            var10 = -0.0006181004;
                        } else {
                            var10 = 0.00009288218;
                        }
                    } else {
                        if (input[2] < 3.0) {
                            var10 = -0.0027827052;
                        } else {
                            var10 = -0.00061044464;
                        }
                    }
                }
            } else {
                if (input[4] < 5.0) {
                    if (input[2] < 1.0) {
                        var10 = 0.0017973423;
                    } else {
                        if (input[3] < 4.86) {
                            var10 = 0.00039956867;
                        } else {
                            var10 = -0.0005458673;
                        }
                    }
                } else {
                    if (input[2] < 2.0) {
                        var10 = 0.0009289593;
                    } else {
                        var10 = 0.002634659;
                    }
                }
            }
        }
        double var11;
        if (input[3] < 4.93) {
            if (input[0] < 12.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 1.97) {
                            var11 = -0.000921284;
                        } else {
                            var11 = 0.00028168957;
                        }
                    } else {
                        if (input[3] < 3.32) {
                            var11 = -0.00026292854;
                        } else {
                            var11 = -0.0010710516;
                        }
                    }
                } else {
                    if (input[4] < 5.0) {
                        if (input[3] < 3.71) {
                            var11 = 0.00028542275;
                        } else {
                            var11 = -0.0005176612;
                        }
                    } else {
                        if (input[3] < 3.53) {
                            var11 = 0.00037075309;
                        } else {
                            var11 = 0.0022873196;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.86) {
                            var11 = 0.00012717134;
                        } else {
                            var11 = 0.0008756891;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var11 = -0.0001613936;
                        } else {
                            var11 = -0.00082501856;
                        }
                    }
                } else {
                    if (input[3] < 1.25) {
                        if (input[1] < 2.0) {
                            var11 = 0.0008992792;
                        } else {
                            var11 = -0.0012418949;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var11 = -0.0004667263;
                        } else {
                            var11 = 0.00019561817;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        if (input[2] < 5.0) {
                            var11 = -0.00040068626;
                        } else {
                            var11 = -0.00008206964;
                        }
                    } else {
                        var11 = 0.0024736642;
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var11 = -0.00023793153;
                        } else {
                            var11 = 0.002603221;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var11 = 0.0000627952;
                        } else {
                            var11 = -0.0021266963;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var11 = 0.0016469837;
                    } else {
                        if (input[0] < 23.0) {
                            var11 = 0.000032365322;
                        } else {
                            var11 = -0.0013416291;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var11 = 0.0045983;
                    } else {
                        var11 = 0.001085353;
                    }
                }
            }
        }
        double var12;
        if (input[0] < 66.0) {
            if (input[1] < 2.0) {
                if (input[3] < 1.33) {
                    if (input[0] < 6.0) {
                        var12 = 0.00035540698;
                    } else {
                        if (input[2] < 3.0) {
                            var12 = 0.00046886504;
                        } else {
                            var12 = 0.00075808354;
                        }
                    }
                } else {
                    if (input[3] < 4.83) {
                        if (input[4] < 4.0) {
                            var12 = 0.0000033715348;
                        } else {
                            var12 = -0.00055511424;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var12 = -0.00027966697;
                        } else {
                            var12 = 0.002006552;
                        }
                    }
                }
            } else {
                if (input[3] < 1.57) {
                    if (input[1] < 3.0) {
                        if (input[2] < 5.0) {
                            var12 = -0.00021819366;
                        } else {
                            var12 = -0.0010786321;
                        }
                    } else {
                        if (input[3] < 1.06) {
                            var12 = -0.0011431364;
                        } else {
                            var12 = -0.000080250116;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.9) {
                            var12 = 0.0017305128;
                        } else {
                            var12 = -0.0006117029;
                        }
                    } else {
                        if (input[0] < 12.0) {
                            var12 = 0.00072614924;
                        } else {
                            var12 = 0.00023276747;
                        }
                    }
                }
            }
        } else {
            if (input[1] < 2.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 5.0) {
                        if (input[3] < 3.22) {
                            var12 = 0.00048192628;
                        } else {
                            var12 = -0.00024941933;
                        }
                    } else {
                        if (input[3] < 3.82) {
                            var12 = 0.000662881;
                        } else {
                            var12 = 0.0029831983;
                        }
                    }
                } else {
                    if (input[3] < 1.47) {
                        if (input[3] < 1.3) {
                            var12 = 0.0009918392;
                        } else {
                            var12 = 0.00036335885;
                        }
                    } else {
                        if (input[3] < 1.82) {
                            var12 = -0.0018233958;
                        } else {
                            var12 = 0.000030806692;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 1.74) {
                        if (input[3] < 1.32) {
                            var12 = 0.0012841444;
                        } else {
                            var12 = 0.00022152853;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var12 = -0.00014180377;
                        } else {
                            var12 = -0.0016670276;
                        }
                    }
                } else {
                    if (input[3] < 1.37) {
                        if (input[2] < 7.0) {
                            var12 = -0.0020792189;
                        } else {
                            var12 = -0.00071865;
                        }
                    } else {
                        if (input[0] < 96.0) {
                            var12 = 0.00015916226;
                        } else {
                            var12 = -0.0005275012;
                        }
                    }
                }
            }
        }
        double var13;
        if (input[3] < 4.93) {
            if (input[0] < 89.0) {
                if (input[1] < 5.0) {
                    if (input[2] < 9.0) {
                        if (input[1] < 4.0) {
                            var13 = -0.000004524463;
                        } else {
                            var13 = -0.0002999983;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var13 = -0.00014029283;
                        } else {
                            var13 = 0.0015257724;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 2.95) {
                            var13 = 0.00014867786;
                        } else {
                            var13 = -0.00040189558;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var13 = -0.00009286705;
                        } else {
                            var13 = 0.0007658281;
                        }
                    }
                }
            } else {
                if (input[3] < 4.76) {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.07) {
                            var13 = -0.000414667;
                        } else {
                            var13 = 0.00030832939;
                        }
                    } else {
                        if (input[3] < 3.28) {
                            var13 = -0.00017546781;
                        } else {
                            var13 = -0.0009727413;
                        }
                    }
                } else {
                    if (input[1] < 5.0) {
                        if (input[2] < 2.0) {
                            var13 = 0.0012610853;
                        } else {
                            var13 = -0.00013018996;
                        }
                    } else {
                        var13 = 0.0025867939;
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        if (input[2] < 5.0) {
                            var13 = -0.0003780047;
                        } else {
                            var13 = -0.000073027615;
                        }
                    } else {
                        var13 = 0.0022968126;
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var13 = -0.0002204631;
                        } else {
                            var13 = 0.0025206178;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var13 = 0.000051204646;
                        } else {
                            var13 = -0.0020477676;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var13 = 0.0015556455;
                    } else {
                        if (input[0] < 23.0) {
                            var13 = -0.00001860857;
                        } else {
                            var13 = -0.0013088584;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var13 = 0.0043929024;
                    } else {
                        var13 = 0.0010426443;
                    }
                }
            }
        }
        double var14;
        if (input[0] < 66.0) {
            if (input[1] < 2.0) {
                if (input[3] < 1.33) {
                    if (input[0] < 6.0) {
                        var14 = 0.0003413713;
                    } else {
                        if (input[2] < 3.0) {
                            var14 = 0.00044855103;
                        } else {
                            var14 = 0.0007236717;
                        }
                    }
                } else {
                    if (input[3] < 4.83) {
                        if (input[2] < 4.0) {
                            var14 = -0.000020085925;
                        } else {
                            var14 = -0.00055792695;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var14 = -0.00026103258;
                        } else {
                            var14 = 0.0018450551;
                        }
                    }
                }
            } else {
                if (input[3] < 1.57) {
                    if (input[1] < 3.0) {
                        if (input[2] < 5.0) {
                            var14 = -0.00020745663;
                        } else {
                            var14 = -0.0010231131;
                        }
                    } else {
                        if (input[3] < 1.06) {
                            var14 = -0.0010925529;
                        } else {
                            var14 = -0.00007814254;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.9) {
                            var14 = 0.0016527327;
                        } else {
                            var14 = -0.00057942007;
                        }
                    } else {
                        if (input[0] < 17.0) {
                            var14 = 0.0005974471;
                        } else {
                            var14 = 0.00019469368;
                        }
                    }
                }
            }
        } else {
            if (input[1] < 2.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 5.0) {
                        if (input[3] < 3.22) {
                            var14 = 0.00045919334;
                        } else {
                            var14 = -0.00024217139;
                        }
                    } else {
                        if (input[3] < 3.82) {
                            var14 = 0.00063573004;
                        } else {
                            var14 = 0.00284615;
                        }
                    }
                } else {
                    if (input[3] < 1.47) {
                        if (input[3] < 1.42) {
                            var14 = 0.0009344169;
                        } else {
                            var14 = 0.00022330433;
                        }
                    } else {
                        if (input[3] < 1.82) {
                            var14 = -0.0017315246;
                        } else {
                            var14 = 0.00003478077;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 1.74) {
                        if (input[3] < 1.32) {
                            var14 = 0.0012291045;
                        } else {
                            var14 = 0.00021710408;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var14 = -0.00013083853;
                        } else {
                            var14 = -0.001576622;
                        }
                    }
                } else {
                    if (input[3] < 1.37) {
                        if (input[2] < 7.0) {
                            var14 = -0.0019721738;
                        } else {
                            var14 = -0.0006962914;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var14 = -0.00043489115;
                        } else {
                            var14 = 0.0001622893;
                        }
                    }
                }
            }
        }
        double var15;
        if (input[3] < 4.17) {
            if (input[3] < 4.03) {
                if (input[3] < 3.86) {
                    if (input[1] < 5.0) {
                        if (input[3] < 3.58) {
                            var15 = -0.00007184018;
                        } else {
                            var15 = -0.00048341058;
                        }
                    } else {
                        if (input[3] < 3.69) {
                            var15 = 0.0001267059;
                        } else {
                            var15 = 0.0014444256;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[2] < 4.0) {
                            var15 = 0.00079777435;
                        } else {
                            var15 = -0.00048118076;
                        }
                    } else {
                        if (input[0] < 34.0) {
                            var15 = 0.0022581338;
                        } else {
                            var15 = 0.0008252482;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[4] < 2.0) {
                            var15 = -0.00028834344;
                        } else {
                            var15 = 0.0011555637;
                        }
                    } else {
                        if (input[0] < 63.0) {
                            var15 = -0.00038791087;
                        } else {
                            var15 = 0.0005068943;
                        }
                    }
                } else {
                    if (input[0] < 80.0) {
                        if (input[2] < 10.0) {
                            var15 = -0.0025981418;
                        } else {
                            var15 = 0.00068947475;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var15 = -0.0007867291;
                        } else {
                            var15 = 0.003692643;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[0] < 56.0) {
                            var15 = -0.00031033746;
                        } else {
                            var15 = 0.00022022713;
                        }
                    } else {
                        if (input[3] < 4.35) {
                            var15 = -0.0005970801;
                        } else {
                            var15 = 0.0018529715;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[1] < 2.0) {
                            var15 = 0.0006066865;
                        } else {
                            var15 = -0.0000026704674;
                        }
                    } else {
                        if (input[3] < 4.7) {
                            var15 = 0.000006715934;
                        } else {
                            var15 = -0.0013243918;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 3.0) {
                        if (input[3] < 4.21) {
                            var15 = 0.003040781;
                        } else {
                            var15 = 0.0007823002;
                        }
                    } else {
                        if (input[0] < 33.0) {
                            var15 = 0.0007352865;
                        } else {
                            var15 = -0.0035556157;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 4.4) {
                            var15 = 0.0007347696;
                        } else {
                            var15 = -0.002024758;
                        }
                    } else {
                        if (input[3] < 4.52) {
                            var15 = 0.0011087278;
                        } else {
                            var15 = 0.0038002736;
                        }
                    }
                }
            }
        }
        double var16;
        if (input[3] < 4.93) {
            if (input[0] < 89.0) {
                if (input[3] < 2.01) {
                    if (input[3] < 1.93) {
                        if (input[3] < 1.85) {
                            var16 = -0.00010191977;
                        } else {
                            var16 = 0.00080789934;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var16 = -0.0026938329;
                        } else {
                            var16 = -0.000846042;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 2.73) {
                            var16 = -0.00087969465;
                        } else {
                            var16 = 0.000014883187;
                        }
                    } else {
                        if (input[3] < 2.78) {
                            var16 = 0.00038254212;
                        } else {
                            var16 = 0.000032066364;
                        }
                    }
                }
            } else {
                if (input[3] < 4.76) {
                    if (input[1] < 2.0) {
                        if (input[2] < 7.0) {
                            var16 = 0.00056952395;
                        } else {
                            var16 = -0.000591283;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var16 = -0.00005905004;
                        } else {
                            var16 = -0.0006304743;
                        }
                    }
                } else {
                    if (input[1] < 5.0) {
                        if (input[2] < 1.0) {
                            var16 = 0.0017596841;
                        } else {
                            var16 = 0.000038092137;
                        }
                    } else {
                        var16 = 0.002368482;
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        if (input[2] < 5.0) {
                            var16 = -0.00036164522;
                        } else {
                            var16 = -0.00007984638;
                        }
                    } else {
                        var16 = 0.0021445071;
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var16 = -0.00019668681;
                        } else {
                            var16 = 0.0023714483;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var16 = 0.00004351054;
                        } else {
                            var16 = -0.0019103527;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var16 = 0.0014510691;
                    } else {
                        if (input[0] < 23.0) {
                            var16 = -0.0000136554245;
                        } else {
                            var16 = -0.0012263894;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var16 = 0.0041363123;
                    } else {
                        var16 = 0.0009978613;
                    }
                }
            }
        }
        double var17;
        if (input[3] < 4.93) {
            if (input[0] < 69.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 1.33) {
                        if (input[0] < 27.0) {
                            var17 = 0.00048750566;
                        } else {
                            var17 = 0.00077559886;
                        }
                    } else {
                        if (input[2] < 3.0) {
                            var17 = 0.00008835595;
                        } else {
                            var17 = -0.0004670602;
                        }
                    }
                } else {
                    if (input[3] < 1.57) {
                        if (input[0] < 28.0) {
                            var17 = -0.000101288686;
                        } else {
                            var17 = -0.00047374135;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var17 = -0.00032176412;
                        } else {
                            var17 = 0.00026178066;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 4.0) {
                        if (input[4] < 5.0) {
                            var17 = 0.00012125288;
                        } else {
                            var17 = 0.0012152084;
                        }
                    } else {
                        if (input[3] < 1.48) {
                            var17 = 0.00077083765;
                        } else {
                            var17 = -0.00027161156;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.74) {
                            var17 = 0.00076197344;
                        } else {
                            var17 = -0.0008029057;
                        }
                    } else {
                        if (input[3] < 1.37) {
                            var17 = -0.0012419897;
                        } else {
                            var17 = 0.000026688018;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        if (input[2] < 5.0) {
                            var17 = -0.0003495892;
                        } else {
                            var17 = -0.000077849625;
                        }
                    } else {
                        if (input[2] < 2.0) {
                            var17 = 0.0008979519;
                        } else {
                            var17 = 0.0022232698;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var17 = -0.000188257;
                        } else {
                            var17 = 0.0022825152;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var17 = 0.000041495903;
                        } else {
                            var17 = -0.0018243933;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var17 = 0.0014147938;
                    } else {
                        if (input[0] < 23.0) {
                            var17 = -0.000013315678;
                        } else {
                            var17 = -0.0011957288;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var17 = 0.0039639752;
                    } else {
                        var17 = 0.0009645939;
                    }
                }
            }
        }
        double var18;
        if (input[3] < 4.17) {
            if (input[3] < 4.03) {
                if (input[3] < 3.86) {
                    if (input[1] < 5.0) {
                        if (input[3] < 3.58) {
                            var18 = -0.00006629119;
                        } else {
                            var18 = -0.00046002623;
                        }
                    } else {
                        if (input[3] < 3.69) {
                            var18 = 0.00012214754;
                        } else {
                            var18 = 0.0013728194;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[2] < 4.0) {
                            var18 = 0.00076922576;
                        } else {
                            var18 = -0.0004572776;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var18 = 0.00013540105;
                        } else {
                            var18 = 0.001626466;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[4] < 2.0) {
                            var18 = -0.00028271278;
                        } else {
                            var18 = 0.0011198045;
                        }
                    } else {
                        if (input[0] < 28.0) {
                            var18 = -0.0007295923;
                        } else {
                            var18 = 0.00006328869;
                        }
                    }
                } else {
                    if (input[0] < 80.0) {
                        if (input[2] < 10.0) {
                            var18 = -0.0024771744;
                        } else {
                            var18 = 0.0006565392;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var18 = -0.0007371627;
                        } else {
                            var18 = 0.0035676004;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[0] < 56.0) {
                            var18 = -0.00029832285;
                        } else {
                            var18 = 0.00022995782;
                        }
                    } else {
                        if (input[3] < 4.35) {
                            var18 = -0.0005661586;
                        } else {
                            var18 = 0.0017376805;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.83) {
                            var18 = 0.00021879715;
                        } else {
                            var18 = 0.0014847129;
                        }
                    } else {
                        if (input[3] < 4.7) {
                            var18 = 0.000025617312;
                        } else {
                            var18 = -0.0008833425;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 3.0) {
                        if (input[3] < 4.21) {
                            var18 = 0.0029181552;
                        } else {
                            var18 = 0.00072549906;
                        }
                    } else {
                        if (input[0] < 33.0) {
                            var18 = 0.0006109178;
                        } else {
                            var18 = -0.0033775808;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 4.4) {
                            var18 = 0.00070541253;
                        } else {
                            var18 = -0.0019305063;
                        }
                    } else {
                        if (input[3] < 4.42) {
                            var18 = 0.00045975327;
                        } else {
                            var18 = 0.0031186573;
                        }
                    }
                }
            }
        }
        double var19;
        if (input[0] < 89.0) {
            if (input[3] < 3.2) {
                if (input[2] < 4.0) {
                    if (input[0] < 1.0) {
                        if (input[3] < 2.78) {
                            var19 = 0.000049018367;
                        } else {
                            var19 = 0.002735905;
                        }
                    } else {
                        if (input[3] < 1.33) {
                            var19 = 0.00016827876;
                        } else {
                            var19 = -0.0003997456;
                        }
                    }
                } else {
                    if (input[3] < 2.78) {
                        if (input[3] < 2.59) {
                            var19 = 0.00007048484;
                        } else {
                            var19 = 0.0011925409;
                        }
                    } else {
                        if (input[3] < 2.8) {
                            var19 = -0.002360808;
                        } else {
                            var19 = -0.0002857039;
                        }
                    }
                }
            } else {
                if (input[2] < 10.0) {
                    if (input[3] < 3.33) {
                        if (input[2] < 7.0) {
                            var19 = 0.0012849177;
                        } else {
                            var19 = -0.00047341734;
                        }
                    } else {
                        if (input[3] < 3.79) {
                            var19 = -0.00018178062;
                        } else {
                            var19 = 0.00013409156;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[1] < 3.0) {
                            var19 = 0.00042433912;
                        } else {
                            var19 = -0.00073661143;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var19 = -0.000042733653;
                        } else {
                            var19 = 0.0027738695;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.76) {
                if (input[3] < 1.52) {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.3) {
                            var19 = 0.0015906735;
                        } else {
                            var19 = 0.00071817153;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var19 = 0.00035890905;
                        } else {
                            var19 = -0.0016433941;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.07) {
                            var19 = -0.00051769;
                        } else {
                            var19 = 0.00030002184;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var19 = 0.0003150494;
                        } else {
                            var19 = -0.00075024477;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 4.86) {
                        var19 = 0.0004064232;
                    } else {
                        if (input[2] < 4.0) {
                            var19 = -0.00037169456;
                        } else {
                            var19 = -0.00005200307;
                        }
                    }
                } else {
                    if (input[0] < 93.0) {
                        var19 = 0.0021093225;
                    } else {
                        if (input[0] < 94.0) {
                            var19 = -0.0008521676;
                        } else {
                            var19 = 0.0011777807;
                        }
                    }
                }
            }
        }
        double var20;
        if (input[3] < 4.93) {
            if (input[0] < 12.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 2.14) {
                        if (input[3] < 1.54) {
                            var20 = 0.0004672289;
                        } else {
                            var20 = -0.0016733541;
                        }
                    } else {
                        if (input[3] < 3.41) {
                            var20 = 0.00027366084;
                        } else {
                            var20 = -0.000605803;
                        }
                    }
                } else {
                    if (input[4] < 5.0) {
                        if (input[3] < 3.8) {
                            var20 = 0.00023672271;
                        } else {
                            var20 = -0.00054912927;
                        }
                    } else {
                        if (input[3] < 3.53) {
                            var20 = 0.00029483213;
                        } else {
                            var20 = 0.0020144815;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[0] < 33.0) {
                            var20 = -0.00020450102;
                        } else {
                            var20 = 0.0004721262;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var20 = 0.00001982363;
                        } else {
                            var20 = -0.0005102743;
                        }
                    }
                } else {
                    if (input[3] < 1.25) {
                        if (input[1] < 2.0) {
                            var20 = 0.0007499311;
                        } else {
                            var20 = -0.0010560536;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var20 = -0.000387191;
                        } else {
                            var20 = 0.0001685354;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        var20 = -0.00032981634;
                    } else {
                        if (input[2] < 2.0) {
                            var20 = 0.0007727146;
                        } else {
                            var20 = 0.0020492913;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var20 = -0.00017692106;
                        } else {
                            var20 = 0.0021267326;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var20 = 0.00006801145;
                        } else {
                            var20 = -0.0017076802;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var20 = 0.0013579369;
                    } else {
                        if (input[0] < 23.0) {
                            var20 = 0.00003193021;
                        } else {
                            var20 = -0.0011164903;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var20 = 0.0037471612;
                    } else {
                        var20 = 0.00089936255;
                    }
                }
            }
        }
        double var21;
        if (input[0] < 68.0) {
            if (input[1] < 2.0) {
                if (input[3] < 1.35) {
                    if (input[0] < 28.0) {
                        if (input[0] < 27.0) {
                            var21 = 0.0004562782;
                        } else {
                            var21 = 0.00009831041;
                        }
                    } else {
                        if (input[2] < 2.0) {
                            var21 = 0.00018823445;
                        } else {
                            var21 = 0.00070155633;
                        }
                    }
                } else {
                    if (input[3] < 2.32) {
                        if (input[2] < 4.0) {
                            var21 = -0.00003997025;
                        } else {
                            var21 = -0.0010879084;
                        }
                    } else {
                        if (input[3] < 3.58) {
                            var21 = 0.00025337012;
                        } else {
                            var21 = -0.00039102635;
                        }
                    }
                }
            } else {
                if (input[3] < 1.57) {
                    if (input[1] < 3.0) {
                        if (input[3] < 1.4) {
                            var21 = -0.0007891929;
                        } else {
                            var21 = 0.0000252615;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var21 = -0.00044985022;
                        } else {
                            var21 = 0.00008401069;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.9) {
                            var21 = 0.0015842665;
                        } else {
                            var21 = -0.0005076934;
                        }
                    } else {
                        if (input[2] < 10.0) {
                            var21 = 0.00019470428;
                        } else {
                            var21 = 0.0008814246;
                        }
                    }
                }
            }
        } else {
            if (input[1] < 2.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 5.0) {
                        if (input[3] < 1.91) {
                            var21 = 0.00065607514;
                        } else {
                            var21 = -0.00005632475;
                        }
                    } else {
                        if (input[3] < 2.59) {
                            var21 = 0.00016875054;
                        } else {
                            var21 = 0.0017524846;
                        }
                    }
                } else {
                    if (input[3] < 1.47) {
                        if (input[3] < 1.3) {
                            var21 = 0.0008223974;
                        } else {
                            var21 = 0.0003180663;
                        }
                    } else {
                        if (input[3] < 1.82) {
                            var21 = -0.0015860957;
                        } else {
                            var21 = 0.000078440855;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 1.82) {
                        if (input[0] < 91.0) {
                            var21 = 0.00018248342;
                        } else {
                            var21 = 0.0012016812;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var21 = -0.000040021765;
                        } else {
                            var21 = -0.0014322622;
                        }
                    }
                } else {
                    if (input[3] < 1.37) {
                        if (input[2] < 9.0) {
                            var21 = -0.0015059713;
                        } else {
                            var21 = -0.00032827305;
                        }
                    } else {
                        if (input[3] < 3.59) {
                            var21 = -0.00014668857;
                        } else {
                            var21 = 0.0003009266;
                        }
                    }
                }
            }
        }
        double var22;
        if (input[3] < 4.93) {
            if (input[0] < 26.0) {
                if (input[4] < 4.0) {
                    if (input[2] < 10.0) {
                        if (input[0] < 1.0) {
                            var22 = 0.0013233535;
                        } else {
                            var22 = -0.000099379686;
                        }
                    } else {
                        if (input[3] < 1.12) {
                            var22 = 0.0013691128;
                        } else {
                            var22 = -0.0010094682;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.33) {
                            var22 = -0.000023352948;
                        } else {
                            var22 = -0.0012489808;
                        }
                    } else {
                        if (input[3] < 3.45) {
                            var22 = 0.00012594821;
                        } else {
                            var22 = 0.0013041412;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 1.33) {
                        if (input[0] < 86.0) {
                            var22 = 0.00040823125;
                        } else {
                            var22 = 0.001379378;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var22 = 0.00030122817;
                        } else {
                            var22 = -0.00044546192;
                        }
                    }
                } else {
                    if (input[3] < 1.4) {
                        if (input[1] < 2.0) {
                            var22 = 0.00066241407;
                        } else {
                            var22 = -0.0009610235;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var22 = -0.00036052868;
                        } else {
                            var22 = 0.0001713969;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        var22 = -0.00030278863;
                    } else {
                        if (input[2] < 2.0) {
                            var22 = 0.000724268;
                        } else {
                            var22 = 0.0019679428;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var22 = -0.00016095639;
                        } else {
                            var22 = 0.002060014;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var22 = 0.000055514916;
                        } else {
                            var22 = -0.0016440917;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var22 = 0.0013337613;
                    } else {
                        if (input[0] < 23.0) {
                            var22 = 0.000040906667;
                        } else {
                            var22 = -0.0010905504;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var22 = 0.0035829307;
                    } else {
                        var22 = 0.00086112815;
                    }
                }
            }
        }
        double var23;
        if (input[0] < 89.0) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[1] < 4.0) {
                        if (input[4] < 5.0) {
                            var23 = 0.000094897136;
                        } else {
                            var23 = -0.00010616274;
                        }
                    } else {
                        if (input[2] < 8.0) {
                            var23 = -0.00016043764;
                        } else {
                            var23 = -0.0008694155;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[0] < 52.0) {
                            var23 = 0.00013616812;
                        } else {
                            var23 = -0.0004060587;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var23 = 0.00031481992;
                        } else {
                            var23 = 0.003992992;
                        }
                    }
                }
            } else {
                if (input[4] < 5.0) {
                    if (input[3] < 3.75) {
                        if (input[3] < 3.38) {
                            var23 = -0.000046880446;
                        } else {
                            var23 = 0.0014728989;
                        }
                    } else {
                        if (input[3] < 4.27) {
                            var23 = -0.0010241332;
                        } else {
                            var23 = 0.000008761977;
                        }
                    }
                } else {
                    if (input[0] < 34.0) {
                        if (input[2] < 8.0) {
                            var23 = 0.0015166212;
                        } else {
                            var23 = 0.00019390708;
                        }
                    } else {
                        if (input[2] < 5.0) {
                            var23 = -0.0002895379;
                        } else {
                            var23 = 0.0004402088;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.76) {
                if (input[3] < 1.52) {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.3) {
                            var23 = 0.0014177999;
                        } else {
                            var23 = 0.0006531812;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var23 = 0.0003401589;
                        } else {
                            var23 = -0.0014572685;
                        }
                    }
                } else {
                    if (input[4] < 7.0) {
                        if (input[2] < 7.0) {
                            var23 = -0.000073585834;
                        } else {
                            var23 = -0.00058301457;
                        }
                    } else {
                        if (input[3] < 3.18) {
                            var23 = 0.0002178495;
                        } else {
                            var23 = -0.0013544535;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 4.86) {
                        var23 = 0.000380978;
                    } else {
                        if (input[2] < 4.0) {
                            var23 = -0.00037264425;
                        } else {
                            var23 = -0.000071632865;
                        }
                    }
                } else {
                    if (input[0] < 93.0) {
                        if (input[0] < 90.0) {
                            var23 = 0.00059083104;
                        } else {
                            var23 = 0.0021912248;
                        }
                    } else {
                        if (input[0] < 94.0) {
                            var23 = -0.0008468747;
                        } else {
                            var23 = 0.001131065;
                        }
                    }
                }
            }
        }
        double var24;
        if (input[3] < 4.93) {
            if (input[0] < 12.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 2.14) {
                        if (input[3] < 1.54) {
                            var24 = 0.00043383727;
                        } else {
                            var24 = -0.0015794883;
                        }
                    } else {
                        if (input[3] < 3.41) {
                            var24 = 0.0002552437;
                        } else {
                            var24 = -0.00051495846;
                        }
                    }
                } else {
                    if (input[4] < 5.0) {
                        if (input[3] < 3.8) {
                            var24 = 0.0002176567;
                        } else {
                            var24 = -0.0005299018;
                        }
                    } else {
                        if (input[3] < 3.53) {
                            var24 = 0.0002546387;
                        } else {
                            var24 = 0.0018210212;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[4] < 4.0) {
                            var24 = -0.0000733172;
                        } else {
                            var24 = 0.00050019537;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var24 = 0.000037186626;
                        } else {
                            var24 = -0.0004648248;
                        }
                    }
                } else {
                    if (input[3] < 1.25) {
                        if (input[1] < 2.0) {
                            var24 = 0.0006429266;
                        } else {
                            var24 = -0.000931637;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var24 = -0.00033455362;
                        } else {
                            var24 = 0.0001464869;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        var24 = -0.00029499232;
                    } else {
                        if (input[2] < 2.0) {
                            var24 = 0.0006920457;
                        } else {
                            var24 = 0.0018812492;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var24 = -0.0001526543;
                        } else {
                            var24 = 0.0019849122;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var24 = 0.000054437773;
                        } else {
                            var24 = -0.0015685654;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var24 = 0.0013030708;
                    } else {
                        if (input[0] < 23.0) {
                            var24 = 0.000042533877;
                        } else {
                            var24 = -0.0010531306;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var24 = 0.0034094453;
                    } else {
                        var24 = 0.0008007288;
                    }
                }
            }
        }
        double var25;
        if (input[0] < 89.0) {
            if (input[3] < 3.2) {
                if (input[2] < 4.0) {
                    if (input[0] < 1.0) {
                        if (input[3] < 2.78) {
                            var25 = 0.000019497176;
                        } else {
                            var25 = 0.0025579194;
                        }
                    } else {
                        if (input[3] < 1.33) {
                            var25 = 0.00017095327;
                        } else {
                            var25 = -0.0003586955;
                        }
                    }
                } else {
                    if (input[3] < 2.78) {
                        if (input[3] < 2.59) {
                            var25 = 0.00007595165;
                        } else {
                            var25 = 0.0011122603;
                        }
                    } else {
                        if (input[3] < 2.8) {
                            var25 = -0.0022751975;
                        } else {
                            var25 = -0.00029363725;
                        }
                    }
                }
            } else {
                if (input[2] < 10.0) {
                    if (input[3] < 3.33) {
                        if (input[2] < 7.0) {
                            var25 = 0.0012235302;
                        } else {
                            var25 = -0.00046265443;
                        }
                    } else {
                        if (input[3] < 3.79) {
                            var25 = -0.00019452468;
                        } else {
                            var25 = 0.00012012654;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[1] < 3.0) {
                            var25 = 0.00042320575;
                        } else {
                            var25 = -0.0006989494;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var25 = -0.0000790855;
                        } else {
                            var25 = 0.0025135677;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.76) {
                if (input[3] < 1.52) {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.3) {
                            var25 = 0.0013662414;
                        } else {
                            var25 = 0.00064493826;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var25 = 0.00031918188;
                        } else {
                            var25 = -0.001369461;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.07) {
                            var25 = -0.00047036746;
                        } else {
                            var25 = 0.00028547738;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var25 = 0.00031771528;
                        } else {
                            var25 = -0.0006743488;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 4.86) {
                        var25 = 0.00036256612;
                    } else {
                        if (input[2] < 4.0) {
                            var25 = -0.00035990478;
                        } else {
                            var25 = -0.000074128315;
                        }
                    }
                } else {
                    if (input[0] < 93.0) {
                        if (input[3] < 4.93) {
                            var25 = 0.002324915;
                        } else {
                            var25 = 0.00085163116;
                        }
                    } else {
                        if (input[0] < 94.0) {
                            var25 = -0.0008293629;
                        } else {
                            var25 = 0.0010748435;
                        }
                    }
                }
            }
        }
        double var26;
        if (input[3] < 4.93) {
            if (input[0] < 71.0) {
                if (input[2] < 10.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 1.33) {
                            var26 = 0.0005341169;
                        } else {
                            var26 = -0.00025437452;
                        }
                    } else {
                        if (input[3] < 1.43) {
                            var26 = -0.00027835552;
                        } else {
                            var26 = 0.00010768662;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 35.0) {
                            var26 = -0.00072960905;
                        } else {
                            var26 = 0.000064997;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var26 = 0.00013002616;
                        } else {
                            var26 = 0.0019938159;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[1] < 4.0) {
                        if (input[3] < 2.3) {
                            var26 = -0.00023017485;
                        } else {
                            var26 = 0.00045503533;
                        }
                    } else {
                        if (input[3] < 3.69) {
                            var26 = -0.0006058213;
                        } else {
                            var26 = 0.00035880506;
                        }
                    }
                } else {
                    if (input[3] < 2.97) {
                        if (input[3] < 2.65) {
                            var26 = -0.00008778933;
                        } else {
                            var26 = 0.0004857869;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var26 = -0.0013550911;
                        } else {
                            var26 = -0.000091889;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        var26 = -0.0002884388;
                    } else {
                        if (input[2] < 2.0) {
                            var26 = 0.00065277814;
                        } else {
                            var26 = 0.0017902077;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var26 = -0.00015126212;
                        } else {
                            var26 = 0.0019059748;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var26 = 0.00004804986;
                        } else {
                            var26 = -0.0015023804;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var26 = 0.0012674928;
                    } else {
                        if (input[0] < 23.0) {
                            var26 = 0.00003846884;
                        } else {
                            var26 = -0.0010248184;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var26 = 0.0032623808;
                    } else {
                        var26 = 0.0007578453;
                    }
                }
            }
        }
        double var27;
        if (input[3] < 4.93) {
            if (input[0] < 12.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 2.14) {
                        if (input[3] < 1.54) {
                            var27 = 0.00040226764;
                        } else {
                            var27 = -0.0014930378;
                        }
                    } else {
                        if (input[3] < 3.41) {
                            var27 = 0.0002436721;
                        } else {
                            var27 = -0.00048205705;
                        }
                    }
                } else {
                    if (input[3] < 1.42) {
                        if (input[0] < 5.0) {
                            var27 = -0.0011784573;
                        } else {
                            var27 = -0.00014299978;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var27 = -0.000030917206;
                        } else {
                            var27 = 0.0007709436;
                        }
                    }
                }
            } else {
                if (input[2] < 9.0) {
                    if (input[0] < 13.0) {
                        if (input[3] < 2.77) {
                            var27 = -0.000432686;
                        } else {
                            var27 = -0.0012433914;
                        }
                    } else {
                        if (input[3] < 4.5) {
                            var27 = -0.000087225555;
                        } else {
                            var27 = 0.00023906531;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[4] < 6.0) {
                            var27 = -0.000014342435;
                        } else {
                            var27 = -0.00074976316;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var27 = -0.00015484891;
                        } else {
                            var27 = 0.0025570267;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 3.0) {
                        if (input[2] < 5.0) {
                            var27 = -0.00031578142;
                        } else {
                            var27 = -0.00008156896;
                        }
                    } else {
                        if (input[2] < 2.0) {
                            var27 = 0.0006310185;
                        } else {
                            var27 = 0.0017118827;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var27 = -0.00014478138;
                        } else {
                            var27 = 0.0018345028;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var27 = 0.000045813835;
                        } else {
                            var27 = -0.0014347673;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 2.0) {
                        var27 = 0.001235807;
                    } else {
                        if (input[0] < 23.0) {
                            var27 = 0.000037509202;
                        } else {
                            var27 = -0.0009992004;
                        }
                    }
                } else {
                    if (input[0] < 35.0) {
                        var27 = 0.0031264424;
                    } else {
                        var27 = 0.00073258876;
                    }
                }
            }
        }
        return 0.5 + (subroutine0(input) + var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12 + var13 + var14 + var15 + var16 + var17 + var18 + var19 + var20 + var21 + var22 + var23 + var24 + var25 + var26 + var27);
    }
    public static double subroutine0(double[] input) {
        double var0;
        if (input[3] < 3.79) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[0] < 12.0) {
                        if (input[1] < 2.0) {
                            var0 = -0.000979124;
                        } else {
                            var0 = 0.00071678025;
                        }
                    } else {
                        if (input[0] < 80.0) {
                            var0 = -0.0005434439;
                        } else {
                            var0 = -0.0011397516;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[0] < 40.0) {
                            var0 = 0.0000023079388;
                        } else {
                            var0 = -0.0010569454;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var0 = -0.00017050006;
                        } else {
                            var0 = 0.005651658;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 87.0) {
                        if (input[3] < 2.64) {
                            var0 = -0.0007717234;
                        } else {
                            var0 = 0.00038109356;
                        }
                    } else {
                        if (input[3] < 1.82) {
                            var0 = -0.00037202984;
                        } else {
                            var0 = -0.0031851341;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.85) {
                            var0 = 0.0014387569;
                        } else {
                            var0 = -0.0027594108;
                        }
                    } else {
                        if (input[3] < 1.44) {
                            var0 = -0.000866675;
                        } else {
                            var0 = 0.002005643;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 4.36) {
                            var0 = 0.00057678664;
                        } else {
                            var0 = -0.00023643998;
                        }
                    } else {
                        if (input[3] < 4.35) {
                            var0 = -0.00078259874;
                        } else {
                            var0 = 0.0032800024;
                        }
                    }
                } else {
                    if (input[3] < 3.82) {
                        if (input[4] < 4.0) {
                            var0 = -0.000086772445;
                        } else {
                            var0 = 0.004472687;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var0 = 0.00016579223;
                        } else {
                            var0 = -0.00035385226;
                        }
                    }
                }
            } else {
                if (input[3] < 4.86) {
                    if (input[2] < 4.0) {
                        if (input[1] < 2.0) {
                            var0 = 0.0019513827;
                        } else {
                            var0 = -0.0025000658;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var0 = -0.0025100056;
                        } else {
                            var0 = 0.003354878;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 2.0) {
                            var0 = 0.0033426823;
                        } else {
                            var0 = -0.0011528771;
                        }
                    } else {
                        var0 = 0.008462924;
                    }
                }
            }
        }
        double var1;
        if (input[3] < 3.2) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[0] < 9.0) {
                        if (input[3] < 1.42) {
                            var1 = -0.001145874;
                        } else {
                            var1 = 0.0005534177;
                        }
                    } else {
                        if (input[3] < 2.06) {
                            var1 = -0.0008972021;
                        } else {
                            var1 = -0.0005237507;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[0] < 43.0) {
                            var1 = -0.000028391969;
                        } else {
                            var1 = -0.0011633089;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var1 = 0.0002916223;
                        } else {
                            var1 = 0.0048172576;
                        }
                    }
                }
            } else {
                if (input[4] < 2.0) {
                    if (input[3] < 1.88) {
                        if (input[0] < 35.0) {
                            var1 = 0.003059386;
                        } else {
                            var1 = -0.00033013592;
                        }
                    } else {
                        if (input[3] < 2.67) {
                            var1 = -0.004591063;
                        } else {
                            var1 = 0.00053872465;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.92) {
                            var1 = -0.00070696016;
                        } else {
                            var1 = 0.00032558627;
                        }
                    } else {
                        if (input[3] < 1.5) {
                            var1 = -0.0006897165;
                        } else {
                            var1 = 0.0018525182;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 92.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 4.91) {
                        if (input[2] < 4.0) {
                            var1 = 0.0006085985;
                        } else {
                            var1 = -0.0010917963;
                        }
                    } else {
                        if (input[4] < 3.0) {
                            var1 = -0.00036984682;
                        } else {
                            var1 = 0.0039796988;
                        }
                    }
                } else {
                    if (input[0] < 17.0) {
                        if (input[4] < 4.0) {
                            var1 = 0.00024043368;
                        } else {
                            var1 = 0.0029178488;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var1 = -0.00038774675;
                        } else {
                            var1 = 0.0009249933;
                        }
                    }
                }
            } else {
                if (input[4] < 6.0) {
                    if (input[1] < 4.0) {
                        if (input[3] < 4.91) {
                            var1 = 0.00027752304;
                        } else {
                            var1 = 0.0033022761;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var1 = -0.0026398932;
                        } else {
                            var1 = -0.000048671453;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[1] < 2.0) {
                            var1 = 0.0012651086;
                        } else {
                            var1 = -0.005773876;
                        }
                    } else {
                        if (input[3] < 4.44) {
                            var1 = -0.002128397;
                        } else {
                            var1 = 0.0018595711;
                        }
                    }
                }
            }
        }
        double var2;
        if (input[3] < 3.79) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[0] < 19.0) {
                        if (input[1] < 2.0) {
                            var2 = -0.0009063758;
                        } else {
                            var2 = 0.00033548157;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var2 = -0.00032538746;
                        } else {
                            var2 = -0.00088203995;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[4] < 6.0) {
                            var2 = -0.0002281518;
                        } else {
                            var2 = -0.0013170362;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var2 = -0.00018492476;
                        } else {
                            var2 = 0.0051712226;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 87.0) {
                        if (input[3] < 2.64) {
                            var2 = -0.000694318;
                        } else {
                            var2 = 0.00035385543;
                        }
                    } else {
                        if (input[3] < 1.82) {
                            var2 = -0.00033021273;
                        } else {
                            var2 = -0.0029234057;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 43.0) {
                            var2 = 0.000791866;
                        } else {
                            var2 = -0.0012180328;
                        }
                    } else {
                        if (input[3] < 3.47) {
                            var2 = 0.0012539646;
                        } else {
                            var2 = 0.0047702487;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 4.36) {
                            var2 = 0.0005517821;
                        } else {
                            var2 = -0.00021755682;
                        }
                    } else {
                        if (input[3] < 4.35) {
                            var2 = -0.0007456473;
                        } else {
                            var2 = 0.0030942827;
                        }
                    }
                } else {
                    if (input[3] < 3.82) {
                        if (input[4] < 4.0) {
                            var2 = -0.00008359254;
                        } else {
                            var2 = 0.0042415243;
                        }
                    } else {
                        if (input[3] < 4.7) {
                            var2 = 0.00008130704;
                        } else {
                            var2 = -0.00048130914;
                        }
                    }
                }
            } else {
                if (input[3] < 4.81) {
                    if (input[2] < 9.0) {
                        if (input[0] < 73.0) {
                            var2 = 0.001011313;
                        } else {
                            var2 = -0.0019324602;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var2 = -0.0001949966;
                        } else {
                            var2 = 0.008463762;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 4.98) {
                            var2 = -0.0008209467;
                        } else {
                            var2 = 0.0051484867;
                        }
                    } else {
                        if (input[2] < 1.0) {
                            var2 = -0.0008057475;
                        } else {
                            var2 = 0.008204611;
                        }
                    }
                }
            }
        }
        double var3;
        if (input[3] < 2.47) {
            if (input[0] < 48.0) {
                if (input[2] < 4.0) {
                    if (input[3] < 1.74) {
                        if (input[3] < 1.4) {
                            var3 = -0.0006131241;
                        } else {
                            var3 = -0.0019767797;
                        }
                    } else {
                        if (input[0] < 10.0) {
                            var3 = 0.00084108644;
                        } else {
                            var3 = -0.0006007243;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 1.67) {
                            var3 = -0.0011667855;
                        } else {
                            var3 = -0.000033216853;
                        }
                    } else {
                        if (input[3] < 1.1) {
                            var3 = -0.0031232864;
                        } else {
                            var3 = 0.0010815421;
                        }
                    }
                }
            } else {
                if (input[0] < 76.0) {
                    if (input[0] < 75.0) {
                        if (input[3] < 2.01) {
                            var3 = -0.00079120975;
                        } else {
                            var3 = -0.00018681811;
                        }
                    } else {
                        if (input[3] < 1.65) {
                            var3 = -0.00010283986;
                        } else {
                            var3 = 0.0015590623;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 1.28) {
                            var3 = 0.00089067686;
                        } else {
                            var3 = -0.00086619036;
                        }
                    } else {
                        if (input[4] < 3.0) {
                            var3 = -0.001778629;
                        } else {
                            var3 = -0.00090150797;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 93.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 2.8) {
                        if (input[2] < 4.0) {
                            var3 = 0.00007925947;
                        } else {
                            var3 = -0.0027363426;
                        }
                    } else {
                        if (input[0] < 51.0) {
                            var3 = -0.0006473726;
                        } else {
                            var3 = 0.0000007455349;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 31.0) {
                            var3 = 0.00087635417;
                        } else {
                            var3 = 0.000021458838;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var3 = 0.0002236729;
                        } else {
                            var3 = 0.002866151;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 2.92) {
                        if (input[2] < 3.0) {
                            var3 = -0.00082847953;
                        } else {
                            var3 = -0.0019257239;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var3 = 0.0006963107;
                        } else {
                            var3 = -0.0001997446;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[1] < 2.0) {
                            var3 = 0.0023538365;
                        } else {
                            var3 = -0.0043459805;
                        }
                    } else {
                        if (input[3] < 3.66) {
                            var3 = -0.0018116491;
                        } else {
                            var3 = 0.00013754699;
                        }
                    }
                }
            }
        }
        double var4;
        if (input[3] < 4.17) {
            if (input[0] < 25.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 1.33) {
                        if (input[4] < 6.0) {
                            var4 = 0.00037585179;
                        } else {
                            var4 = -0.000021860003;
                        }
                    } else {
                        if (input[3] < 2.14) {
                            var4 = -0.0022485554;
                        } else {
                            var4 = -0.00061745965;
                        }
                    }
                } else {
                    if (input[3] < 1.43) {
                        if (input[3] < 1.07) {
                            var4 = -0.0019130412;
                        } else {
                            var4 = -0.00046969482;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var4 = -0.0010835913;
                        } else {
                            var4 = 0.0011507716;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[0] < 79.0) {
                            var4 = -0.00014944377;
                        } else {
                            var4 = 0.0014452792;
                        }
                    } else {
                        if (input[0] < 77.0) {
                            var4 = -0.00068696955;
                        } else {
                            var4 = -0.0017781816;
                        }
                    }
                } else {
                    if (input[3] < 1.4) {
                        if (input[1] < 2.0) {
                            var4 = 0.000749817;
                        } else {
                            var4 = -0.002204097;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var4 = -0.0013088111;
                        } else {
                            var4 = 0.00034528607;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[0] < 60.0) {
                            var4 = -0.00030108416;
                        } else {
                            var4 = 0.00023416358;
                        }
                    } else {
                        if (input[0] < 49.0) {
                            var4 = 0.0036717267;
                        } else {
                            var4 = 0.0003481165;
                        }
                    }
                } else {
                    if (input[3] < 4.7) {
                        if (input[1] < 4.0) {
                            var4 = 0.0005215242;
                        } else {
                            var4 = -0.00014251519;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var4 = 0.0015036884;
                        } else {
                            var4 = -0.00092043885;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[0] < 68.0) {
                        if (input[1] < 2.0) {
                            var4 = -0.0006139457;
                        } else {
                            var4 = 0.0024245253;
                        }
                    } else {
                        if (input[3] < 4.98) {
                            var4 = -0.0016925198;
                        } else {
                            var4 = 0.0039200187;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.81) {
                            var4 = -0.0050314027;
                        } else {
                            var4 = 0.004844842;
                        }
                    } else {
                        if (input[3] < 4.46) {
                            var4 = 0.0035730023;
                        } else {
                            var4 = 0.008054335;
                        }
                    }
                }
            }
        }
        double var5;
        if (input[3] < 3.79) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[0] < 12.0) {
                        if (input[1] < 2.0) {
                            var5 = -0.0008499785;
                        } else {
                            var5 = 0.00059917656;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var5 = -0.00028164245;
                        } else {
                            var5 = -0.0007456735;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[4] < 6.0) {
                            var5 = -0.00020443373;
                        } else {
                            var5 = -0.0012292735;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var5 = -0.00023694134;
                        } else {
                            var5 = 0.0048461966;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 3.56) {
                        if (input[3] < 2.64) {
                            var5 = -0.0006570692;
                        } else {
                            var5 = 0.0002701568;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var5 = 0.00047492087;
                        } else {
                            var5 = -0.0033557296;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 43.0) {
                            var5 = 0.00070675043;
                        } else {
                            var5 = -0.0011227248;
                        }
                    } else {
                        if (input[3] < 3.47) {
                            var5 = 0.0011719215;
                        } else {
                            var5 = 0.0044576144;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 4.3) {
                            var5 = 0.00057421153;
                        } else {
                            var5 = -0.00017477025;
                        }
                    } else {
                        if (input[3] < 4.25) {
                            var5 = -0.0011609996;
                        } else {
                            var5 = 0.0025861412;
                        }
                    }
                } else {
                    if (input[3] < 3.82) {
                        if (input[4] < 4.0) {
                            var5 = -0.00012576432;
                        } else {
                            var5 = 0.0039857305;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var5 = 0.000119457014;
                        } else {
                            var5 = -0.00040425776;
                        }
                    }
                }
            } else {
                if (input[3] < 4.86) {
                    if (input[2] < 4.0) {
                        if (input[1] < 2.0) {
                            var5 = 0.0018110945;
                        } else {
                            var5 = -0.002337624;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var5 = -0.0022914172;
                        } else {
                            var5 = 0.002905716;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 2.0) {
                            var5 = 0.0030457259;
                        } else {
                            var5 = -0.0011996309;
                        }
                    } else {
                        var5 = 0.007406797;
                    }
                }
            }
        }
        double var6;
        if (input[3] < 2.47) {
            if (input[0] < 48.0) {
                if (input[2] < 4.0) {
                    if (input[3] < 1.74) {
                        if (input[3] < 1.4) {
                            var6 = -0.00053077925;
                        } else {
                            var6 = -0.0018680709;
                        }
                    } else {
                        if (input[3] < 2.3) {
                            var6 = 0.00012252884;
                        } else {
                            var6 = -0.0012313908;
                        }
                    }
                } else {
                    if (input[3] < 1.25) {
                        if (input[1] < 2.0) {
                            var6 = 0.00055105437;
                        } else {
                            var6 = -0.0016314753;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var6 = -0.0013143085;
                        } else {
                            var6 = 0.00097069715;
                        }
                    }
                }
            } else {
                if (input[4] < 3.0) {
                    if (input[1] < 4.0) {
                        if (input[3] < 2.01) {
                            var6 = -0.00071636395;
                        } else {
                            var6 = 0.000050313312;
                        }
                    } else {
                        if (input[3] < 1.9) {
                            var6 = -0.0010783158;
                        } else {
                            var6 = -0.0026995244;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[2] < 8.0) {
                            var6 = -0.0005634416;
                        } else {
                            var6 = -0.0015782755;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var6 = -0.0006279243;
                        } else {
                            var6 = 0.0024827456;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 93.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 2.8) {
                        if (input[2] < 4.0) {
                            var6 = 0.000113006834;
                        } else {
                            var6 = -0.0025878993;
                        }
                    } else {
                        if (input[0] < 63.0) {
                            var6 = -0.00052201725;
                        } else {
                            var6 = 0.00012157419;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 31.0) {
                            var6 = 0.0007902306;
                        } else {
                            var6 = 0.00001636641;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var6 = 0.00019486224;
                        } else {
                            var6 = 0.0026020613;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 2.92) {
                        if (input[2] < 4.0) {
                            var6 = -0.0008103569;
                        } else {
                            var6 = -0.001908048;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var6 = 0.0006609922;
                        } else {
                            var6 = -0.00016828142;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[1] < 2.0) {
                            var6 = 0.0022113994;
                        } else {
                            var6 = -0.004020838;
                        }
                    } else {
                        if (input[3] < 4.76) {
                            var6 = -0.0010191416;
                        } else {
                            var6 = 0.0027685852;
                        }
                    }
                }
            }
        }
        double var7;
        if (input[3] < 4.17) {
            if (input[0] < 89.0) {
                if (input[1] < 5.0) {
                    if (input[3] < 1.61) {
                        if (input[1] < 2.0) {
                            var7 = 0.00001585535;
                        } else {
                            var7 = -0.0009142621;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var7 = -0.0006918606;
                        } else {
                            var7 = 0.00014993675;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 45.0) {
                            var7 = 0.00035017703;
                        } else {
                            var7 = -0.00078846415;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var7 = -0.00036591748;
                        } else {
                            var7 = 0.0018432935;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 4.0) {
                        if (input[4] < 4.0) {
                            var7 = -0.000025541583;
                        } else {
                            var7 = 0.0020759562;
                        }
                    } else {
                        if (input[3] < 1.42) {
                            var7 = 0.00087210437;
                        } else {
                            var7 = -0.0010608956;
                        }
                    }
                } else {
                    if (input[4] < 7.0) {
                        if (input[2] < 6.0) {
                            var7 = -0.0012932541;
                        } else {
                            var7 = -0.00054776773;
                        }
                    } else {
                        if (input[3] < 3.18) {
                            var7 = -0.00039494914;
                        } else {
                            var7 = -0.0033560523;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[0] < 60.0) {
                            var7 = -0.00029331225;
                        } else {
                            var7 = 0.00021475657;
                        }
                    } else {
                        if (input[0] < 49.0) {
                            var7 = 0.0033710808;
                        } else {
                            var7 = 0.0002515574;
                        }
                    }
                } else {
                    if (input[0] < 14.0) {
                        if (input[4] < 4.0) {
                            var7 = -0.00002842918;
                        } else {
                            var7 = -0.0016341908;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var7 = 0.0003325662;
                        } else {
                            var7 = -0.00034115583;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[0] < 68.0) {
                        if (input[1] < 2.0) {
                            var7 = -0.0006083608;
                        } else {
                            var7 = 0.0022004354;
                        }
                    } else {
                        if (input[3] < 4.98) {
                            var7 = -0.0015981392;
                        } else {
                            var7 = 0.0036319734;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.81) {
                            var7 = -0.0046839006;
                        } else {
                            var7 = 0.0044361018;
                        }
                    } else {
                        if (input[3] < 4.46) {
                            var7 = 0.0032332558;
                        } else {
                            var7 = 0.0074340827;
                        }
                    }
                }
            }
        }
        double var8;
        if (input[3] < 2.47) {
            if (input[0] < 22.0) {
                if (input[1] < 3.0) {
                    if (input[3] < 2.14) {
                        if (input[0] < 7.0) {
                            var8 = -0.00028189475;
                        } else {
                            var8 = -0.0011021756;
                        }
                    } else {
                        if (input[3] < 2.45) {
                            var8 = 0.00027199773;
                        } else {
                            var8 = -0.0011130671;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.69) {
                            var8 = -0.0012219131;
                        } else {
                            var8 = 0.0007905206;
                        }
                    } else {
                        if (input[3] < 1.1) {
                            var8 = -0.0022697211;
                        } else {
                            var8 = 0.0015233094;
                        }
                    }
                }
            } else {
                if (input[0] < 76.0) {
                    if (input[3] < 1.25) {
                        if (input[2] < 5.0) {
                            var8 = -0.00009511372;
                        } else {
                            var8 = -0.0017246178;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var8 = -0.000832946;
                        } else {
                            var8 = 0.00013890926;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 1.42) {
                            var8 = 0.00080480037;
                        } else {
                            var8 = -0.0007391035;
                        }
                    } else {
                        if (input[3] < 1.93) {
                            var8 = -0.00066060986;
                        } else {
                            var8 = -0.0013983813;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 93.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 2.8) {
                        if (input[2] < 4.0) {
                            var8 = 0.00011688074;
                        } else {
                            var8 = -0.0024583691;
                        }
                    } else {
                        if (input[0] < 51.0) {
                            var8 = -0.0005693067;
                        } else {
                            var8 = 0.000025232017;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 31.0) {
                            var8 = 0.0007365579;
                        } else {
                            var8 = 0.000006536114;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var8 = 0.00018157119;
                        } else {
                            var8 = 0.0024237756;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 2.92) {
                        if (input[2] < 4.0) {
                            var8 = -0.00072270335;
                        } else {
                            var8 = -0.0017952314;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var8 = 0.0006445189;
                        } else {
                            var8 = -0.00013492511;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[1] < 2.0) {
                            var8 = 0.0020734312;
                        } else {
                            var8 = -0.0037385046;
                        }
                    } else {
                        if (input[3] < 3.66) {
                            var8 = -0.0015994369;
                        } else {
                            var8 = 0.00008049938;
                        }
                    }
                }
            }
        }
        double var9;
        if (input[3] < 4.17) {
            if (input[0] < 25.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 1.33) {
                        if (input[0] < 6.0) {
                            var9 = 0.00016394437;
                        } else {
                            var9 = 0.00048771445;
                        }
                    } else {
                        if (input[3] < 2.14) {
                            var9 = -0.0019973288;
                        } else {
                            var9 = -0.0005549499;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.88) {
                            var9 = 0.0006422967;
                        } else {
                            var9 = -0.0015795771;
                        }
                    } else {
                        if (input[3] < 1.69) {
                            var9 = -0.00038101728;
                        } else {
                            var9 = 0.0011339284;
                        }
                    }
                }
            } else {
                if (input[2] < 9.0) {
                    if (input[0] < 89.0) {
                        if (input[3] < 4.03) {
                            var9 = -0.00025748985;
                        } else {
                            var9 = -0.0015114396;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var9 = -0.00028539207;
                        } else {
                            var9 = -0.0013992065;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[4] < 6.0) {
                            var9 = -0.00030624954;
                        } else {
                            var9 = -0.0015847868;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var9 = -0.00048597853;
                        } else {
                            var9 = 0.003503993;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[0] < 60.0) {
                            var9 = -0.0002898818;
                        } else {
                            var9 = 0.00019865316;
                        }
                    } else {
                        if (input[0] < 49.0) {
                            var9 = 0.0031899982;
                        } else {
                            var9 = 0.0002538612;
                        }
                    }
                } else {
                    if (input[0] < 14.0) {
                        if (input[4] < 4.0) {
                            var9 = -0.00006227195;
                        } else {
                            var9 = -0.0016029092;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var9 = 0.00031054294;
                        } else {
                            var9 = -0.00034794328;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 4.88) {
                        if (input[0] < 11.0) {
                            var9 = 0.0034220049;
                        } else {
                            var9 = -0.00027056105;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var9 = 0.0006261736;
                        } else {
                            var9 = 0.006592598;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.81) {
                            var9 = -0.0044611786;
                        } else {
                            var9 = 0.0042437934;
                        }
                    } else {
                        if (input[3] < 4.46) {
                            var9 = 0.0030447564;
                        } else {
                            var9 = 0.0070316396;
                        }
                    }
                }
            }
        }
        double var10;
        if (input[3] < 3.79) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[0] < 12.0) {
                        if (input[1] < 2.0) {
                            var10 = -0.0007394468;
                        } else {
                            var10 = 0.00051641825;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var10 = -0.00021194166;
                        } else {
                            var10 = -0.0006559847;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[4] < 6.0) {
                            var10 = -0.00015661886;
                        } else {
                            var10 = -0.0010630194;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var10 = -0.00030830348;
                        } else {
                            var10 = 0.0043373774;
                        }
                    }
                }
            } else {
                if (input[0] < 90.0) {
                    if (input[3] < 3.69) {
                        if (input[2] < 4.0) {
                            var10 = -0.000252949;
                        } else {
                            var10 = 0.00086607056;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var10 = -0.00045837165;
                        } else {
                            var10 = 0.004512259;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[3] < 3.36) {
                            var10 = -0.0010245242;
                        } else {
                            var10 = -0.003182086;
                        }
                    } else {
                        if (input[4] < 3.0) {
                            var10 = -0.0019108236;
                        } else {
                            var10 = 0.002248177;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 4.08) {
                            var10 = 0.0007581528;
                        } else {
                            var10 = -0.000069519934;
                        }
                    } else {
                        if (input[3] < 4.35) {
                            var10 = -0.0008039904;
                        } else {
                            var10 = 0.002514478;
                        }
                    }
                } else {
                    if (input[3] < 3.82) {
                        if (input[4] < 4.0) {
                            var10 = -0.00018049926;
                        } else {
                            var10 = 0.003674921;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var10 = 0.000092479335;
                        } else {
                            var10 = -0.0004211107;
                        }
                    }
                }
            } else {
                if (input[3] < 4.86) {
                    if (input[2] < 9.0) {
                        if (input[0] < 58.0) {
                            var10 = 0.0010191724;
                        } else {
                            var10 = -0.0010998929;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var10 = 0.000057570585;
                        } else {
                            var10 = 0.0069795735;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 2.0) {
                            var10 = 0.0029685677;
                        } else {
                            var10 = -0.0011754513;
                        }
                    } else {
                        var10 = 0.006520944;
                    }
                }
            }
        }
        double var11;
        if (input[3] < 2.47) {
            if (input[0] < 7.0) {
                if (input[3] < 1.5) {
                    if (input[2] < 6.0) {
                        if (input[1] < 2.0) {
                            var11 = 0.000027125478;
                        } else {
                            var11 = -0.0014778805;
                        }
                    } else {
                        if (input[3] < 1.02) {
                            var11 = -0.0021179765;
                        } else {
                            var11 = 0.0003966335;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 1.97) {
                            var11 = -0.0018471411;
                        } else {
                            var11 = -0.0000043809414;
                        }
                    } else {
                        if (input[3] < 2.4) {
                            var11 = 0.0019680515;
                        } else {
                            var11 = -0.001043876;
                        }
                    }
                }
            } else {
                if (input[0] < 76.0) {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.33) {
                            var11 = -0.00015025586;
                        } else {
                            var11 = -0.00074357266;
                        }
                    } else {
                        if (input[3] < 1.25) {
                            var11 = -0.0012370141;
                        } else {
                            var11 = 0.00016534519;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 5.0) {
                            var11 = 0.0006332173;
                        } else {
                            var11 = -0.0007656606;
                        }
                    } else {
                        if (input[4] < 3.0) {
                            var11 = -0.0014785794;
                        } else {
                            var11 = -0.00065577903;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 93.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 2.8) {
                        if (input[2] < 4.0) {
                            var11 = 0.0001534891;
                        } else {
                            var11 = -0.002312038;
                        }
                    } else {
                        if (input[0] < 63.0) {
                            var11 = -0.0004427207;
                        } else {
                            var11 = 0.00012723482;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 4.0) {
                            var11 = 0.00059163274;
                        } else {
                            var11 = -0.0008904591;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var11 = -0.00008500371;
                        } else {
                            var11 = 0.00085194095;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 2.92) {
                        if (input[2] < 4.0) {
                            var11 = -0.00065832835;
                        } else {
                            var11 = -0.0016929349;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var11 = 0.00061514054;
                        } else {
                            var11 = -0.0001123511;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 4.0) {
                            var11 = 0.0028813947;
                        } else {
                            var11 = -0.00009850926;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var11 = -0.0034417182;
                        } else {
                            var11 = -0.0006715075;
                        }
                    }
                }
            }
        }
        double var12;
        if (input[3] < 4.17) {
            if (input[0] < 21.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 2.0) {
                        if (input[2] < 8.0) {
                            var12 = 0.0007159277;
                        } else {
                            var12 = -0.0009232789;
                        }
                    } else {
                        if (input[3] < 1.33) {
                            var12 = 0.0003794822;
                        } else {
                            var12 = -0.0010418755;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.88) {
                            var12 = 0.00030490253;
                        } else {
                            var12 = -0.0014209006;
                        }
                    } else {
                        if (input[3] < 3.42) {
                            var12 = 0.0004685892;
                        } else {
                            var12 = 0.0018313855;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[0] < 79.0) {
                            var12 = -0.000058139307;
                        } else {
                            var12 = 0.0013857764;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var12 = -0.00027509613;
                        } else {
                            var12 = -0.0011261792;
                        }
                    }
                } else {
                    if (input[3] < 1.4) {
                        if (input[1] < 2.0) {
                            var12 = 0.0008061421;
                        } else {
                            var12 = -0.0018073497;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var12 = -0.0010697461;
                        } else {
                            var12 = 0.00032373102;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 4.45) {
                            var12 = 0.00020596819;
                        } else {
                            var12 = -0.00026190912;
                        }
                    } else {
                        if (input[3] < 4.65) {
                            var12 = 0.0005835806;
                        } else {
                            var12 = 0.0035242985;
                        }
                    }
                } else {
                    if (input[3] < 4.7) {
                        if (input[0] < 64.0) {
                            var12 = -0.000046617002;
                        } else {
                            var12 = 0.0006422144;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var12 = 0.0014108358;
                        } else {
                            var12 = -0.00091934483;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 4.88) {
                        if (input[0] < 11.0) {
                            var12 = 0.0032137737;
                        } else {
                            var12 = -0.00027812913;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var12 = 0.000609839;
                        } else {
                            var12 = 0.006033974;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.81) {
                            var12 = -0.0042475886;
                        } else {
                            var12 = 0.003871622;
                        }
                    } else {
                        if (input[3] < 4.46) {
                            var12 = 0.0027795455;
                        } else {
                            var12 = 0.006492206;
                        }
                    }
                }
            }
        }
        double var13;
        if (input[3] < 2.47) {
            if (input[0] < 48.0) {
                if (input[2] < 4.0) {
                    if (input[3] < 1.74) {
                        if (input[3] < 1.4) {
                            var13 = -0.00038563734;
                        } else {
                            var13 = -0.0016496783;
                        }
                    } else {
                        if (input[3] < 1.93) {
                            var13 = 0.0007097368;
                        } else {
                            var13 = -0.0005463582;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 1.67) {
                            var13 = -0.0009472293;
                        } else {
                            var13 = 0.000056868874;
                        }
                    } else {
                        if (input[3] < 1.1) {
                            var13 = -0.0026095957;
                        } else {
                            var13 = 0.0009129368;
                        }
                    }
                }
            } else {
                if (input[4] < 3.0) {
                    if (input[1] < 4.0) {
                        if (input[3] < 2.01) {
                            var13 = -0.0005774849;
                        } else {
                            var13 = 0.0001634195;
                        }
                    } else {
                        if (input[3] < 1.9) {
                            var13 = -0.00089315715;
                        } else {
                            var13 = -0.002474739;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[2] < 8.0) {
                            var13 = -0.00039088153;
                        } else {
                            var13 = -0.0013381972;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var13 = -0.00047666245;
                        } else {
                            var13 = 0.0021664265;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 68.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 4.95) {
                        if (input[2] < 3.0) {
                            var13 = 0.00032865177;
                        } else {
                            var13 = -0.00078165065;
                        }
                    } else {
                        if (input[4] < 3.0) {
                            var13 = -0.00038819015;
                        } else {
                            var13 = 0.0040408014;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 3.36) {
                            var13 = -0.0013326154;
                        } else {
                            var13 = -0.00028200468;
                        }
                    } else {
                        if (input[0] < 17.0) {
                            var13 = 0.0013294289;
                        } else {
                            var13 = 0.0004607779;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[4] < 5.0) {
                            var13 = 0.00032286646;
                        } else {
                            var13 = 0.0026827797;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var13 = 0.0000607566;
                        } else {
                            var13 = -0.0028839165;
                        }
                    }
                } else {
                    if (input[3] < 3.69) {
                        if (input[4] < 5.0) {
                            var13 = 0.00004777298;
                        } else {
                            var13 = -0.0006647781;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var13 = -0.00032055462;
                        } else {
                            var13 = 0.0009323202;
                        }
                    }
                }
            }
        }
        double var14;
        if (input[3] < 4.17) {
            if (input[0] < 89.0) {
                if (input[1] < 5.0) {
                    if (input[2] < 9.0) {
                        if (input[3] < 3.2) {
                            var14 = -0.00037195274;
                        } else {
                            var14 = 0.00006256991;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var14 = -0.00032437686;
                        } else {
                            var14 = 0.0023785313;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 45.0) {
                            var14 = 0.0002715982;
                        } else {
                            var14 = -0.00071268756;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var14 = -0.00029250653;
                        } else {
                            var14 = 0.0015640268;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[2] < 4.0) {
                        if (input[4] < 4.0) {
                            var14 = -0.00013375482;
                        } else {
                            var14 = 0.0018822812;
                        }
                    } else {
                        if (input[3] < 1.42) {
                            var14 = 0.00086065865;
                        } else {
                            var14 = -0.00083056325;
                        }
                    }
                } else {
                    if (input[4] < 7.0) {
                        if (input[3] < 3.68) {
                            var14 = -0.0008373796;
                        } else {
                            var14 = 0.000030405654;
                        }
                    } else {
                        if (input[3] < 3.18) {
                            var14 = -0.00021047075;
                        } else {
                            var14 = -0.0028398873;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 3.0) {
                    if (input[3] < 4.95) {
                        if (input[2] < 4.0) {
                            var14 = 0.0007637798;
                        } else {
                            var14 = 0.000021806967;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var14 = -0.0003047776;
                        } else {
                            var14 = 0.0035921794;
                        }
                    }
                } else {
                    if (input[3] < 4.7) {
                        if (input[3] < 4.27) {
                            var14 = -0.0005503767;
                        } else {
                            var14 = 0.000333995;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var14 = -0.000024208077;
                        } else {
                            var14 = -0.0013516493;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 4.88) {
                        if (input[0] < 84.0) {
                            var14 = 0.00044940502;
                        } else {
                            var14 = -0.002229786;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var14 = 0.00055023434;
                        } else {
                            var14 = 0.005769477;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.81) {
                            var14 = -0.004027092;
                        } else {
                            var14 = 0.0036809635;
                        }
                    } else {
                        if (input[3] < 4.46) {
                            var14 = 0.0026054154;
                        } else {
                            var14 = 0.006144021;
                        }
                    }
                }
            }
        }
        double var15;
        if (input[3] < 2.08) {
            if (input[3] < 1.93) {
                if (input[3] < 1.83) {
                    if (input[3] < 1.15) {
                        if (input[2] < 4.0) {
                            var15 = 0.0001985902;
                        } else {
                            var15 = -0.0015231151;
                        }
                    } else {
                        if (input[0] < 9.0) {
                            var15 = 0.00056530535;
                        } else {
                            var15 = -0.00032959605;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 4.0) {
                            var15 = 0.0009238544;
                        } else {
                            var15 = -0.0020294895;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var15 = -0.00009701008;
                        } else {
                            var15 = 0.0024314602;
                        }
                    }
                }
            } else {
                if (input[4] < 2.0) {
                    if (input[1] < 3.0) {
                        if (input[0] < 66.0) {
                            var15 = -0.0012669285;
                        } else {
                            var15 = 0.000184083;
                        }
                    } else {
                        if (input[2] < 3.0) {
                            var15 = -0.0006905794;
                        } else {
                            var15 = -0.004950602;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[0] < 73.0) {
                            var15 = -0.0011522296;
                        } else {
                            var15 = -0.0025189444;
                        }
                    } else {
                        if (input[0] < 69.0) {
                            var15 = 0.0010182908;
                        } else {
                            var15 = -0.0013685988;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 93.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 2.8) {
                        if (input[1] < 4.0) {
                            var15 = -0.00037220938;
                        } else {
                            var15 = -0.002778446;
                        }
                    } else {
                        if (input[0] < 51.0) {
                            var15 = -0.00044714226;
                        } else {
                            var15 = 0.000043248954;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.91) {
                            var15 = -0.00039398667;
                        } else {
                            var15 = 0.0027012292;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var15 = -0.00006750982;
                        } else {
                            var15 = 0.00072941504;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[4] < 5.0) {
                        if (input[4] < 3.0) {
                            var15 = -0.00041107312;
                        } else {
                            var15 = 0.00039118153;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var15 = 0.003613023;
                        } else {
                            var15 = 0.0004018611;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[4] < 4.0) {
                            var15 = -0.00041315216;
                        } else {
                            var15 = -0.0028069078;
                        }
                    } else {
                        if (input[0] < 100.0) {
                            var15 = -0.00017257627;
                        } else {
                            var15 = -0.0014421642;
                        }
                    }
                }
            }
        }
        double var16;
        if (input[3] < 4.17) {
            if (input[0] < 26.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 2.95) {
                            var16 = -0.0005975448;
                        } else {
                            var16 = 0.0007693862;
                        }
                    } else {
                        if (input[3] < 3.33) {
                            var16 = -0.00049568637;
                        } else {
                            var16 = -0.002021743;
                        }
                    }
                } else {
                    if (input[3] < 1.43) {
                        if (input[1] < 3.0) {
                            var16 = -0.0014886755;
                        } else {
                            var16 = -0.00028305812;
                        }
                    } else {
                        if (input[4] < 3.0) {
                            var16 = -0.00021455977;
                        } else {
                            var16 = 0.0009478094;
                        }
                    }
                }
            } else {
                if (input[3] < 4.03) {
                    if (input[0] < 89.0) {
                        if (input[3] < 2.01) {
                            var16 = -0.00044880458;
                        } else {
                            var16 = 0.00007173133;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var16 = 0.00008142979;
                        } else {
                            var16 = -0.0008086783;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 61.0) {
                            var16 = -0.0001053829;
                        } else {
                            var16 = 0.00049177016;
                        }
                    } else {
                        if (input[0] < 80.0) {
                            var16 = -0.0031576348;
                        } else {
                            var16 = 0.00018363316;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 4.0) {
                        if (input[0] < 60.0) {
                            var16 = -0.000288651;
                        } else {
                            var16 = 0.00017229599;
                        }
                    } else {
                        if (input[0] < 49.0) {
                            var16 = 0.0027903095;
                        } else {
                            var16 = 0.00016526715;
                        }
                    }
                } else {
                    if (input[0] < 14.0) {
                        if (input[4] < 4.0) {
                            var16 = -0.00013162121;
                        } else {
                            var16 = -0.0015862643;
                        }
                    } else {
                        if (input[3] < 4.7) {
                            var16 = 0.00025067982;
                        } else {
                            var16 = -0.00036484827;
                        }
                    }
                }
            } else {
                if (input[2] < 9.0) {
                    if (input[3] < 4.88) {
                        if (input[0] < 68.0) {
                            var16 = 0.0010114159;
                        } else {
                            var16 = -0.0015776396;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var16 = 0.0015691599;
                        } else {
                            var16 = 0.0056036734;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[0] < 22.0) {
                            var16 = 0.002813522;
                        } else {
                            var16 = -0.0029536725;
                        }
                    } else {
                        if (input[0] < 92.0) {
                            var16 = 0.0059211417;
                        } else {
                            var16 = 0.0014269442;
                        }
                    }
                }
            }
        }
        double var17;
        if (input[3] < 3.79) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 2.97) {
                            var17 = -0.0004443924;
                        } else {
                            var17 = 0.0007694301;
                        }
                    } else {
                        if (input[3] < 3.59) {
                            var17 = -0.00039496622;
                        } else {
                            var17 = -0.0015432521;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[4] < 6.0) {
                            var17 = -0.00012449824;
                        } else {
                            var17 = -0.0009542592;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var17 = -0.00039416496;
                        } else {
                            var17 = 0.0039440915;
                        }
                    }
                }
            } else {
                if (input[3] < 3.69) {
                    if (input[0] < 68.0) {
                        if (input[2] < 4.0) {
                            var17 = -0.00012055532;
                        } else {
                            var17 = 0.0010636534;
                        }
                    } else {
                        if (input[0] < 90.0) {
                            var17 = -0.0001978263;
                        } else {
                            var17 = -0.0010266553;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 92.0) {
                            var17 = 0.0005680045;
                        } else {
                            var17 = -0.002590239;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var17 = -0.00051463844;
                        } else {
                            var17 = 0.0044952324;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 5.0) {
                        if (input[0] < 86.0) {
                            var17 = 0.00035292446;
                        } else {
                            var17 = -0.00032681462;
                        }
                    } else {
                        if (input[3] < 4.31) {
                            var17 = -0.00041648993;
                        } else {
                            var17 = 0.00251347;
                        }
                    }
                } else {
                    if (input[3] < 3.82) {
                        if (input[4] < 4.0) {
                            var17 = -0.00020213277;
                        } else {
                            var17 = 0.003363318;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var17 = 0.000049468927;
                        } else {
                            var17 = -0.00047515446;
                        }
                    }
                }
            } else {
                if (input[3] < 4.81) {
                    if (input[2] < 9.0) {
                        if (input[0] < 23.0) {
                            var17 = 0.001663881;
                        } else {
                            var17 = -0.00044999138;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var17 = -0.00026646626;
                        } else {
                            var17 = 0.0060300264;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 4.98) {
                            var17 = -0.0008329432;
                        } else {
                            var17 = 0.003934817;
                        }
                    } else {
                        if (input[2] < 1.0) {
                            var17 = -0.00084691047;
                        } else {
                            var17 = 0.0056635453;
                        }
                    }
                }
            }
        }
        double var18;
        if (input[0] < 66.0) {
            if (input[1] < 2.0) {
                if (input[3] < 4.95) {
                    if (input[3] < 1.33) {
                        if (input[0] < 24.0) {
                            var18 = 0.0005087678;
                        } else {
                            var18 = 0.00096492143;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var18 = -0.000088516535;
                        } else {
                            var18 = -0.0010063347;
                        }
                    }
                } else {
                    if (input[4] < 3.0) {
                        var18 = -0.0004170686;
                    } else {
                        var18 = 0.003526744;
                    }
                }
            } else {
                if (input[3] < 1.57) {
                    if (input[3] < 1.06) {
                        if (input[2] < 5.0) {
                            var18 = -0.00028539513;
                        } else {
                            var18 = -0.0029148774;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var18 = -0.0011407667;
                        } else {
                            var18 = -0.00025060304;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.9) {
                            var18 = 0.0022720739;
                        } else {
                            var18 = -0.0009401169;
                        }
                    } else {
                        if (input[0] < 12.0) {
                            var18 = 0.0013247404;
                        } else {
                            var18 = 0.0004380413;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.77) {
                if (input[2] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[4] < 6.0) {
                            var18 = 0.00033457577;
                        } else {
                            var18 = 0.0020528608;
                        }
                    } else {
                        if (input[3] < 1.57) {
                            var18 = 0.0010274503;
                        } else {
                            var18 = -0.0014583574;
                        }
                    }
                } else {
                    if (input[3] < 1.69) {
                        if (input[2] < 4.0) {
                            var18 = 0.0008188148;
                        } else {
                            var18 = -0.001057675;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var18 = -0.0003367834;
                        } else {
                            var18 = 0.00015901041;
                        }
                    }
                }
            } else {
                if (input[4] < 5.0) {
                    if (input[2] < 10.0) {
                        if (input[2] < 1.0) {
                            var18 = 0.0018886685;
                        } else {
                            var18 = -0.0002500344;
                        }
                    } else {
                        if (input[0] < 78.0) {
                            var18 = 0.002564496;
                        } else {
                            var18 = 0.00009194612;
                        }
                    }
                } else {
                    if (input[0] < 88.0) {
                        if (input[2] < 9.0) {
                            var18 = 0.000015659332;
                        } else {
                            var18 = 0.003196268;
                        }
                    } else {
                        var18 = 0.004032055;
                    }
                }
            }
        }
        double var19;
        if (input[3] < 3.79) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 2.97) {
                            var19 = -0.00041344922;
                        } else {
                            var19 = 0.000738144;
                        }
                    } else {
                        if (input[3] < 3.59) {
                            var19 = -0.00037466487;
                        } else {
                            var19 = -0.0014682878;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[0] < 71.0) {
                            var19 = -0.000094887735;
                        } else {
                            var19 = -0.0008758982;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var19 = -0.00037229733;
                        } else {
                            var19 = 0.003738404;
                        }
                    }
                }
            } else {
                if (input[3] < 3.69) {
                    if (input[0] < 68.0) {
                        if (input[2] < 4.0) {
                            var19 = -0.0001301543;
                        } else {
                            var19 = 0.0009991506;
                        }
                    } else {
                        if (input[3] < 3.47) {
                            var19 = -0.0003393028;
                        } else {
                            var19 = -0.0019688385;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 92.0) {
                            var19 = 0.00055130123;
                        } else {
                            var19 = -0.0024890245;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var19 = -0.00051271915;
                        } else {
                            var19 = 0.004275781;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 5.0) {
                        if (input[3] < 3.94) {
                            var19 = 0.0008226673;
                        } else {
                            var19 = 0.00012074973;
                        }
                    } else {
                        if (input[3] < 4.15) {
                            var19 = -0.0013997687;
                        } else {
                            var19 = 0.0019581646;
                        }
                    }
                } else {
                    if (input[3] < 3.82) {
                        if (input[4] < 4.0) {
                            var19 = -0.00018783659;
                        } else {
                            var19 = 0.0032079306;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var19 = 0.000045949324;
                        } else {
                            var19 = -0.00046303053;
                        }
                    }
                }
            } else {
                if (input[3] < 4.81) {
                    if (input[2] < 9.0) {
                        if (input[0] < 56.0) {
                            var19 = 0.000780469;
                        } else {
                            var19 = -0.0010530603;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var19 = -0.00025036794;
                        } else {
                            var19 = 0.005715881;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 4.98) {
                            var19 = -0.0008203964;
                        } else {
                            var19 = 0.003737573;
                        }
                    } else {
                        if (input[2] < 1.0) {
                            var19 = -0.00083669426;
                        } else {
                            var19 = 0.005331001;
                        }
                    }
                }
            }
        }
        double var20;
        if (input[0] < 66.0) {
            if (input[1] < 2.0) {
                if (input[3] < 4.95) {
                    if (input[3] < 1.33) {
                        if (input[0] < 24.0) {
                            var20 = 0.0005032853;
                        } else {
                            var20 = 0.0009334634;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var20 = -0.00008129934;
                        } else {
                            var20 = -0.0009505266;
                        }
                    }
                } else {
                    if (input[4] < 3.0) {
                        var20 = -0.0004040897;
                    } else {
                        var20 = 0.003333068;
                    }
                }
            } else {
                if (input[3] < 1.43) {
                    if (input[1] < 3.0) {
                        if (input[2] < 4.0) {
                            var20 = -0.00010080795;
                        } else {
                            var20 = -0.0017765391;
                        }
                    } else {
                        if (input[3] < 1.06) {
                            var20 = -0.0016873692;
                        } else {
                            var20 = -0.0002826929;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.9) {
                            var20 = 0.0016165888;
                        } else {
                            var20 = -0.0008970812;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var20 = 0.000094687115;
                        } else {
                            var20 = 0.00076602085;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.77) {
                if (input[2] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[4] < 6.0) {
                            var20 = 0.00032189555;
                        } else {
                            var20 = 0.0019822945;
                        }
                    } else {
                        if (input[3] < 1.57) {
                            var20 = 0.0009961667;
                        } else {
                            var20 = -0.001374781;
                        }
                    }
                } else {
                    if (input[3] < 1.69) {
                        if (input[2] < 4.0) {
                            var20 = 0.00079799455;
                        } else {
                            var20 = -0.0009889136;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var20 = -0.0005592918;
                        } else {
                            var20 = 0.00006205944;
                        }
                    }
                }
            } else {
                if (input[4] < 5.0) {
                    if (input[2] < 10.0) {
                        if (input[2] < 1.0) {
                            var20 = 0.0018384338;
                        } else {
                            var20 = -0.00023392476;
                        }
                    } else {
                        if (input[0] < 78.0) {
                            var20 = 0.0024992346;
                        } else {
                            var20 = 0.00009582837;
                        }
                    }
                } else {
                    if (input[0] < 88.0) {
                        if (input[2] < 9.0) {
                            var20 = -0.000015960932;
                        } else {
                            var20 = 0.0029656913;
                        }
                    } else {
                        var20 = 0.0037167107;
                    }
                }
            }
        }
        double var21;
        if (input[3] < 3.86) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 2.97) {
                            var21 = -0.0003859745;
                        } else {
                            var21 = 0.00061495247;
                        }
                    } else {
                        if (input[0] < 48.0) {
                            var21 = -0.0001511493;
                        } else {
                            var21 = -0.00072221935;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[4] < 6.0) {
                            var21 = -0.00010083532;
                        } else {
                            var21 = -0.00088464917;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var21 = -0.00039680043;
                        } else {
                            var21 = 0.0036964682;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[0] < 45.0) {
                        if (input[3] < 2.95) {
                            var21 = 0.000772929;
                        } else {
                            var21 = -0.000885838;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var21 = -0.00043931496;
                        } else {
                            var21 = -0.0022728997;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 3.48) {
                            var21 = -0.000009624485;
                        } else {
                            var21 = -0.0021395148;
                        }
                    } else {
                        if (input[3] < 3.45) {
                            var21 = 0.0007674916;
                        } else {
                            var21 = 0.003351595;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[3] < 3.87) {
                    if (input[4] < 3.0) {
                        if (input[0] < 41.0) {
                            var21 = 0.00018327982;
                        } else {
                            var21 = -0.0011375904;
                        }
                    } else {
                        if (input[0] < 44.0) {
                            var21 = 0.0041233897;
                        } else {
                            var21 = 0.00089628453;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[4] < 5.0) {
                            var21 = 0.00017508617;
                        } else {
                            var21 = 0.0012061553;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var21 = -0.00004387132;
                        } else {
                            var21 = -0.000748088;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[0] < 36.0) {
                            var21 = 0.00043555824;
                        } else {
                            var21 = 0.003304824;
                        }
                    } else {
                        if (input[0] < 23.0) {
                            var21 = 0.0024869582;
                        } else {
                            var21 = -0.003470298;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.33) {
                            var21 = -0.00035389094;
                        } else {
                            var21 = -0.0039328383;
                        }
                    } else {
                        if (input[3] < 4.52) {
                            var21 = 0.0013932697;
                        } else {
                            var21 = 0.0044716755;
                        }
                    }
                }
            }
        }
        double var22;
        if (input[3] < 2.08) {
            if (input[3] < 1.93) {
                if (input[3] < 1.83) {
                    if (input[3] < 1.15) {
                        if (input[2] < 4.0) {
                            var22 = 0.00028272762;
                        } else {
                            var22 = -0.0013144927;
                        }
                    } else {
                        if (input[0] < 9.0) {
                            var22 = 0.0005200924;
                        } else {
                            var22 = -0.00024171383;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 4.0) {
                            var22 = 0.00095861097;
                        } else {
                            var22 = -0.0017777169;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var22 = -0.000054163556;
                        } else {
                            var22 = 0.0022954794;
                        }
                    }
                }
            } else {
                if (input[4] < 2.0) {
                    if (input[1] < 3.0) {
                        if (input[0] < 66.0) {
                            var22 = -0.0011348248;
                        } else {
                            var22 = 0.0002296865;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var22 = -0.0013304909;
                        } else {
                            var22 = -0.004865788;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 2.04) {
                            var22 = -0.0017311277;
                        } else {
                            var22 = -0.00035560175;
                        }
                    } else {
                        if (input[0] < 69.0) {
                            var22 = 0.0008263411;
                        } else {
                            var22 = -0.0012658404;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 93.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 2.8) {
                        if (input[1] < 4.0) {
                            var22 = -0.00023022981;
                        } else {
                            var22 = -0.0025266304;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var22 = -0.00023503054;
                        } else {
                            var22 = 0.0004264335;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.91) {
                            var22 = -0.00030994887;
                        } else {
                            var22 = 0.002292642;
                        }
                    } else {
                        if (input[0] < 17.0) {
                            var22 = 0.0010185804;
                        } else {
                            var22 = 0.00020551763;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[4] < 5.0) {
                        if (input[4] < 2.0) {
                            var22 = -0.00068575743;
                        } else {
                            var22 = 0.00022603353;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var22 = 0.0033243895;
                        } else {
                            var22 = 0.0004504162;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[4] < 4.0) {
                            var22 = -0.0002689757;
                        } else {
                            var22 = -0.0024541777;
                        }
                    } else {
                        if (input[0] < 100.0) {
                            var22 = -0.00014668031;
                        } else {
                            var22 = -0.0013193131;
                        }
                    }
                }
            }
        }
        double var23;
        if (input[3] < 4.17) {
            if (input[0] < 17.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 2.14) {
                        if (input[3] < 1.54) {
                            var23 = 0.0001033932;
                        } else {
                            var23 = -0.0023371787;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var23 = 0.00035259937;
                        } else {
                            var23 = -0.0008325625;
                        }
                    }
                } else {
                    if (input[3] < 3.23) {
                        if (input[3] < 2.76) {
                            var23 = 0.0004662279;
                        } else {
                            var23 = -0.00075283827;
                        }
                    } else {
                        if (input[4] < 3.0) {
                            var23 = -0.00014659762;
                        } else {
                            var23 = 0.0019075035;
                        }
                    }
                }
            } else {
                if (input[3] < 4.03) {
                    if (input[3] < 3.79) {
                        if (input[2] < 9.0) {
                            var23 = -0.0002618299;
                        } else {
                            var23 = 0.00023301596;
                        }
                    } else {
                        if (input[0] < 88.0) {
                            var23 = 0.0007290205;
                        } else {
                            var23 = -0.0005054168;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 61.0) {
                            var23 = -0.00013376417;
                        } else {
                            var23 = 0.0005122448;
                        }
                    } else {
                        if (input[0] < 80.0) {
                            var23 = -0.0029412084;
                        } else {
                            var23 = 0.00009955724;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[1] < 3.0) {
                    if (input[3] < 4.95) {
                        if (input[2] < 4.0) {
                            var23 = 0.0006562055;
                        } else {
                            var23 = 0.000049356047;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var23 = -0.0003549886;
                        } else {
                            var23 = 0.0028731308;
                        }
                    }
                } else {
                    if (input[3] < 4.7) {
                        if (input[3] < 4.27) {
                            var23 = -0.000545605;
                        } else {
                            var23 = 0.0002749258;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var23 = -0.0000194163;
                        } else {
                            var23 = -0.0013378194;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[1] < 3.0) {
                        if (input[0] < 57.0) {
                            var23 = 0.00091039593;
                        } else {
                            var23 = 0.0034132295;
                        }
                    } else {
                        if (input[0] < 33.0) {
                            var23 = 0.0012287105;
                        } else {
                            var23 = -0.0042779907;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.33) {
                            var23 = 0.0003493166;
                        } else {
                            var23 = -0.0037525946;
                        }
                    } else {
                        if (input[3] < 4.52) {
                            var23 = 0.001349962;
                        } else {
                            var23 = 0.0042388146;
                        }
                    }
                }
            }
        }
        double var24;
        if (input[0] < 68.0) {
            if (input[1] < 2.0) {
                if (input[3] < 1.33) {
                    if (input[0] < 24.0) {
                        if (input[0] < 6.0) {
                            var24 = 0.00022625744;
                        } else {
                            var24 = 0.0005831919;
                        }
                    } else {
                        if (input[2] < 2.0) {
                            var24 = 0.00028686525;
                        } else {
                            var24 = 0.0010197747;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[3] < 4.02) {
                            var24 = -0.00007463447;
                        } else {
                            var24 = 0.00090254995;
                        }
                    } else {
                        if (input[3] < 2.14) {
                            var24 = -0.0017305674;
                        } else {
                            var24 = -0.0004564772;
                        }
                    }
                }
            } else {
                if (input[3] < 1.57) {
                    if (input[3] < 1.3) {
                        if (input[2] < 5.0) {
                            var24 = -0.00027153446;
                        } else {
                            var24 = -0.0013149421;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var24 = -0.0015038461;
                        } else {
                            var24 = 0.00043227384;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.9) {
                            var24 = 0.0021122035;
                        } else {
                            var24 = -0.0008228166;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var24 = 0.0003336081;
                        } else {
                            var24 = 0.001138159;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.77) {
                if (input[1] < 2.0) {
                    if (input[2] < 4.0) {
                        if (input[4] < 5.0) {
                            var24 = 0.0003300822;
                        } else {
                            var24 = 0.001619161;
                        }
                    } else {
                        if (input[3] < 1.3) {
                            var24 = 0.0012794833;
                        } else {
                            var24 = -0.00053351856;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.63) {
                            var24 = 0.0008958299;
                        } else {
                            var24 = -0.0012565155;
                        }
                    } else {
                        if (input[3] < 1.37) {
                            var24 = -0.0020551614;
                        } else {
                            var24 = 0.000057720143;
                        }
                    }
                }
            } else {
                if (input[4] < 5.0) {
                    if (input[2] < 1.0) {
                        var24 = 0.0018164039;
                    } else {
                        if (input[2] < 10.0) {
                            var24 = -0.00022584815;
                        } else {
                            var24 = 0.0012249172;
                        }
                    }
                } else {
                    if (input[0] < 88.0) {
                        if (input[0] < 79.0) {
                            var24 = 0.00234195;
                        } else {
                            var24 = -0.000137777;
                        }
                    } else {
                        var24 = 0.0032836404;
                    }
                }
            }
        }
        double var25;
        if (input[1] < 5.0) {
            if (input[3] < 3.86) {
                if (input[2] < 9.0) {
                    if (input[1] < 4.0) {
                        if (input[4] < 4.0) {
                            var25 = 0.000118677;
                        } else {
                            var25 = -0.00033758103;
                        }
                    } else {
                        if (input[0] < 67.0) {
                            var25 = -0.00023805349;
                        } else {
                            var25 = -0.0012109947;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[4] < 6.0) {
                            var25 = -0.00011659144;
                        } else {
                            var25 = -0.0008505168;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var25 = -0.0003854886;
                        } else {
                            var25 = 0.0034658394;
                        }
                    }
                }
            } else {
                if (input[3] < 4.03) {
                    if (input[4] < 4.0) {
                        if (input[2] < 4.0) {
                            var25 = 0.0007434594;
                        } else {
                            var25 = -0.0004587905;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var25 = 0.0002303889;
                        } else {
                            var25 = 0.0022593914;
                        }
                    }
                } else {
                    if (input[3] < 4.15) {
                        if (input[4] < 4.0) {
                            var25 = 0.00017474433;
                        } else {
                            var25 = -0.001873948;
                        }
                    } else {
                        if (input[3] < 4.21) {
                            var25 = 0.0010663867;
                        } else {
                            var25 = 0.00014797741;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[3] < 1.07) {
                    if (input[0] < 59.0) {
                        if (input[0] < 21.0) {
                            var25 = -0.0006539941;
                        } else {
                            var25 = -0.0033273816;
                        }
                    } else {
                        if (input[0] < 60.0) {
                            var25 = -0.0001995643;
                        } else {
                            var25 = -0.00001614988;
                        }
                    }
                } else {
                    if (input[3] < 1.93) {
                        if (input[3] < 1.44) {
                            var25 = -0.0003226852;
                        } else {
                            var25 = 0.0010913057;
                        }
                    } else {
                        if (input[3] < 2.0) {
                            var25 = -0.0038524033;
                        } else {
                            var25 = -0.00007840774;
                        }
                    }
                }
            } else {
                if (input[0] < 34.0) {
                    if (input[3] < 1.73) {
                        if (input[2] < 4.0) {
                            var25 = -0.00094670895;
                        } else {
                            var25 = 0.0006740612;
                        }
                    } else {
                        if (input[4] < 5.0) {
                            var25 = 0.0006549162;
                        } else {
                            var25 = 0.0021935608;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[3] < 4.78) {
                            var25 = -0.00021173866;
                        } else {
                            var25 = 0.0031858922;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var25 = 0.0005495536;
                        } else {
                            var25 = 0.0025429493;
                        }
                    }
                }
            }
        }
        double var26;
        if (input[3] < 2.08) {
            if (input[3] < 1.93) {
                if (input[3] < 1.83) {
                    if (input[3] < 1.15) {
                        if (input[2] < 4.0) {
                            var26 = 0.00028735047;
                        } else {
                            var26 = -0.0011868437;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var26 = -0.0004091369;
                        } else {
                            var26 = 0.000031105155;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 4.0) {
                            var26 = 0.0009525015;
                        } else {
                            var26 = -0.0015674066;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var26 = -0.000057964975;
                        } else {
                            var26 = 0.0021473027;
                        }
                    }
                }
            } else {
                if (input[4] < 2.0) {
                    if (input[1] < 3.0) {
                        if (input[0] < 66.0) {
                            var26 = -0.0010772705;
                        } else {
                            var26 = 0.00023018917;
                        }
                    } else {
                        if (input[2] < 3.0) {
                            var26 = -0.00046951772;
                        } else {
                            var26 = -0.004358155;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 2.04) {
                            var26 = -0.0016180946;
                        } else {
                            var26 = -0.00031661263;
                        }
                    } else {
                        if (input[3] < 1.97) {
                            var26 = -0.0011523978;
                        } else {
                            var26 = 0.00084820716;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 93.0) {
                if (input[1] < 5.0) {
                    if (input[2] < 9.0) {
                        if (input[4] < 7.0) {
                            var26 = 0.000043405154;
                        } else {
                            var26 = -0.0004089968;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var26 = -0.00003476813;
                        } else {
                            var26 = 0.001837517;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 2.95) {
                            var26 = 0.00075899245;
                        } else {
                            var26 = -0.00029804895;
                        }
                    } else {
                        if (input[2] < 3.0) {
                            var26 = -0.00019710242;
                        } else {
                            var26 = 0.001190374;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[4] < 5.0) {
                        if (input[4] < 3.0) {
                            var26 = -0.00040057005;
                        } else {
                            var26 = 0.0003370491;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var26 = 0.0030620776;
                        } else {
                            var26 = 0.00045847474;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 2.92) {
                            var26 = -0.0012152921;
                        } else {
                            var26 = 0.0003612696;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var26 = -0.0022392788;
                        } else {
                            var26 = -0.00051884894;
                        }
                    }
                }
            }
        }
        double var27;
        if (input[0] < 12.0) {
            if (input[1] < 2.0) {
                if (input[4] < 4.0) {
                    if (input[3] < 1.97) {
                        if (input[3] < 1.4) {
                            var27 = 0.00015807823;
                        } else {
                            var27 = -0.0021645094;
                        }
                    } else {
                        if (input[3] < 2.95) {
                            var27 = -0.000089219706;
                        } else {
                            var27 = 0.0006021559;
                        }
                    }
                } else {
                    if (input[3] < 3.32) {
                        if (input[3] < 2.64) {
                            var27 = -0.0008999935;
                        } else {
                            var27 = 0.00029374307;
                        }
                    } else {
                        if (input[3] < 4.81) {
                            var27 = -0.0016369516;
                        } else {
                            var27 = 0.00067650474;
                        }
                    }
                }
            } else {
                if (input[4] < 6.0) {
                    if (input[3] < 4.68) {
                        if (input[4] < 4.0) {
                            var27 = -0.000033115528;
                        } else {
                            var27 = 0.00091549475;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var27 = -0.00038740467;
                        } else {
                            var27 = -0.0026521478;
                        }
                    }
                } else {
                    if (input[3] < 3.61) {
                        if (input[3] < 1.69) {
                            var27 = -0.00073804706;
                        } else {
                            var27 = 0.0010430936;
                        }
                    } else {
                        if (input[2] < 2.0) {
                            var27 = 0.0008689851;
                        } else {
                            var27 = 0.0044318307;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.93) {
                if (input[2] < 9.0) {
                    if (input[3] < 4.5) {
                        if (input[4] < 5.0) {
                            var27 = -0.000054707256;
                        } else {
                            var27 = -0.00037196826;
                        }
                    } else {
                        if (input[0] < 18.0) {
                            var27 = -0.00090053084;
                        } else {
                            var27 = 0.0003879443;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[4] < 6.0) {
                            var27 = -0.00005538104;
                        } else {
                            var27 = -0.00087079837;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var27 = 0.00005447917;
                        } else {
                            var27 = 0.0035936867;
                        }
                    }
                }
            } else {
                if (input[4] < 5.0) {
                    if (input[1] < 2.0) {
                        if (input[4] < 3.0) {
                            var27 = -0.00043813884;
                        } else {
                            var27 = 0.0027139226;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var27 = -0.0000115654975;
                        } else {
                            var27 = -0.0012791889;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 4.95) {
                            var27 = -0.000913771;
                        } else {
                            var27 = 0.0028011242;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var27 = 0.0052793147;
                        } else {
                            var27 = 0.0014554501;
                        }
                    }
                }
            }
        }
        double var28;
        if (input[0] < 66.0) {
            if (input[1] < 2.0) {
                if (input[3] < 1.33) {
                    if (input[0] < 24.0) {
                        if (input[0] < 6.0) {
                            var28 = 0.00026690424;
                        } else {
                            var28 = 0.00058246986;
                        }
                    } else {
                        var28 = 0.00094979437;
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[0] < 6.0) {
                            var28 = -0.0011266139;
                        } else {
                            var28 = 0.00025715405;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var28 = -0.00002644157;
                        } else {
                            var28 = -0.0010118432;
                        }
                    }
                }
            } else {
                if (input[3] < 1.43) {
                    if (input[1] < 3.0) {
                        if (input[2] < 4.0) {
                            var28 = -0.000046402416;
                        } else {
                            var28 = -0.0015998764;
                        }
                    } else {
                        if (input[3] < 1.06) {
                            var28 = -0.0014774653;
                        } else {
                            var28 = -0.00020801919;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.9) {
                            var28 = 0.0014861574;
                        } else {
                            var28 = -0.00077765103;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var28 = 0.000065868626;
                        } else {
                            var28 = 0.0006233436;
                        }
                    }
                }
            }
        } else {
            if (input[1] < 2.0) {
                if (input[2] < 4.0) {
                    if (input[4] < 5.0) {
                        if (input[3] < 3.22) {
                            var28 = 0.00061416643;
                        } else {
                            var28 = -0.00009877909;
                        }
                    } else {
                        if (input[3] < 3.82) {
                            var28 = 0.0008158744;
                        } else {
                            var28 = 0.0037190977;
                        }
                    }
                } else {
                    if (input[3] < 1.3) {
                        var28 = 0.0012843233;
                    } else {
                        if (input[3] < 1.82) {
                            var28 = -0.0019775934;
                        } else {
                            var28 = -0.00009526151;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 1.52) {
                        if (input[3] < 1.32) {
                            var28 = 0.0013210227;
                        } else {
                            var28 = 0.00031018074;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var28 = -0.00019893695;
                        } else {
                            var28 = -0.0019834277;
                        }
                    }
                } else {
                    if (input[3] < 1.37) {
                        if (input[2] < 7.0) {
                            var28 = -0.0026929267;
                        } else {
                            var28 = -0.001049392;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var28 = -0.0005141017;
                        } else {
                            var28 = 0.0002477926;
                        }
                    }
                }
            }
        }
        return subroutine1(input) + var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12 + var13 + var14 + var15 + var16 + var17 + var18 + var19 + var20 + var21 + var22 + var23 + var24 + var25 + var26 + var27 + var28;
    }
    public static double subroutine1(double[] input) {
        double var0;
        if (input[3] < 3.39) {
            if (input[3] < 2.47) {
                if (input[0] < 44.0) {
                    if (input[3] < 1.58) {
                        if (input[2] < 4.0) {
                            var0 = -0.003499452;
                        } else {
                            var0 = -0.0017611327;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var0 = -0.003804426;
                        } else {
                            var0 = 0.00068178406;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 78.0) {
                            var0 = -0.002563912;
                        } else {
                            var0 = -0.0036429923;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var0 = -0.0035560306;
                        } else {
                            var0 = 0.0036550537;
                        }
                    }
                }
            } else {
                if (input[4] < 2.0) {
                    if (input[3] < 2.8) {
                        if (input[2] < 4.0) {
                            var0 = -0.0017245744;
                        } else {
                            var0 = -0.00438628;
                        }
                    } else {
                        if (input[0] < 55.0) {
                            var0 = -0.0021637543;
                        } else {
                            var0 = -0.00014894649;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 47.0) {
                            var0 = 0.00032402665;
                        } else {
                            var0 = -0.0025197235;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var0 = 0.0002956907;
                        } else {
                            var0 = 0.003624846;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.69) {
                        if (input[3] < 3.5) {
                            var0 = -0.00061471586;
                        } else {
                            var0 = -0.0011515784;
                        }
                    } else {
                        if (input[3] < 3.7) {
                            var0 = -0.0001828611;
                        } else {
                            var0 = -0.0007534924;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 3.43) {
                            var0 = -0.0016824574;
                        } else {
                            var0 = 0.0014555464;
                        }
                    } else {
                        if (input[0] < 70.0) {
                            var0 = 0.0007599009;
                        } else {
                            var0 = 0.0016743571;
                        }
                    }
                }
            } else {
                if (input[2] < 5.0) {
                    if (input[0] < 60.0) {
                        if (input[3] < 4.52) {
                            var0 = 0.0015869122;
                        } else {
                            var0 = 0.0064585395;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var0 = 0.0019298496;
                        } else {
                            var0 = -0.00347245;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.76) {
                            var0 = -0.0025244418;
                        } else {
                            var0 = 0.0037025542;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var0 = 0.0032217246;
                        } else {
                            var0 = 0.007609093;
                        }
                    }
                }
            }
        }
        double var1;
        if (input[3] < 3.43) {
            if (input[3] < 2.01) {
                if (input[0] < 40.0) {
                    if (input[3] < 1.35) {
                        if (input[3] < 1.1) {
                            var1 = -0.0038053256;
                        } else {
                            var1 = -0.0024213844;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var1 = -0.00439673;
                        } else {
                            var1 = 0.00027460107;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[3] < 1.18) {
                            var1 = -0.004046458;
                        } else {
                            var1 = -0.0028769595;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var1 = -0.0037469305;
                        } else {
                            var1 = 0.003549682;
                        }
                    }
                }
            } else {
                if (input[0] < 92.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.86) {
                            var1 = -0.0025096964;
                        } else {
                            var1 = -0.0007163828;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var1 = -0.002615244;
                        } else {
                            var1 = 0.0007478377;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[1] < 2.0) {
                            var1 = 0.00043191464;
                        } else {
                            var1 = -0.0056795664;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var1 = -0.0038477636;
                        } else {
                            var1 = -0.001158731;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.69) {
                        if (input[0] < 61.0) {
                            var1 = -0.001331128;
                        } else {
                            var1 = -0.000722522;
                        }
                    } else {
                        if (input[3] < 3.7) {
                            var1 = -0.00017828941;
                        } else {
                            var1 = -0.00071609527;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.27) {
                            var1 = 0.0017409803;
                        } else {
                            var1 = 0.0009823603;
                        }
                    } else {
                        if (input[3] < 3.99) {
                            var1 = 0.00048091589;
                        } else {
                            var1 = 0.0011488707;
                        }
                    }
                }
            } else {
                if (input[2] < 5.0) {
                    if (input[0] < 60.0) {
                        if (input[3] < 4.52) {
                            var1 = 0.0015401759;
                        } else {
                            var1 = 0.0061424808;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var1 = 0.001974982;
                        } else {
                            var1 = -0.0032185477;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.76) {
                            var1 = -0.0024570238;
                        } else {
                            var1 = 0.0035328497;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var1 = 0.0030137252;
                        } else {
                            var1 = 0.007476916;
                        }
                    }
                }
            }
        }
        double var2;
        if (input[3] < 3.2) {
            if (input[3] < 1.68) {
                if (input[3] < 1.15) {
                    if (input[1] < 2.0) {
                        if (input[0] < 71.0) {
                            var2 = -0.0010117271;
                        } else {
                            var2 = -0.00030727786;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var2 = -0.0022785496;
                        } else {
                            var2 = -0.0054085637;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.33) {
                            var2 = -0.0022646855;
                        } else {
                            var2 = -0.0035560005;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var2 = -0.0032324851;
                        } else {
                            var2 = -0.00066976587;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 19.0) {
                        if (input[1] < 2.0) {
                            var2 = -0.0024018174;
                        } else {
                            var2 = 0.00071209617;
                        }
                    } else {
                        if (input[0] < 80.0) {
                            var2 = -0.0020793388;
                        } else {
                            var2 = -0.004288272;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.04) {
                            var2 = -0.00560299;
                        } else {
                            var2 = -0.0019622024;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var2 = -0.0031564662;
                        } else {
                            var2 = 0.001357699;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                if (input[3] < 3.26) {
                    if (input[2] < 4.0) {
                        var2 = 0.0009338975;
                    } else {
                        if (input[0] < 82.0) {
                            var2 = -0.000016745926;
                        } else {
                            var2 = -0.00064879656;
                        }
                    }
                } else {
                    if (input[3] < 3.69) {
                        if (input[0] < 61.0) {
                            var2 = -0.0013173921;
                        } else {
                            var2 = -0.0007484471;
                        }
                    } else {
                        if (input[3] < 3.7) {
                            var2 = -0.000173831;
                        } else {
                            var2 = -0.00068054424;
                        }
                    }
                }
            } else {
                if (input[3] < 4.29) {
                    if (input[0] < 45.0) {
                        if (input[1] < 2.0) {
                            var2 = -0.00079261913;
                        } else {
                            var2 = 0.0031690472;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var2 = -0.0016980044;
                        } else {
                            var2 = 0.0010239215;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[4] < 4.0) {
                            var2 = 0.0010641551;
                        } else {
                            var2 = 0.0024022995;
                        }
                    } else {
                        if (input[2] < 5.0) {
                            var2 = 0.00127745;
                        } else {
                            var2 = 0.009616203;
                        }
                    }
                }
            }
        }
        double var3;
        if (input[3] < 2.59) {
            if (input[2] < 9.0) {
                if (input[1] < 5.0) {
                    if (input[0] < 19.0) {
                        if (input[3] < 1.43) {
                            var3 = -0.0029264358;
                        } else {
                            var3 = -0.00006845178;
                        }
                    } else {
                        if (input[0] < 81.0) {
                            var3 = -0.0023392548;
                        } else {
                            var3 = -0.0034886634;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 71.0) {
                            var3 = -0.001825851;
                        } else {
                            var3 = -0.0037073065;
                        }
                    } else {
                        if (input[0] < 42.0) {
                            var3 = 0.0031085808;
                        } else {
                            var3 = -0.001004023;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 1.68) {
                        if (input[1] < 2.0) {
                            var3 = -0.0025519545;
                        } else {
                            var3 = -0.004157889;
                        }
                    } else {
                        if (input[0] < 76.0) {
                            var3 = 0.00004101548;
                        } else {
                            var3 = -0.0026456495;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[4] < 2.0) {
                            var3 = -0.003621465;
                        } else {
                            var3 = 0.0015966743;
                        }
                    } else {
                        if (input[3] < 1.13) {
                            var3 = -0.0018952349;
                        } else {
                            var3 = 0.0065399553;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 3.79) {
                if (input[1] < 3.0) {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.09) {
                            var3 = -0.0012207387;
                        } else {
                            var3 = 0.00054615317;
                        }
                    } else {
                        if (input[0] < 80.0) {
                            var3 = -0.0009785182;
                        } else {
                            var3 = -0.0030747026;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 90.0) {
                            var3 = 0.0006760258;
                        } else {
                            var3 = -0.003478694;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var3 = 0.00028400778;
                        } else {
                            var3 = 0.006343187;
                        }
                    }
                }
            } else {
                if (input[4] < 6.0) {
                    if (input[4] < 2.0) {
                        var3 = -0.00064610067;
                    } else {
                        if (input[4] < 4.0) {
                            var3 = 0.0010014474;
                        } else {
                            var3 = 0.0020584888;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 4.72) {
                            var3 = 0.0009425394;
                        } else {
                            var3 = 0.0070283236;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var3 = -0.0014102309;
                        } else {
                            var3 = 0.011741791;
                        }
                    }
                }
            }
        }
        double var4;
        if (input[3] < 3.43) {
            if (input[3] < 2.47) {
                if (input[0] < 44.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 1.33) {
                            var4 = -0.0011339117;
                        } else {
                            var4 = -0.0033449188;
                        }
                    } else {
                        if (input[3] < 1.35) {
                            var4 = -0.0027577772;
                        } else {
                            var4 = 0.000332953;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 78.0) {
                            var4 = -0.0021194813;
                        } else {
                            var4 = -0.0030738888;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var4 = -0.0030415507;
                        } else {
                            var4 = 0.0032349792;
                        }
                    }
                }
            } else {
                if (input[0] < 93.0) {
                    if (input[4] < 2.0) {
                        if (input[3] < 2.8) {
                            var4 = -0.0027325114;
                        } else {
                            var4 = -0.0010661929;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var4 = -0.0012444252;
                        } else {
                            var4 = 0.0009057454;
                        }
                    }
                } else {
                    if (input[2] < 5.0) {
                        if (input[2] < 1.0) {
                            var4 = -0.0013498877;
                        } else {
                            var4 = -0.005028527;
                        }
                    } else {
                        if (input[3] < 3.05) {
                            var4 = -0.0024737685;
                        } else {
                            var4 = -0.00041517714;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.69) {
                        if (input[0] < 61.0) {
                            var4 = -0.0012371553;
                        } else {
                            var4 = -0.00064215105;
                        }
                    } else {
                        var4 = -0.0006129888;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.27) {
                            var4 = 0.0016151572;
                        } else {
                            var4 = 0.0008307003;
                        }
                    } else {
                        if (input[0] < 59.0) {
                            var4 = 0.00051090476;
                        } else {
                            var4 = 0.0011580392;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[0] < 70.0) {
                        if (input[1] < 2.0) {
                            var4 = -0.00040861554;
                        } else {
                            var4 = 0.0035942357;
                        }
                    } else {
                        if (input[3] < 4.86) {
                            var4 = -0.00080333574;
                        } else {
                            var4 = 0.006178494;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[0] < 88.0) {
                            var4 = 0.0012177877;
                        } else {
                            var4 = -0.0059626177;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var4 = 0.0034010855;
                        } else {
                            var4 = 0.009693878;
                        }
                    }
                }
            }
        }
        double var5;
        if (input[3] < 3.69) {
            if (input[3] < 2.47) {
                if (input[1] < 5.0) {
                    if (input[2] < 9.0) {
                        if (input[0] < 21.0) {
                            var5 = -0.0011476394;
                        } else {
                            var5 = -0.0024511868;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var5 = -0.002007974;
                        } else {
                            var5 = 0.004998122;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.85) {
                            var5 = -0.0026743582;
                        } else {
                            var5 = -0.0011438559;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var5 = -0.0034149333;
                        } else {
                            var5 = 0.0015577795;
                        }
                    }
                }
            } else {
                if (input[0] < 68.0) {
                    if (input[2] < 9.0) {
                        if (input[0] < 19.0) {
                            var5 = 0.0013716845;
                        } else {
                            var5 = -0.000301484;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var5 = 0.00029678596;
                        } else {
                            var5 = 0.006370558;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[1] < 2.0) {
                            var5 = 0.0004883095;
                        } else {
                            var5 = -0.00344031;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var5 = -0.0011602305;
                        } else {
                            var5 = 0.00040473114;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 5.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.7) {
                        var5 = -0.00016781688;
                    } else {
                        var5 = -0.0005843499;
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 58.0) {
                            var5 = 0.0006989025;
                        } else {
                            var5 = 0.0012043993;
                        }
                    } else {
                        if (input[3] < 3.71) {
                            var5 = -0.0024877281;
                        } else {
                            var5 = 0.0016609132;
                        }
                    }
                }
            } else {
                if (input[3] < 4.77) {
                    if (input[2] < 4.0) {
                        if (input[0] < 45.0) {
                            var5 = 0.0021626772;
                        } else {
                            var5 = -0.0024726687;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var5 = -0.0025707441;
                        } else {
                            var5 = 0.0049453327;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[2] < 5.0) {
                            var5 = 0.0068820673;
                        } else {
                            var5 = 0.00037183298;
                        }
                    } else {
                        if (input[2] < 5.0) {
                            var5 = 0.0034084977;
                        } else {
                            var5 = 0.015064667;
                        }
                    }
                }
            }
        }
        double var6;
        if (input[3] < 3.71) {
            if (input[3] < 2.49) {
                if (input[2] < 9.0) {
                    if (input[0] < 67.0) {
                        if (input[1] < 5.0) {
                            var6 = -0.0017089667;
                        } else {
                            var6 = 0.000096948024;
                        }
                    } else {
                        if (input[3] < 1.12) {
                            var6 = -0.0043705264;
                        } else {
                            var6 = -0.0025061513;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.68) {
                            var6 = -0.0032290902;
                        } else {
                            var6 = -0.00073233695;
                        }
                    } else {
                        if (input[4] < 5.0) {
                            var6 = 0.00027226715;
                        } else {
                            var6 = 0.0061338483;
                        }
                    }
                }
            } else {
                if (input[0] < 69.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.58) {
                            var6 = -0.0010813427;
                        } else {
                            var6 = -0.0039901366;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var6 = -0.0019983298;
                        } else {
                            var6 = 0.0014333648;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[1] < 2.0) {
                            var6 = 0.00041597523;
                        } else {
                            var6 = -0.0032772035;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var6 = -0.00111849;
                        } else {
                            var6 = 0.00062511594;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[4] < 2.0) {
                    var6 = -0.0005553434;
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 58.0) {
                            var6 = 0.0006468899;
                        } else {
                            var6 = 0.0011346212;
                        }
                    } else {
                        if (input[3] < 4.03) {
                            var6 = 0.0032915242;
                        } else {
                            var6 = 0.0013590349;
                        }
                    }
                }
            } else {
                if (input[3] < 4.57) {
                    if (input[2] < 4.0) {
                        if (input[0] < 45.0) {
                            var6 = 0.0016383041;
                        } else {
                            var6 = -0.004282894;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var6 = 0.00080628454;
                        } else {
                            var6 = 0.007458354;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 4.0) {
                            var6 = 0.0040064575;
                        } else {
                            var6 = -0.003397461;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var6 = 0.0023535176;
                        } else {
                            var6 = 0.014086902;
                        }
                    }
                }
            }
        }
        double var7;
        if (input[3] < 3.69) {
            if (input[3] < 2.09) {
                if (input[0] < 43.0) {
                    if (input[3] < 1.58) {
                        if (input[2] < 4.0) {
                            var7 = -0.0027224876;
                        } else {
                            var7 = -0.0011779314;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var7 = -0.0037646529;
                        } else {
                            var7 = 0.0008701983;
                        }
                    }
                } else {
                    if (input[3] < 1.13) {
                        if (input[1] < 2.0) {
                            var7 = -0.00029620354;
                        } else {
                            var7 = -0.0040227994;
                        }
                    } else {
                        if (input[2] < 5.0) {
                            var7 = -0.0026517112;
                        } else {
                            var7 = -0.0013952062;
                        }
                    }
                }
            } else {
                if (input[0] < 26.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.76) {
                            var7 = -0.0019276117;
                        } else {
                            var7 = -0.00090888044;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var7 = -0.0023688476;
                        } else {
                            var7 = 0.0022204902;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 92.0) {
                            var7 = -0.0007504603;
                        } else {
                            var7 = -0.0026211499;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var7 = -0.0011267462;
                        } else {
                            var7 = 0.004641189;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 5.0) {
                if (input[4] < 2.0) {
                    var7 = -0.00052648765;
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 58.0) {
                            var7 = 0.00063242204;
                        } else {
                            var7 = 0.0010892622;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var7 = 0.00008792639;
                        } else {
                            var7 = 0.0017355148;
                        }
                    }
                }
            } else {
                if (input[3] < 4.77) {
                    if (input[1] < 4.0) {
                        if (input[0] < 68.0) {
                            var7 = 0.0017848042;
                        } else {
                            var7 = -0.0009207887;
                        }
                    } else {
                        if (input[2] < 3.0) {
                            var7 = -0.0024203693;
                        } else {
                            var7 = 0.0057383487;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[2] < 6.0) {
                            var7 = 0.006005339;
                        } else {
                            var7 = -0.00007908866;
                        }
                    } else {
                        if (input[2] < 5.0) {
                            var7 = 0.0031966884;
                        } else {
                            var7 = 0.013713086;
                        }
                    }
                }
            }
        }
        double var8;
        if (input[3] < 2.59) {
            if (input[2] < 9.0) {
                if (input[1] < 5.0) {
                    if (input[0] < 19.0) {
                        if (input[3] < 1.43) {
                            var8 = -0.0024427092;
                        } else {
                            var8 = 0.000075203665;
                        }
                    } else {
                        if (input[0] < 81.0) {
                            var8 = -0.0018618942;
                        } else {
                            var8 = -0.0028136794;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 24.0) {
                            var8 = -0.0010179108;
                        } else {
                            var8 = -0.0022887453;
                        }
                    } else {
                        if (input[0] < 42.0) {
                            var8 = 0.0029221717;
                        } else {
                            var8 = -0.00070977065;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 1.68) {
                        if (input[1] < 2.0) {
                            var8 = -0.0019936105;
                        } else {
                            var8 = -0.003513865;
                        }
                    } else {
                        if (input[0] < 76.0) {
                            var8 = 0.00021912773;
                        } else {
                            var8 = -0.0021941157;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[4] < 2.0) {
                            var8 = -0.0034934294;
                        } else {
                            var8 = 0.0013199646;
                        }
                    } else {
                        if (input[3] < 1.13) {
                            var8 = -0.0019120316;
                        } else {
                            var8 = 0.0056935204;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.17) {
                if (input[0] < 49.0) {
                    if (input[1] < 2.0) {
                        if (input[2] < 3.0) {
                            var8 = -0.0004516808;
                        } else {
                            var8 = -0.0015901536;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var8 = -0.0016637488;
                        } else {
                            var8 = 0.0020710884;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[1] < 2.0) {
                            var8 = 0.0005756284;
                        } else {
                            var8 = -0.002271365;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var8 = -0.0004933627;
                        } else {
                            var8 = 0.0014359094;
                        }
                    }
                }
            } else {
                if (input[4] < 6.0) {
                    if (input[4] < 2.0) {
                        var8 = -0.00048526982;
                    } else {
                        if (input[2] < 4.0) {
                            var8 = 0.0019723922;
                        } else {
                            var8 = 0.00081518077;
                        }
                    }
                } else {
                    if (input[1] < 5.0) {
                        if (input[3] < 4.72) {
                            var8 = 0.0014363293;
                        } else {
                            var8 = 0.0070583667;
                        }
                    } else {
                        if (input[2] < 2.0) {
                            var8 = -0.002194259;
                        } else {
                            var8 = 0.011682308;
                        }
                    }
                }
            }
        }
        double var9;
        if (input[3] < 3.39) {
            if (input[3] < 2.01) {
                if (input[3] < 1.18) {
                    if (input[1] < 2.0) {
                        if (input[0] < 71.0) {
                            var9 = -0.0004214679;
                        } else {
                            var9 = 0.00025074228;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var9 = -0.0014870112;
                        } else {
                            var9 = -0.004495027;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[1] < 2.0) {
                            var9 = -0.0012780519;
                        } else {
                            var9 = -0.0026592517;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var9 = -0.0034342427;
                        } else {
                            var9 = -0.000050333085;
                        }
                    }
                }
            } else {
                if (input[4] < 2.0) {
                    if (input[3] < 2.73) {
                        if (input[1] < 4.0) {
                            var9 = -0.0016727651;
                        } else {
                            var9 = -0.005170415;
                        }
                    } else {
                        if (input[0] < 29.0) {
                            var9 = -0.0019408377;
                        } else {
                            var9 = -0.0003337264;
                        }
                    }
                } else {
                    if (input[1] < 5.0) {
                        if (input[0] < 54.0) {
                            var9 = 0.00018736241;
                        } else {
                            var9 = -0.0011211168;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var9 = -0.00058432575;
                        } else {
                            var9 = 0.0030921232;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.5) {
                        if (input[2] < 3.0) {
                            var9 = 0.000106747146;
                        } else {
                            var9 = -0.0004172822;
                        }
                    } else {
                        if (input[3] < 3.69) {
                            var9 = -0.0008487573;
                        } else {
                            var9 = -0.00046624252;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 3.43) {
                            var9 = -0.001157394;
                        } else {
                            var9 = 0.0010169096;
                        }
                    } else {
                        if (input[0] < 70.0) {
                            var9 = 0.0003647045;
                        } else {
                            var9 = 0.0012478564;
                        }
                    }
                }
            } else {
                if (input[2] < 9.0) {
                    if (input[0] < 63.0) {
                        if (input[1] < 2.0) {
                            var9 = -0.00031867344;
                        } else {
                            var9 = 0.0030172376;
                        }
                    } else {
                        if (input[3] < 4.81) {
                            var9 = -0.0011280413;
                        } else {
                            var9 = 0.004119148;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 4.81) {
                            var9 = 0.00039787916;
                        } else {
                            var9 = 0.004786862;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var9 = 0.003694471;
                        } else {
                            var9 = 0.014289297;
                        }
                    }
                }
            }
        }
        double var10;
        if (input[3] < 3.71) {
            if (input[3] < 2.09) {
                if (input[0] < 76.0) {
                    if (input[2] < 4.0) {
                        if (input[0] < 11.0) {
                            var10 = -0.0010202442;
                        } else {
                            var10 = -0.0021654186;
                        }
                    } else {
                        if (input[3] < 1.25) {
                            var10 = -0.002788578;
                        } else {
                            var10 = 0.000044575663;
                        }
                    }
                } else {
                    if (input[3] < 1.93) {
                        if (input[3] < 1.12) {
                            var10 = -0.0035897777;
                        } else {
                            var10 = -0.001902379;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var10 = -0.005872724;
                        } else {
                            var10 = -0.0024893172;
                        }
                    }
                }
            } else {
                if (input[0] < 19.0) {
                    if (input[1] < 2.0) {
                        if (input[4] < 2.0) {
                            var10 = -0.00021069513;
                        } else {
                            var10 = -0.0016235671;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var10 = -0.0018963127;
                        } else {
                            var10 = 0.002384898;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 92.0) {
                            var10 = -0.0006141115;
                        } else {
                            var10 = -0.002311942;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var10 = -0.00075036834;
                        } else {
                            var10 = 0.003993384;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.73) {
                        var10 = -0.00016525188;
                    } else {
                        var10 = -0.00044681606;
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[0] < 47.0) {
                            var10 = 0.0004435669;
                        } else {
                            var10 = 0.0008996862;
                        }
                    } else {
                        if (input[3] < 4.03) {
                            var10 = 0.0029278162;
                        } else {
                            var10 = 0.0010485885;
                        }
                    }
                }
            } else {
                if (input[3] < 4.57) {
                    if (input[2] < 4.0) {
                        if (input[0] < 45.0) {
                            var10 = 0.0013629444;
                        } else {
                            var10 = -0.004050666;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var10 = 0.0006592671;
                        } else {
                            var10 = 0.006373647;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 4.0) {
                            var10 = 0.0036338985;
                        } else {
                            var10 = -0.0036196567;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var10 = 0.0017603722;
                        } else {
                            var10 = 0.012323461;
                        }
                    }
                }
            }
        }
        double var11;
        if (input[3] < 3.69) {
            if (input[3] < 2.47) {
                if (input[1] < 5.0) {
                    if (input[2] < 9.0) {
                        if (input[0] < 59.0) {
                            var11 = -0.001327999;
                        } else {
                            var11 = -0.0022058038;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var11 = -0.0015810225;
                        } else {
                            var11 = 0.004463689;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.88) {
                            var11 = -0.00018300064;
                        } else {
                            var11 = -0.0060735;
                        }
                    } else {
                        if (input[3] < 1.52) {
                            var11 = -0.0015591624;
                        } else {
                            var11 = 0.0016449714;
                        }
                    }
                }
            } else {
                if (input[0] < 69.0) {
                    if (input[2] < 10.0) {
                        if (input[1] < 2.0) {
                            var11 = -0.0010594109;
                        } else {
                            var11 = 0.0005995883;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var11 = -0.0004325078;
                        } else {
                            var11 = 0.00617192;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[1] < 2.0) {
                            var11 = 0.00057801406;
                        } else {
                            var11 = -0.0028402878;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var11 = -0.00088782556;
                        } else {
                            var11 = 0.00021954358;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 5.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.73) {
                        var11 = -0.00017270446;
                    } else {
                        var11 = -0.0004246405;
                    }
                } else {
                    if (input[2] < 8.0) {
                        if (input[4] < 4.0) {
                            var11 = 0.0007251008;
                        } else {
                            var11 = 0.0013894442;
                        }
                    } else {
                        if (input[3] < 3.73) {
                            var11 = -0.002091811;
                        } else {
                            var11 = 0.00055655726;
                        }
                    }
                }
            } else {
                if (input[3] < 4.86) {
                    if (input[2] < 4.0) {
                        if (input[0] < 73.0) {
                            var11 = 0.000849267;
                        } else {
                            var11 = -0.003709713;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var11 = -0.0025028344;
                        } else {
                            var11 = 0.004149554;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[2] < 6.0) {
                            var11 = 0.0064406632;
                        } else {
                            var11 = -0.00007726388;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var11 = 0.0015410632;
                        } else {
                            var11 = 0.013230677;
                        }
                    }
                }
            }
        }
        double var12;
        if (input[3] < 3.71) {
            if (input[3] < 2.09) {
                if (input[0] < 43.0) {
                    if (input[3] < 1.58) {
                        if (input[2] < 4.0) {
                            var12 = -0.0022323614;
                        } else {
                            var12 = -0.0008957276;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var12 = -0.0033260218;
                        } else {
                            var12 = 0.00093638815;
                        }
                    }
                } else {
                    if (input[0] < 76.0) {
                        if (input[1] < 4.0) {
                            var12 = -0.0018548764;
                        } else {
                            var12 = -0.00083301094;
                        }
                    } else {
                        if (input[3] < 1.93) {
                            var12 = -0.0018962997;
                        } else {
                            var12 = -0.0038231425;
                        }
                    }
                }
            } else {
                if (input[0] < 26.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.76) {
                            var12 = -0.0016829212;
                        } else {
                            var12 = -0.0007744809;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var12 = -0.002015451;
                        } else {
                            var12 = 0.0018938257;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 92.0) {
                            var12 = -0.0011265485;
                        } else {
                            var12 = -0.003508505;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var12 = -0.0019143018;
                        } else {
                            var12 = 0.00041932726;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.73) {
                        var12 = -0.0001539906;
                    } else {
                        var12 = -0.00040356544;
                    }
                } else {
                    if (input[3] < 4.95) {
                        if (input[3] < 4.03) {
                            var12 = 0.0014785007;
                        } else {
                            var12 = 0.0006531681;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var12 = 0.005602221;
                        } else {
                            var12 = 0.00043372155;
                        }
                    }
                }
            } else {
                if (input[3] < 4.57) {
                    if (input[2] < 4.0) {
                        if (input[0] < 36.0) {
                            var12 = 0.0018425636;
                        } else {
                            var12 = -0.003304743;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var12 = 0.0005335217;
                        } else {
                            var12 = 0.005856554;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 4.0) {
                            var12 = 0.0034619272;
                        } else {
                            var12 = -0.0033845806;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var12 = 0.0015553934;
                        } else {
                            var12 = 0.0114020035;
                        }
                    }
                }
            }
        }
        double var13;
        if (input[3] < 3.2) {
            if (input[2] < 4.0) {
                if (input[0] < 9.0) {
                    if (input[3] < 1.76) {
                        if (input[3] < 1.57) {
                            var13 = -0.002375977;
                        } else {
                            var13 = -0.0007617205;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var13 = -0.0021149039;
                        } else {
                            var13 = 0.0017981625;
                        }
                    }
                } else {
                    if (input[3] < 2.65) {
                        if (input[3] < 1.33) {
                            var13 = -0.0009856033;
                        } else {
                            var13 = -0.002059078;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var13 = -0.0000015484251;
                        } else {
                            var13 = -0.0011959192;
                        }
                    }
                }
            } else {
                if (input[3] < 1.35) {
                    if (input[1] < 2.0) {
                        if (input[0] < 40.0) {
                            var13 = -0.00034677904;
                        } else {
                            var13 = 0.00034352564;
                        }
                    } else {
                        if (input[3] < 1.12) {
                            var13 = -0.0045495206;
                        } else {
                            var13 = -0.002313936;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.04) {
                            var13 = -0.0040424913;
                        } else {
                            var13 = -0.0012949841;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var13 = -0.0018407777;
                        } else {
                            var13 = 0.0009798916;
                        }
                    }
                }
            }
        } else {
            if (input[1] < 5.0) {
                if (input[0] < 70.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.95) {
                            var13 = -0.0005701791;
                        } else {
                            var13 = 0.0043875813;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var13 = 0.00044193803;
                        } else {
                            var13 = 0.0022217368;
                        }
                    }
                } else {
                    if (input[3] < 3.83) {
                        if (input[4] < 4.0) {
                            var13 = 0.00029320054;
                        } else {
                            var13 = -0.0026246074;
                        }
                    } else {
                        if (input[3] < 4.93) {
                            var13 = 0.00014103802;
                        } else {
                            var13 = 0.0046215677;
                        }
                    }
                }
            } else {
                if (input[4] < 6.0) {
                    if (input[3] < 3.87) {
                        if (input[4] < 4.0) {
                            var13 = -0.00009621365;
                        } else {
                            var13 = 0.0051745875;
                        }
                    } else {
                        if (input[3] < 4.27) {
                            var13 = -0.0008413857;
                        } else {
                            var13 = 0.000808692;
                        }
                    }
                } else {
                    if (input[3] < 4.42) {
                        if (input[2] < 9.0) {
                            var13 = 0.0005480817;
                        } else {
                            var13 = 0.0070884908;
                        }
                    } else {
                        if (input[2] < 2.0) {
                            var13 = -0.001949656;
                        } else {
                            var13 = 0.011562161;
                        }
                    }
                }
            }
        }
        double var14;
        if (input[3] < 3.73) {
            if (input[1] < 5.0) {
                if (input[3] < 2.19) {
                    if (input[0] < 59.0) {
                        if (input[3] < 1.58) {
                            var14 = -0.0015469956;
                        } else {
                            var14 = -0.00038710007;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var14 = -0.0020857984;
                        } else {
                            var14 = -0.0011345098;
                        }
                    }
                } else {
                    if (input[0] < 12.0) {
                        if (input[1] < 2.0) {
                            var14 = -0.0011229593;
                        } else {
                            var14 = 0.001963793;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var14 = -0.00083112076;
                        } else {
                            var14 = 0.0005707;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 76.0) {
                        if (input[3] < 1.85) {
                            var14 = -0.0019903325;
                        } else {
                            var14 = -0.00007684466;
                        }
                    } else {
                        if (input[3] < 3.37) {
                            var14 = -0.0021886998;
                        } else {
                            var14 = -0.005081787;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[4] < 2.0) {
                            var14 = -0.002164402;
                        } else {
                            var14 = 0.0007336576;
                        }
                    } else {
                        if (input[3] < 1.55) {
                            var14 = -0.00021105923;
                        } else {
                            var14 = 0.0037011483;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[4] < 2.0) {
                    var14 = -0.00039835097;
                } else {
                    if (input[3] < 4.95) {
                        if (input[3] < 4.03) {
                            var14 = 0.0014414991;
                        } else {
                            var14 = 0.00059272116;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var14 = 0.0051404596;
                        } else {
                            var14 = 0.00035039545;
                        }
                    }
                }
            } else {
                if (input[3] < 4.59) {
                    if (input[2] < 4.0) {
                        if (input[1] < 2.0) {
                            var14 = 0.002416041;
                        } else {
                            var14 = -0.0025801805;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var14 = -0.002292943;
                        } else {
                            var14 = 0.003750899;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 4.0) {
                            var14 = 0.0032955424;
                        } else {
                            var14 = -0.0032467984;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var14 = 0.0015316651;
                        } else {
                            var14 = 0.010803371;
                        }
                    }
                }
            }
        }
        double var15;
        if (input[3] < 3.79) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[0] < 31.0) {
                        if (input[1] < 2.0) {
                            var15 = -0.0016449959;
                        } else {
                            var15 = 0.00011051308;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var15 = -0.0008272227;
                        } else {
                            var15 = -0.0016672375;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.68) {
                            var15 = -0.0023929297;
                        } else {
                            var15 = -0.00044530383;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var15 = 0.000045217235;
                        } else {
                            var15 = 0.007558795;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 76.0) {
                        if (input[3] < 1.85) {
                            var15 = -0.0018937435;
                        } else {
                            var15 = -0.00004977499;
                        }
                    } else {
                        if (input[3] < 1.69) {
                            var15 = -0.0008362815;
                        } else {
                            var15 = -0.0034191639;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[4] < 2.0) {
                            var15 = -0.00205919;
                        } else {
                            var15 = 0.00069755904;
                        }
                    } else {
                        if (input[3] < 1.55) {
                            var15 = -0.00020087301;
                        } else {
                            var15 = 0.003625086;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[4] < 2.0) {
                    var15 = -0.00037615353;
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.35) {
                            var15 = 0.00044198227;
                        } else {
                            var15 = 0.0020693273;
                        }
                    } else {
                        if (input[3] < 3.87) {
                            var15 = 0.0022823708;
                        } else {
                            var15 = 0.0003749285;
                        }
                    }
                }
            } else {
                if (input[3] < 4.59) {
                    if (input[2] < 4.0) {
                        if (input[1] < 3.0) {
                            var15 = 0.0015518329;
                        } else {
                            var15 = -0.0029949793;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var15 = 0.00048718657;
                        } else {
                            var15 = 0.005798615;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 4.0) {
                            var15 = 0.0031513572;
                        } else {
                            var15 = -0.0031006932;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var15 = 0.0014609759;
                        } else {
                            var15 = 0.010278215;
                        }
                    }
                }
            }
        }
        double var16;
        if (input[3] < 2.59) {
            if (input[0] < 11.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 1.54) {
                        if (input[2] < 5.0) {
                            var16 = -0.00064251;
                        } else {
                            var16 = -0.0001590848;
                        }
                    } else {
                        if (input[3] < 2.14) {
                            var16 = -0.0039548744;
                        } else {
                            var16 = -0.0010572898;
                        }
                    }
                } else {
                    if (input[3] < 1.42) {
                        if (input[3] < 1.18) {
                            var16 = -0.0025401711;
                        } else {
                            var16 = -0.00075689814;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var16 = 0.0007948608;
                        } else {
                            var16 = 0.0030047118;
                        }
                    }
                }
            } else {
                if (input[2] < 9.0) {
                    if (input[1] < 5.0) {
                        if (input[0] < 79.0) {
                            var16 = -0.0012598428;
                        } else {
                            var16 = -0.0020206668;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var16 = -0.0015443781;
                        } else {
                            var16 = 0.00029771775;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.73) {
                            var16 = -0.0022982701;
                        } else {
                            var16 = -0.000648582;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var16 = -0.0040284107;
                        } else {
                            var16 = 0.0037180171;
                        }
                    }
                }
            }
        } else {
            if (input[1] < 5.0) {
                if (input[3] < 3.79) {
                    if (input[0] < 69.0) {
                        if (input[1] < 2.0) {
                            var16 = -0.0010650618;
                        } else {
                            var16 = 0.00046016593;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var16 = -0.0001348124;
                        } else {
                            var16 = -0.0015732583;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[4] < 2.0) {
                            var16 = -0.000358074;
                        } else {
                            var16 = 0.0005136774;
                        }
                    } else {
                        if (input[0] < 35.0) {
                            var16 = 0.0026861886;
                        } else {
                            var16 = 0.0006941873;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 2.74) {
                        if (input[0] < 62.0) {
                            var16 = 0.004728387;
                        } else {
                            var16 = -0.0007247218;
                        }
                    } else {
                        if (input[3] < 3.5) {
                            var16 = -0.0006273132;
                        } else {
                            var16 = 0.00022992743;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.4) {
                            var16 = -0.001031025;
                        } else {
                            var16 = 0.004496125;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var16 = 0.0025523228;
                        } else {
                            var16 = 0.0051571424;
                        }
                    }
                }
            }
        }
        double var17;
        if (input[3] < 2.59) {
            if (input[0] < 11.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 1.54) {
                        if (input[2] < 5.0) {
                            var17 = -0.00061497267;
                        } else {
                            var17 = -0.00015510917;
                        }
                    } else {
                        if (input[3] < 2.14) {
                            var17 = -0.0037751067;
                        } else {
                            var17 = -0.0010103;
                        }
                    }
                } else {
                    if (input[3] < 1.42) {
                        if (input[3] < 1.18) {
                            var17 = -0.002422234;
                        } else {
                            var17 = -0.0007208572;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var17 = 0.00075625203;
                        } else {
                            var17 = 0.0028578902;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 1.33) {
                        if (input[0] < 63.0) {
                            var17 = -0.0011314854;
                        } else {
                            var17 = 0.00021019057;
                        }
                    } else {
                        if (input[3] < 2.13) {
                            var17 = -0.0021712107;
                        } else {
                            var17 = -0.0012202149;
                        }
                    }
                } else {
                    if (input[3] < 1.25) {
                        if (input[1] < 2.0) {
                            var17 = 0.00046047714;
                        } else {
                            var17 = -0.0034761361;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var17 = -0.0015230508;
                        } else {
                            var17 = 0.0004971902;
                        }
                    }
                }
            }
        } else {
            if (input[1] < 5.0) {
                if (input[3] < 3.79) {
                    if (input[0] < 12.0) {
                        if (input[1] < 2.0) {
                            var17 = -0.0008918519;
                        } else {
                            var17 = 0.0018628249;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var17 = -0.00059446035;
                        } else {
                            var17 = 0.0006265832;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[4] < 2.0) {
                            var17 = -0.0003403205;
                        } else {
                            var17 = 0.000488109;
                        }
                    } else {
                        if (input[0] < 35.0) {
                            var17 = 0.002552845;
                        } else {
                            var17 = 0.00065960357;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 2.74) {
                        if (input[0] < 62.0) {
                            var17 = 0.004525743;
                        } else {
                            var17 = -0.000693661;
                        }
                    } else {
                        if (input[3] < 3.5) {
                            var17 = -0.0005966462;
                        } else {
                            var17 = 0.0002185708;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.4) {
                            var17 = -0.0009803989;
                        } else {
                            var17 = 0.0042853705;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var17 = 0.0024263212;
                        } else {
                            var17 = 0.0049027726;
                        }
                    }
                }
            }
        }
        double var18;
        if (input[3] < 2.59) {
            if (input[2] < 9.0) {
                if (input[0] < 17.0) {
                    if (input[3] < 1.52) {
                        if (input[2] < 4.0) {
                            var18 = -0.0019511378;
                        } else {
                            var18 = -0.0006694276;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var18 = -0.0023152768;
                        } else {
                            var18 = 0.0014290714;
                        }
                    }
                } else {
                    if (input[1] < 5.0) {
                        if (input[0] < 81.0) {
                            var18 = -0.0012068766;
                        } else {
                            var18 = -0.0019206603;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var18 = -0.002348827;
                        } else {
                            var18 = -0.00008607422;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 1.68) {
                        if (input[1] < 2.0) {
                            var18 = -0.0011894435;
                        } else {
                            var18 = -0.002602937;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var18 = -0.0022124324;
                        } else {
                            var18 = 0.00012708573;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[4] < 2.0) {
                            var18 = -0.002698655;
                        } else {
                            var18 = 0.0012097132;
                        }
                    } else {
                        if (input[3] < 1.13) {
                            var18 = -0.0014017205;
                        } else {
                            var18 = 0.0046341037;
                        }
                    }
                }
            }
        } else {
            if (input[2] < 9.0) {
                if (input[0] < 63.0) {
                    if (input[3] < 4.52) {
                        if (input[1] < 2.0) {
                            var18 = -0.0006829387;
                        } else {
                            var18 = 0.0007313371;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var18 = 0.0006925534;
                        } else {
                            var18 = 0.0057818945;
                        }
                    }
                } else {
                    if (input[4] < 7.0) {
                        if (input[3] < 4.81) {
                            var18 = -0.00033444958;
                        } else {
                            var18 = 0.0017654219;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var18 = 0.00021169404;
                        } else {
                            var18 = -0.002814813;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 5.0) {
                        if (input[0] < 52.0) {
                            var18 = 0.0006864797;
                        } else {
                            var18 = -0.0007172531;
                        }
                    } else {
                        var18 = 0.0064358986;
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[4] < 4.0) {
                            var18 = -0.0002484572;
                        } else {
                            var18 = 0.003436255;
                        }
                    } else {
                        if (input[3] < 4.05) {
                            var18 = 0.0070517682;
                        } else {
                            var18 = 0.012911207;
                        }
                    }
                }
            }
        }
        double var19;
        if (input[3] < 2.59) {
            if (input[2] < 9.0) {
                if (input[0] < 17.0) {
                    if (input[3] < 1.52) {
                        if (input[2] < 4.0) {
                            var19 = -0.0018567297;
                        } else {
                            var19 = -0.0006370335;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var19 = -0.0022045458;
                        } else {
                            var19 = 0.0013584887;
                        }
                    }
                } else {
                    if (input[1] < 5.0) {
                        if (input[0] < 79.0) {
                            var19 = -0.0011313608;
                        } else {
                            var19 = -0.0017798342;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var19 = -0.0014139005;
                        } else {
                            var19 = 0.00023173219;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 1.68) {
                        if (input[1] < 2.0) {
                            var19 = -0.0011329437;
                        } else {
                            var19 = -0.0024767339;
                        }
                    } else {
                        if (input[0] < 76.0) {
                            var19 = 0.00032609826;
                        } else {
                            var19 = -0.001691956;
                        }
                    }
                } else {
                    if (input[4] < 5.0) {
                        if (input[4] < 2.0) {
                            var19 = -0.0025772154;
                        } else {
                            var19 = 0.001538083;
                        }
                    } else {
                        if (input[3] < 1.13) {
                            var19 = 0.00003607571;
                        } else {
                            var19 = 0.004874866;
                        }
                    }
                }
            }
        } else {
            if (input[2] < 9.0) {
                if (input[0] < 63.0) {
                    if (input[3] < 4.52) {
                        if (input[1] < 2.0) {
                            var19 = -0.00064899895;
                        } else {
                            var19 = 0.00069483323;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var19 = 0.000658178;
                        } else {
                            var19 = 0.0054995148;
                        }
                    }
                } else {
                    if (input[4] < 7.0) {
                        if (input[3] < 4.81) {
                            var19 = -0.00031776412;
                        } else {
                            var19 = 0.0016795362;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var19 = 0.00020166543;
                        } else {
                            var19 = -0.0026764597;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 5.0) {
                        if (input[0] < 52.0) {
                            var19 = 0.00065255165;
                        } else {
                            var19 = -0.0006817722;
                        }
                    } else {
                        var19 = 0.0062213703;
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[4] < 4.0) {
                            var19 = -0.00023624262;
                        } else {
                            var19 = 0.0032680982;
                        }
                    } else {
                        if (input[3] < 4.05) {
                            var19 = 0.006716809;
                        } else {
                            var19 = 0.012301505;
                        }
                    }
                }
            }
        }
        double var20;
        if (input[3] < 3.2) {
            if (input[2] < 4.0) {
                if (input[0] < 9.0) {
                    if (input[3] < 1.72) {
                        if (input[1] < 3.0) {
                            var20 = -0.0007909095;
                        } else {
                            var20 = -0.0019035231;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var20 = -0.0015288348;
                        } else {
                            var20 = 0.0014520125;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[0] < 78.0) {
                            var20 = -0.00076008536;
                        } else {
                            var20 = 0.0008482296;
                        }
                    } else {
                        if (input[3] < 1.32) {
                            var20 = -0.0006713536;
                        } else {
                            var20 = -0.0015930418;
                        }
                    }
                }
            } else {
                if (input[3] < 1.3) {
                    if (input[1] < 2.0) {
                        if (input[0] < 62.0) {
                            var20 = 0.00018238922;
                        } else {
                            var20 = 0.00083935447;
                        }
                    } else {
                        if (input[3] < 1.12) {
                            var20 = -0.0038901388;
                        } else {
                            var20 = -0.0021138021;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.04) {
                            var20 = -0.0032363029;
                        } else {
                            var20 = -0.0009429958;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var20 = -0.0014986754;
                        } else {
                            var20 = 0.0008288782;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 93.0) {
                if (input[1] < 2.0) {
                    if (input[3] < 4.91) {
                        if (input[2] < 4.0) {
                            var20 = 0.00067324645;
                        } else {
                            var20 = -0.0012493773;
                        }
                    } else {
                        if (input[4] < 3.0) {
                            var20 = -0.00020839572;
                        } else {
                            var20 = 0.00459606;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[4] < 2.0) {
                            var20 = -0.0004499935;
                        } else {
                            var20 = 0.0008900297;
                        }
                    } else {
                        if (input[3] < 4.52) {
                            var20 = 0.0010565638;
                        } else {
                            var20 = 0.0068467804;
                        }
                    }
                }
            } else {
                if (input[4] < 7.0) {
                    if (input[2] < 3.0) {
                        if (input[4] < 4.0) {
                            var20 = -0.0002527644;
                        } else {
                            var20 = -0.004559118;
                        }
                    } else {
                        if (input[3] < 4.88) {
                            var20 = -0.00003730962;
                        } else {
                            var20 = 0.0029711628;
                        }
                    }
                } else {
                    if (input[3] < 3.83) {
                        if (input[1] < 2.0) {
                            var20 = -0.0008251816;
                        } else {
                            var20 = -0.0060337037;
                        }
                    } else {
                        if (input[2] < 2.0) {
                            var20 = -0.0031065862;
                        } else {
                            var20 = 0.00042800186;
                        }
                    }
                }
            }
        }
        double var21;
        if (input[3] < 2.49) {
            if (input[0] < 67.0) {
                if (input[1] < 3.0) {
                    if (input[3] < 1.67) {
                        if (input[1] < 2.0) {
                            var21 = -0.00089022715;
                        } else {
                            var21 = -0.0020095485;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var21 = -0.0017661288;
                        } else {
                            var21 = 0.0002473731;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.74) {
                            var21 = -0.0017924113;
                        } else {
                            var21 = -0.0002269262;
                        }
                    } else {
                        if (input[3] < 1.13) {
                            var21 = -0.0033175894;
                        } else {
                            var21 = 0.0011897187;
                        }
                    }
                }
            } else {
                if (input[2] < 9.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 1.33) {
                            var21 = 0.00077404146;
                        } else {
                            var21 = -0.0010304066;
                        }
                    } else {
                        if (input[3] < 1.2) {
                            var21 = -0.002590737;
                        } else {
                            var21 = -0.0015382109;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[4] < 6.0) {
                            var21 = -0.0012085357;
                        } else {
                            var21 = -0.002820022;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var21 = -0.003001659;
                        } else {
                            var21 = 0.0034381764;
                        }
                    }
                }
            }
        } else {
            if (input[1] < 5.0) {
                if (input[3] < 3.79) {
                    if (input[0] < 12.0) {
                        if (input[1] < 2.0) {
                            var21 = -0.00076480664;
                        } else {
                            var21 = 0.0016015323;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var21 = -0.00059340213;
                        } else {
                            var21 = 0.0005307836;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[4] < 2.0) {
                            var21 = -0.00032418562;
                        } else {
                            var21 = 0.00041645355;
                        }
                    } else {
                        if (input[0] < 35.0) {
                            var21 = 0.0022608354;
                        } else {
                            var21 = 0.0005110645;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 2.95) {
                        if (input[4] < 2.0) {
                            var21 = -0.0009137005;
                        } else {
                            var21 = 0.0025304416;
                        }
                    } else {
                        if (input[3] < 3.31) {
                            var21 = -0.0012174577;
                        } else {
                            var21 = 0.00007095313;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[0] < 88.0) {
                            var21 = 0.0002936672;
                        } else {
                            var21 = -0.0046031834;
                        }
                    } else {
                        if (input[3] < 4.31) {
                            var21 = 0.002349789;
                        } else {
                            var21 = 0.004571707;
                        }
                    }
                }
            }
        }
        double var22;
        if (input[3] < 3.09) {
            if (input[1] < 5.0) {
                if (input[2] < 9.0) {
                    if (input[0] < 79.0) {
                        if (input[3] < 1.58) {
                            var22 = -0.0012137184;
                        } else {
                            var22 = -0.00053828204;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var22 = -0.001063146;
                        } else {
                            var22 = -0.0024101934;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[0] < 40.0) {
                            var22 = -0.00005777152;
                        } else {
                            var22 = -0.0014760346;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var22 = 0.00038894056;
                        } else {
                            var22 = 0.005723568;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 2.64) {
                        if (input[0] < 71.0) {
                            var22 = -0.0009025258;
                        } else {
                            var22 = -0.0018629733;
                        }
                    } else {
                        if (input[0] < 18.0) {
                            var22 = 0.0017508924;
                        } else {
                            var22 = -0.00017674729;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.85) {
                            var22 = 0.0013629968;
                        } else {
                            var22 = -0.003987731;
                        }
                    } else {
                        if (input[3] < 1.44) {
                            var22 = -0.0010209188;
                        } else {
                            var22 = 0.0023826144;
                        }
                    }
                }
            }
        } else {
            if (input[2] < 9.0) {
                if (input[0] < 58.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.95) {
                            var22 = -0.0005546467;
                        } else {
                            var22 = 0.0030649106;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var22 = 0.00030968347;
                        } else {
                            var22 = 0.0017174211;
                        }
                    }
                } else {
                    if (input[4] < 7.0) {
                        if (input[3] < 4.79) {
                            var22 = -0.00022818998;
                        } else {
                            var22 = 0.0016871177;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var22 = 0.00023242613;
                        } else {
                            var22 = -0.003051267;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 5.0) {
                        if (input[0] < 52.0) {
                            var22 = 0.00084185106;
                        } else {
                            var22 = -0.00061170175;
                        }
                    } else {
                        var22 = 0.0058062393;
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 4.03) {
                            var22 = 0.0032067613;
                        } else {
                            var22 = -0.00041265186;
                        }
                    } else {
                        if (input[3] < 3.73) {
                            var22 = 0.004488559;
                        } else {
                            var22 = 0.010908363;
                        }
                    }
                }
            }
        }
        double var23;
        if (input[3] < 3.73) {
            if (input[0] < 76.0) {
                if (input[1] < 3.0) {
                    if (input[3] < 2.14) {
                        if (input[3] < 1.93) {
                            var23 = -0.0010182151;
                        } else {
                            var23 = -0.0018956794;
                        }
                    } else {
                        if (input[3] < 3.58) {
                            var23 = -0.00027826105;
                        } else {
                            var23 = -0.0019155479;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[3] < 1.3) {
                            var23 = -0.0014932115;
                        } else {
                            var23 = 0.00019791709;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var23 = 0.000042349544;
                        } else {
                            var23 = 0.0032037143;
                        }
                    }
                }
            } else {
                if (input[2] < 6.0) {
                    if (input[1] < 2.0) {
                        if (input[2] < 4.0) {
                            var23 = 0.0007151354;
                        } else {
                            var23 = -0.0008911591;
                        }
                    } else {
                        if (input[3] < 1.74) {
                            var23 = -0.0009624295;
                        } else {
                            var23 = -0.0022162558;
                        }
                    }
                } else {
                    if (input[3] < 1.68) {
                        if (input[1] < 2.0) {
                            var23 = -0.00034132824;
                        } else {
                            var23 = -0.0023360292;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var23 = -0.00091165677;
                        } else {
                            var23 = 0.0005887248;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[4] < 2.0) {
                    if (input[1] < 3.0) {
                        if (input[0] < 47.0) {
                            var23 = -0.00031825542;
                        } else {
                            var23 = -0.00020057133;
                        }
                    } else {
                        if (input[3] < 4.81) {
                            var23 = -0.00034544186;
                        } else {
                            var23 = -0.00048853457;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.35) {
                            var23 = 0.00020295668;
                        } else {
                            var23 = 0.0017107374;
                        }
                    } else {
                        if (input[3] < 3.87) {
                            var23 = 0.0018411287;
                        } else {
                            var23 = 0.000090611626;
                        }
                    }
                }
            } else {
                if (input[3] < 4.81) {
                    if (input[2] < 9.0) {
                        if (input[0] < 64.0) {
                            var23 = 0.0014118272;
                        } else {
                            var23 = -0.0015158763;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var23 = 0.00002417381;
                        } else {
                            var23 = 0.010245782;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 2.0) {
                            var23 = 0.0036268593;
                        } else {
                            var23 = -0.0016699642;
                        }
                    } else {
                        if (input[2] < 1.0) {
                            var23 = -0.00081298355;
                        } else {
                            var23 = 0.009183235;
                        }
                    }
                }
            }
        }
        double var24;
        if (input[3] < 2.49) {
            if (input[0] < 22.0) {
                if (input[1] < 3.0) {
                    if (input[3] < 1.67) {
                        if (input[3] < 1.57) {
                            var24 = -0.0011315522;
                        } else {
                            var24 = -0.0036743004;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var24 = -0.0015024974;
                        } else {
                            var24 = 0.0010378301;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.69) {
                            var24 = -0.0017321944;
                        } else {
                            var24 = 0.0007859462;
                        }
                    } else {
                        if (input[3] < 1.1) {
                            var24 = -0.0030295823;
                        } else {
                            var24 = 0.002066857;
                        }
                    }
                }
            } else {
                if (input[0] < 76.0) {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.33) {
                            var24 = -0.00051454036;
                        } else {
                            var24 = -0.0013447757;
                        }
                    } else {
                        if (input[3] < 1.25) {
                            var24 = -0.0020686071;
                        } else {
                            var24 = 0.00004305672;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 1.28) {
                            var24 = 0.0008146545;
                        } else {
                            var24 = -0.0012388959;
                        }
                    } else {
                        if (input[2] < 7.0) {
                            var24 = -0.0017514048;
                        } else {
                            var24 = -0.000743461;
                        }
                    }
                }
            }
        } else {
            if (input[2] < 9.0) {
                if (input[0] < 31.0) {
                    if (input[4] < 2.0) {
                        if (input[3] < 3.11) {
                            var24 = -0.0022376017;
                        } else {
                            var24 = -0.00057569426;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var24 = -0.00044359226;
                        } else {
                            var24 = 0.0016113166;
                        }
                    }
                } else {
                    if (input[3] < 4.5) {
                        if (input[2] < 4.0) {
                            var24 = -0.00094246457;
                        } else {
                            var24 = 0.0000635659;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var24 = 0.00009710524;
                        } else {
                            var24 = 0.0016311174;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 5.0) {
                        if (input[1] < 2.0) {
                            var24 = -0.0011155109;
                        } else {
                            var24 = 0.00026847364;
                        }
                    } else {
                        var24 = 0.0054581286;
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[4] < 4.0) {
                            var24 = -0.00030894557;
                        } else {
                            var24 = 0.002827619;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var24 = 0.010668668;
                        } else {
                            var24 = 0.005801261;
                        }
                    }
                }
            }
        }
        double var25;
        if (input[3] < 3.73) {
            if (input[0] < 89.0) {
                if (input[1] < 5.0) {
                    if (input[2] < 9.0) {
                        if (input[3] < 2.06) {
                            var25 = -0.000965904;
                        } else {
                            var25 = -0.00028437236;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var25 = -0.00056334666;
                        } else {
                            var25 = 0.0036779076;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.64) {
                            var25 = -0.00092157297;
                        } else {
                            var25 = 0.0002177465;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var25 = -0.00013571445;
                        } else {
                            var25 = 0.002536006;
                        }
                    }
                }
            } else {
                if (input[2] < 6.0) {
                    if (input[3] < 1.74) {
                        if (input[2] < 4.0) {
                            var25 = 0.00031628375;
                        } else {
                            var25 = -0.0015299175;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var25 = 0.00037707438;
                        } else {
                            var25 = -0.0029796232;
                        }
                    }
                } else {
                    if (input[3] < 1.78) {
                        if (input[1] < 2.0) {
                            var25 = -0.0007635141;
                        } else {
                            var25 = -0.0027480775;
                        }
                    } else {
                        if (input[0] < 98.0) {
                            var25 = -0.00006045766;
                        } else {
                            var25 = -0.0015930852;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 6.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 4.81) {
                        if (input[1] < 2.0) {
                            var25 = -0.00015333245;
                        } else {
                            var25 = -0.0002938517;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var25 = -0.0004569909;
                        } else {
                            var25 = -0.0000880003;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.35) {
                            var25 = 0.00021301147;
                        } else {
                            var25 = 0.0015942376;
                        }
                    } else {
                        if (input[3] < 3.87) {
                            var25 = 0.0017217953;
                        } else {
                            var25 = 0.00005059105;
                        }
                    }
                }
            } else {
                if (input[3] < 4.81) {
                    if (input[2] < 4.0) {
                        if (input[1] < 2.0) {
                            var25 = 0.0020115366;
                        } else {
                            var25 = -0.002701724;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var25 = -0.0026325241;
                        } else {
                            var25 = 0.003406976;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[2] < 2.0) {
                            var25 = 0.003495413;
                        } else {
                            var25 = -0.0016082436;
                        }
                    } else {
                        if (input[2] < 1.0) {
                            var25 = -0.0008334398;
                        } else {
                            var25 = 0.0086444905;
                        }
                    }
                }
            }
        }
        double var26;
        if (input[3] < 2.49) {
            if (input[0] < 22.0) {
                if (input[1] < 3.0) {
                    if (input[3] < 1.67) {
                        if (input[3] < 1.57) {
                            var26 = -0.0010316928;
                        } else {
                            var26 = -0.003484313;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var26 = -0.0014016938;
                        } else {
                            var26 = 0.0010147493;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.69) {
                            var26 = -0.0016016487;
                        } else {
                            var26 = 0.00078158843;
                        }
                    } else {
                        if (input[3] < 1.1) {
                            var26 = -0.002900322;
                        } else {
                            var26 = 0.0019448072;
                        }
                    }
                }
            } else {
                if (input[3] < 1.13) {
                    if (input[2] < 4.0) {
                        if (input[0] < 69.0) {
                            var26 = -0.00040268214;
                        } else {
                            var26 = 0.00090345315;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var26 = -0.00036467303;
                        } else {
                            var26 = -0.004143506;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.33) {
                            var26 = -0.00006761563;
                        } else {
                            var26 = -0.0014156303;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var26 = -0.001142999;
                        } else {
                            var26 = 0.00006496818;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 93.0) {
                if (input[1] < 5.0) {
                    if (input[3] < 3.79) {
                        if (input[0] < 12.0) {
                            var26 = 0.000858029;
                        } else {
                            var26 = -0.00024579704;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var26 = 0.000108195774;
                        } else {
                            var26 = 0.001081437;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 2.76) {
                            var26 = 0.0021025871;
                        } else {
                            var26 = -0.00013483655;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var26 = 0.00030930972;
                        } else {
                            var26 = 0.0029787372;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[3] < 2.92) {
                        if (input[2] < 3.0) {
                            var26 = -0.001090194;
                        } else {
                            var26 = -0.002131193;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var26 = 0.00073588104;
                        } else {
                            var26 = -0.00022122322;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[1] < 2.0) {
                            var26 = 0.0024339824;
                        } else {
                            var26 = -0.0050275642;
                        }
                    } else {
                        if (input[3] < 3.66) {
                            var26 = -0.0019760008;
                        } else {
                            var26 = 0.0002519634;
                        }
                    }
                }
            }
        }
        double var27;
        if (input[3] < 3.2) {
            if (input[2] < 4.0) {
                if (input[0] < 1.0) {
                    if (input[3] < 2.78) {
                        if (input[2] < 2.0) {
                            var27 = -0.0006991327;
                        } else {
                            var27 = 0.0007882397;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var27 = -0.00032625796;
                        } else {
                            var27 = 0.0042194463;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[0] < 78.0) {
                            var27 = -0.00055506494;
                        } else {
                            var27 = 0.0009344704;
                        }
                    } else {
                        if (input[0] < 9.0) {
                            var27 = 0.000071569244;
                        } else {
                            var27 = -0.0011071;
                        }
                    }
                }
            } else {
                if (input[3] < 1.3) {
                    if (input[1] < 2.0) {
                        if (input[0] < 40.0) {
                            var27 = 0.0002581743;
                        } else {
                            var27 = 0.00089324004;
                        }
                    } else {
                        if (input[0] < 37.0) {
                            var27 = -0.0013922283;
                        } else {
                            var27 = -0.0029612882;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.04) {
                            var27 = -0.002776255;
                        } else {
                            var27 = -0.0007184229;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var27 = -0.0012988086;
                        } else {
                            var27 = 0.00074409664;
                        }
                    }
                }
            }
        } else {
            if (input[0] < 23.0) {
                if (input[1] < 2.0) {
                    if (input[4] < 6.0) {
                        if (input[3] < 3.73) {
                            var27 = -0.0027299712;
                        } else {
                            var27 = 0.00040293025;
                        }
                    } else {
                        if (input[3] < 3.33) {
                            var27 = 0.00036099256;
                        } else {
                            var27 = -0.0023424523;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.48) {
                            var27 = 0.0023694446;
                        } else {
                            var27 = -0.00021715807;
                        }
                    } else {
                        if (input[3] < 3.45) {
                            var27 = 0.001104091;
                        } else {
                            var27 = 0.0033915557;
                        }
                    }
                }
            } else {
                if (input[3] < 4.59) {
                    if (input[2] < 4.0) {
                        if (input[4] < 4.0) {
                            var27 = 0.00037553508;
                        } else {
                            var27 = -0.0017108683;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var27 = -0.001055698;
                        } else {
                            var27 = 0.00072341895;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[2] < 4.0) {
                            var27 = 0.001865581;
                        } else {
                            var27 = -0.00014834004;
                        }
                    } else {
                        if (input[2] < 5.0) {
                            var27 = 0.00016757062;
                        } else {
                            var27 = 0.00586397;
                        }
                    }
                }
            }
        }
        double var28;
        if (input[3] < 2.49) {
            if (input[0] < 44.0) {
                if (input[2] < 4.0) {
                    if (input[3] < 1.74) {
                        if (input[3] < 1.4) {
                            var28 = -0.000741437;
                        } else {
                            var28 = -0.0021800809;
                        }
                    } else {
                        if (input[0] < 10.0) {
                            var28 = 0.0008550508;
                        } else {
                            var28 = -0.00080174627;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 1.67) {
                            var28 = -0.0013365598;
                        } else {
                            var28 = -0.00013718336;
                        }
                    } else {
                        if (input[3] < 1.1) {
                            var28 = -0.003091764;
                        } else {
                            var28 = 0.0012315081;
                        }
                    }
                }
            } else {
                if (input[0] < 76.0) {
                    if (input[0] < 75.0) {
                        if (input[3] < 2.01) {
                            var28 = -0.0008835094;
                        } else {
                            var28 = -0.00023302979;
                        }
                    } else {
                        if (input[3] < 1.65) {
                            var28 = -0.0001864771;
                        } else {
                            var28 = 0.0016970001;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 1.42) {
                            var28 = 0.00075660663;
                        } else {
                            var28 = -0.0010622204;
                        }
                    } else {
                        if (input[2] < 7.0) {
                            var28 = -0.0015331043;
                        } else {
                            var28 = -0.00065724936;
                        }
                    }
                }
            }
        } else {
            if (input[2] < 9.0) {
                if (input[0] < 31.0) {
                    if (input[4] < 2.0) {
                        if (input[3] < 3.11) {
                            var28 = -0.0020820273;
                        } else {
                            var28 = -0.00053622486;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var28 = -0.00041444297;
                        } else {
                            var28 = 0.0014215949;
                        }
                    }
                } else {
                    if (input[3] < 4.5) {
                        if (input[4] < 5.0) {
                            var28 = 0.000056676556;
                        } else {
                            var28 = -0.0009045936;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var28 = 0.00004823711;
                        } else {
                            var28 = 0.0013647567;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 5.0) {
                        if (input[0] < 96.0) {
                            var28 = 0.000018476843;
                        } else {
                            var28 = -0.0027158938;
                        }
                    } else {
                        var28 = 0.0049999557;
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[4] < 4.0) {
                            var28 = -0.0003543214;
                        } else {
                            var28 = 0.002488633;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var28 = 0.00990058;
                        } else {
                            var28 = 0.005159299;
                        }
                    }
                }
            }
        }
        return subroutine2(input) + var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12 + var13 + var14 + var15 + var16 + var17 + var18 + var19 + var20 + var21 + var22 + var23 + var24 + var25 + var26 + var27 + var28;
    }
    public static double subroutine2(double[] input) {
        double var0;
        if (input[3] < 2.78) {
            if (input[3] < 1.93) {
                if (input[2] < 4.0) {
                    var0 = -0.068523176;
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.51) {
                            var0 = -0.06608457;
                        } else {
                            var0 = -0.050990254;
                        }
                    } else {
                        if (input[3] < 1.68) {
                            var0 = -0.041853186;
                        } else {
                            var0 = -0.01774179;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 2.34) {
                        if (input[0] < 43.0) {
                            var0 = -0.04423323;
                        } else {
                            var0 = -0.05741013;
                        }
                    } else {
                        if (input[0] < 18.0) {
                            var0 = -0.0212085;
                        } else {
                            var0 = -0.033755254;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.45) {
                            var0 = -0.057751805;
                        } else {
                            var0 = -0.037458234;
                        }
                    } else {
                        if (input[3] < 2.43) {
                            var0 = -0.012349739;
                        } else {
                            var0 = 0.006970232;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                var0 = -0.019939331;
            } else {
                if (input[3] < 3.58) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.2) {
                            var0 = -0.02030882;
                        } else {
                            var0 = -0.00074199884;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var0 = 0.0035095399;
                        } else {
                            var0 = 0.035232972;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.61) {
                            var0 = 0.011734529;
                        } else {
                            var0 = 0.029452259;
                        }
                    } else {
                        if (input[3] < 4.03) {
                            var0 = 0.04837375;
                        } else {
                            var0 = 0.07812679;
                        }
                    }
                }
            }
        }
        double var1;
        if (input[3] < 2.72) {
            if (input[3] < 1.93) {
                if (input[2] < 4.0) {
                    var1 = -0.06510961;
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.51) {
                            var1 = -0.06280194;
                        } else {
                            var1 = -0.048461806;
                        }
                    } else {
                        if (input[3] < 1.48) {
                            var1 = -0.04316787;
                        } else {
                            var1 = -0.023498498;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 2.34) {
                        if (input[0] < 43.0) {
                            var1 = -0.0420667;
                        } else {
                            var1 = -0.054578405;
                        }
                    } else {
                        if (input[0] < 18.0) {
                            var1 = -0.020161787;
                        } else {
                            var1 = -0.033373013;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.39) {
                            var1 = -0.056462985;
                        } else {
                            var1 = -0.039229345;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var1 = -0.014733004;
                        } else {
                            var1 = 0.0029677658;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                var1 = -0.0190563;
            } else {
                if (input[3] < 3.58) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.13) {
                            var1 = -0.023064606;
                        } else {
                            var1 = -0.002102004;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var1 = 0.0019448806;
                        } else {
                            var1 = 0.0322605;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.61) {
                            var1 = 0.011265149;
                        } else {
                            var1 = 0.027984504;
                        }
                    } else {
                        if (input[3] < 4.03) {
                            var1 = 0.04596728;
                        } else {
                            var1 = 0.074229665;
                        }
                    }
                }
            }
        }
        double var2;
        if (input[3] < 2.78) {
            if (input[3] < 1.93) {
                if (input[2] < 4.0) {
                    var2 = -0.061866093;
                } else {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var2 = -0.06334458;
                        } else {
                            var2 = -0.052439988;
                        }
                    } else {
                        if (input[3] < 1.35) {
                            var2 = -0.049305055;
                        } else {
                            var2 = -0.03037262;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 2.34) {
                        if (input[0] < 43.0) {
                            var2 = -0.040006287;
                        } else {
                            var2 = -0.05188637;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var2 = -0.037185844;
                        } else {
                            var2 = -0.025677292;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.49) {
                            var2 = -0.05177899;
                        } else {
                            var2 = -0.03292344;
                        }
                    } else {
                        if (input[3] < 2.37) {
                            var2 = -0.012323259;
                        } else {
                            var2 = 0.005523547;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                var2 = -0.017998172;
            } else {
                if (input[3] < 3.61) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.23) {
                            var2 = -0.0173213;
                        } else {
                            var2 = 0.0007952097;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var2 = 0.0043451297;
                        } else {
                            var2 = 0.032740835;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        var2 = 0.026589891;
                    } else {
                        if (input[1] < 2.0) {
                            var2 = 0.03835396;
                        } else {
                            var2 = 0.069730416;
                        }
                    }
                }
            }
        }
        double var3;
        if (input[3] < 2.78) {
            if (input[3] < 1.93) {
                if (input[2] < 4.0) {
                    var3 = -0.058784164;
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.51) {
                            var3 = -0.05700391;
                        } else {
                            var3 = -0.04372917;
                        }
                    } else {
                        if (input[3] < 1.68) {
                            var3 = -0.03594279;
                        } else {
                            var3 = -0.014257922;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 2.4) {
                        if (input[0] < 43.0) {
                            var3 = -0.036884226;
                        } else {
                            var3 = -0.048755504;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var3 = -0.03409117;
                        } else {
                            var3 = -0.023165554;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.43) {
                            var3 = -0.050106388;
                        } else {
                            var3 = -0.032759022;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var3 = -0.012704927;
                        } else {
                            var3 = 0.0050012455;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                var3 = -0.017102242;
            } else {
                if (input[3] < 3.92) {
                    if (input[2] < 4.0) {
                        if (input[3] < 3.37) {
                            var3 = -0.005126777;
                        } else {
                            var3 = 0.016783196;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var3 = -0.003340092;
                        } else {
                            var3 = 0.035356108;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        var3 = 0.025712704;
                    } else {
                        if (input[1] < 2.0) {
                            var3 = 0.043550372;
                        } else {
                            var3 = 0.071358845;
                        }
                    }
                }
            }
        }
        double var4;
        if (input[3] < 2.72) {
            if (input[3] < 1.93) {
                if (input[2] < 4.0) {
                    var4 = -0.05585576;
                } else {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var4 = -0.05764088;
                        } else {
                            var4 = -0.047323074;
                        }
                    } else {
                        if (input[3] < 1.48) {
                            var4 = -0.04172529;
                        } else {
                            var4 = -0.024627775;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.34) {
                        var4 = -0.05075514;
                    } else {
                        var4 = -0.035556365;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.34) {
                            var4 = -0.040910877;
                        } else {
                            var4 = -0.023840215;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var4 = -0.013166725;
                        } else {
                            var4 = 0.002862364;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                var4 = -0.016363433;
            } else {
                if (input[3] < 3.58) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.11) {
                            var4 = -0.020811545;
                        } else {
                            var4 = -0.0022055819;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var4 = 0.0017130598;
                        } else {
                            var4 = 0.027516423;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.61) {
                            var4 = 0.010206143;
                        } else {
                            var4 = 0.023980154;
                        }
                    } else {
                        if (input[3] < 4.03) {
                            var4 = 0.039097346;
                        } else {
                            var4 = 0.06412422;
                        }
                    }
                }
            }
        }
        double var5;
        if (input[3] < 2.78) {
            if (input[3] < 1.98) {
                if (input[2] < 4.0) {
                    var5 = -0.052901424;
                } else {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var5 = -0.054888185;
                        } else {
                            var5 = -0.041621722;
                        }
                    } else {
                        if (input[3] < 1.7) {
                            var5 = -0.031934854;
                        } else {
                            var5 = -0.010335953;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.51) {
                        var5 = -0.043909393;
                    } else {
                        var5 = -0.02852406;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.4) {
                            var5 = -0.036594998;
                        } else {
                            var5 = -0.020995796;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var5 = -0.010477173;
                        } else {
                            var5 = 0.006145553;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                var5 = -0.015436365;
            } else {
                if (input[3] < 3.58) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.18) {
                            var5 = -0.016847815;
                        } else {
                            var5 = -0.00086478516;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var5 = 0.002863729;
                        } else {
                            var5 = 0.027106866;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.61) {
                            var5 = 0.009797895;
                        } else {
                            var5 = 0.022785103;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var5 = 0.036447298;
                        } else {
                            var5 = 0.061254825;
                        }
                    }
                }
            }
        }
        double var6;
        if (input[3] < 2.9) {
            if (input[3] < 2.25) {
                if (input[2] < 4.0) {
                    if (input[3] < 2.06) {
                        var6 = -0.050006803;
                    } else {
                        if (input[0] < 38.0) {
                            var6 = -0.029866347;
                        } else {
                            var6 = -0.04141754;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var6 = -0.051374346;
                        } else {
                            var6 = -0.03984788;
                        }
                    } else {
                        if (input[3] < 1.68) {
                            var6 = -0.034853656;
                        } else {
                            var6 = -0.012616816;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.59) {
                        var6 = -0.036491927;
                    } else {
                        var6 = -0.024830086;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.53) {
                            var6 = -0.027273921;
                        } else {
                            var6 = -0.017024906;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var6 = -0.0045334618;
                        } else {
                            var6 = 0.0144440085;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                var6 = -0.014601384;
            } else {
                if (input[3] < 3.94) {
                    if (input[2] < 4.0) {
                        if (input[3] < 3.37) {
                            var6 = -0.0029186124;
                        } else {
                            var6 = 0.014228548;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var6 = -0.00083176757;
                        } else {
                            var6 = 0.03241651;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        var6 = 0.022102257;
                    } else {
                        if (input[1] < 2.0) {
                            var6 = 0.036243774;
                        } else {
                            var6 = 0.062342096;
                        }
                    }
                }
            }
        }
        double var7;
        if (input[3] < 2.67) {
            if (input[3] < 1.93) {
                if (input[2] < 4.0) {
                    var7 = -0.047946744;
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.51) {
                            var7 = -0.047317583;
                        } else {
                            var7 = -0.035442457;
                        }
                    } else {
                        if (input[3] < 1.48) {
                            var7 = -0.031763654;
                        } else {
                            var7 = -0.016149653;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.34) {
                        var7 = -0.0438064;
                    } else {
                        var7 = -0.030808872;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.25) {
                            var7 = -0.03707609;
                        } else {
                            var7 = -0.022781914;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var7 = -0.012483239;
                        } else {
                            var7 = 0.0016669352;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                var7 = -0.014220247;
            } else {
                if (input[3] < 3.45) {
                    if (input[2] < 4.0) {
                        if (input[3] < 3.12) {
                            var7 = -0.012334451;
                        } else {
                            var7 = 0.0034694162;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var7 = 0.0003379422;
                        } else {
                            var7 = 0.025647093;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.82) {
                            var7 = 0.017033804;
                        } else {
                            var7 = 0.020936636;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var7 = 0.030241717;
                        } else {
                            var7 = 0.054681342;
                        }
                    }
                }
            }
        }
        double var8;
        if (input[3] < 2.9) {
            if (input[3] < 2.16) {
                if (input[2] < 4.0) {
                    if (input[3] < 2.01) {
                        var8 = -0.04541856;
                    } else {
                        var8 = -0.03600374;
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var8 = -0.047346488;
                        } else {
                            var8 = -0.03721037;
                        }
                    } else {
                        if (input[3] < 1.67) {
                            var8 = -0.031519182;
                        } else {
                            var8 = -0.012280749;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.55) {
                        var8 = -0.03456763;
                    } else {
                        var8 = -0.023329645;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 61.0) {
                            var8 = -0.016515262;
                        } else {
                            var8 = -0.028153995;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var8 = -0.005166612;
                        } else {
                            var8 = 0.011429287;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                var8 = -0.013166941;
            } else {
                if (input[3] < 3.99) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.33) {
                            var8 = -0.010826318;
                        } else {
                            var8 = 0.00423355;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var8 = 0.008661634;
                        } else {
                            var8 = 0.029670358;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        var8 = 0.01997598;
                    } else {
                        if (input[1] < 2.0) {
                            var8 = 0.03310104;
                        } else {
                            var8 = 0.05753827;
                        }
                    }
                }
            }
        }
        double var9;
        if (input[3] < 2.86) {
            if (input[3] < 2.25) {
                if (input[2] < 4.0) {
                    if (input[3] < 2.06) {
                        var9 = -0.042937227;
                    } else {
                        if (input[0] < 41.0) {
                            var9 = -0.025472546;
                        } else {
                            var9 = -0.036143627;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.55) {
                            var9 = -0.042739853;
                        } else {
                            var9 = -0.030029451;
                        }
                    } else {
                        if (input[3] < 1.7) {
                            var9 = -0.02580269;
                        } else {
                            var9 = -0.007026182;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.57) {
                        var9 = -0.03159088;
                    } else {
                        var9 = -0.022335311;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 32.0) {
                            var9 = -0.012099322;
                        } else {
                            var9 = -0.02239244;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var9 = -0.01806347;
                        } else {
                            var9 = 0.0072896117;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                var9 = -0.012520345;
            } else {
                if (input[3] < 3.94) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.29) {
                            var9 = -0.011661594;
                        } else {
                            var9 = 0.0029926125;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var9 = 0.007414706;
                        } else {
                            var9 = 0.027554944;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        var9 = 0.018959371;
                    } else {
                        if (input[1] < 2.0) {
                            var9 = 0.030620787;
                        } else {
                            var9 = 0.05406646;
                        }
                    }
                }
            }
        }
        double var10;
        if (input[3] < 2.67) {
            if (input[3] < 1.87) {
                if (input[2] < 4.0) {
                    var10 = -0.04155884;
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.47) {
                            var10 = -0.041438904;
                        } else {
                            var10 = -0.031724226;
                        }
                    } else {
                        if (input[3] < 1.33) {
                            var10 = -0.030631313;
                        } else {
                            var10 = -0.017203856;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.24) {
                        var10 = -0.04142758;
                    } else {
                        if (input[3] < 2.53) {
                            var10 = -0.03060518;
                        } else {
                            var10 = -0.022963928;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.34) {
                            var10 = -0.030668784;
                        } else {
                            var10 = -0.017776387;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var10 = -0.011362978;
                        } else {
                            var10 = 0.0013901866;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                if (input[3] < 2.86) {
                    var10 = -0.014754908;
                } else {
                    var10 = -0.011897188;
                }
            } else {
                if (input[3] < 3.45) {
                    if (input[2] < 4.0) {
                        if (input[3] < 3.12) {
                            var10 = -0.011060652;
                        } else {
                            var10 = 0.0028133856;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var10 = -0.0004945736;
                        } else {
                            var10 = 0.022076983;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.82) {
                            var10 = 0.014315343;
                        } else {
                            var10 = 0.017964223;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var10 = 0.025362367;
                        } else {
                            var10 = 0.04769857;
                        }
                    }
                }
            }
        }
        double var11;
        if (input[3] < 2.9) {
            if (input[3] < 2.25) {
                if (input[2] < 4.0) {
                    if (input[3] < 2.06) {
                        var11 = -0.03880243;
                    } else {
                        if (input[0] < 41.0) {
                            var11 = -0.022760024;
                        } else {
                            var11 = -0.03280675;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var11 = -0.04069605;
                        } else {
                            var11 = -0.031079797;
                        }
                    } else {
                        if (input[3] < 1.68) {
                            var11 = -0.026960013;
                        } else {
                            var11 = -0.009770015;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.59) {
                        var11 = -0.028349016;
                    } else {
                        var11 = -0.020017313;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 50.0) {
                            var11 = -0.0124294115;
                        } else {
                            var11 = -0.0217723;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var11 = -0.016508678;
                        } else {
                            var11 = 0.0070001693;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var11 = -0.011296385;
                } else {
                    if (input[3] < 3.47) {
                        if (input[1] < 2.0) {
                            var11 = -0.0072121294;
                        } else {
                            var11 = 0.008358202;
                        }
                    } else {
                        if (input[3] < 3.82) {
                            var11 = 0.013816686;
                        } else {
                            var11 = 0.017069457;
                        }
                    }
                }
            } else {
                if (input[3] < 4.03) {
                    if (input[2] < 4.0) {
                        if (input[3] < 3.37) {
                            var11 = -0.0026145307;
                        } else {
                            var11 = 0.010504901;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var11 = 0.015185662;
                        } else {
                            var11 = 0.044938248;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.52) {
                            var11 = 0.017470904;
                        } else {
                            var11 = 0.041341208;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var11 = 0.03366206;
                        } else {
                            var11 = 0.05730557;
                        }
                    }
                }
            }
        }
        double var12;
        if (input[3] < 2.95) {
            if (input[3] < 2.25) {
                if (input[2] < 4.0) {
                    if (input[3] < 2.01) {
                        var12 = -0.037070613;
                    } else {
                        if (input[0] < 23.0) {
                            var12 = -0.020491485;
                        } else {
                            var12 = -0.031202868;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var12 = -0.03867894;
                        } else {
                            var12 = -0.029539203;
                        }
                    } else {
                        if (input[3] < 1.72) {
                            var12 = -0.025089739;
                        } else {
                            var12 = -0.008545196;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.59) {
                        var12 = -0.026956877;
                    } else {
                        var12 = -0.018872388;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.55) {
                            var12 = -0.020288331;
                        } else {
                            var12 = -0.010924091;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var12 = -0.0038096593;
                        } else {
                            var12 = 0.012160437;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var12 = -0.010733167;
                } else {
                    if (input[3] < 3.47) {
                        if (input[2] < 4.0) {
                            var12 = -0.0005030976;
                        } else {
                            var12 = 0.0095542995;
                        }
                    } else {
                        if (input[3] < 3.7) {
                            var12 = 0.012161557;
                        } else {
                            var12 = 0.0160454;
                        }
                    }
                }
            } else {
                if (input[3] < 4.03) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.73) {
                            var12 = -0.0047581317;
                        } else {
                            var12 = 0.0053980793;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var12 = 0.007647612;
                        } else {
                            var12 = 0.032426722;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.57) {
                            var12 = 0.017716423;
                        } else {
                            var12 = 0.040707354;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var12 = 0.031996127;
                        } else {
                            var12 = 0.05445243;
                        }
                    }
                }
            }
        }
        double var13;
        if (input[3] < 3.02) {
            if (input[3] < 2.25) {
                if (input[3] < 1.52) {
                    if (input[1] < 5.0) {
                        if (input[3] < 1.33) {
                            var13 = -0.03651198;
                        } else {
                            var13 = -0.031135647;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var13 = -0.035397165;
                        } else {
                            var13 = -0.019055398;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        var13 = -0.03693473;
                    } else {
                        if (input[2] < 4.0) {
                            var13 = -0.030245176;
                        } else {
                            var13 = -0.013689662;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.61) {
                        var13 = -0.025489766;
                    } else {
                        if (input[3] < 2.94) {
                            var13 = -0.017885273;
                        } else {
                            var13 = -0.012675538;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 61.0) {
                            var13 = -0.010760452;
                        } else {
                            var13 = -0.020653902;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var13 = -0.015097469;
                        } else {
                            var13 = 0.00695363;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var13 = -0.010191037;
                } else {
                    if (input[3] < 3.47) {
                        if (input[2] < 4.0) {
                            var13 = 0.0004833207;
                        } else {
                            var13 = 0.01022103;
                        }
                    } else {
                        if (input[3] < 3.82) {
                            var13 = 0.012454113;
                        } else {
                            var13 = 0.015420067;
                        }
                    }
                }
            } else {
                if (input[3] < 4.21) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.78) {
                            var13 = -0.0036358393;
                        } else {
                            var13 = 0.006617989;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var13 = 0.009552608;
                        } else {
                            var13 = 0.034289673;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 4.65) {
                            var13 = 0.03236107;
                        } else {
                            var13 = 0.040564302;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var13 = 0.027288053;
                        } else {
                            var13 = 0.059840973;
                        }
                    }
                }
            }
        }
        double var14;
        if (input[3] < 2.65) {
            if (input[3] < 1.87) {
                if (input[2] < 4.0) {
                    var14 = -0.03402468;
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.33) {
                            var14 = -0.035756797;
                        } else {
                            var14 = -0.027289063;
                        }
                    } else {
                        if (input[3] < 1.33) {
                            var14 = -0.025225878;
                        } else {
                            var14 = -0.013313713;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.21) {
                        var14 = -0.034446303;
                    } else {
                        if (input[3] < 2.49) {
                            var14 = -0.025472818;
                        } else {
                            var14 = -0.019436685;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 65.0) {
                            var14 = -0.017296776;
                        } else {
                            var14 = -0.0285097;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var14 = -0.009996146;
                        } else {
                            var14 = 0.0014218787;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                if (input[3] < 2.78) {
                    var14 = -0.013312376;
                } else {
                    var14 = -0.009733894;
                }
            } else {
                if (input[3] < 3.45) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.09) {
                            var14 = -0.015022774;
                        } else {
                            var14 = -0.004028553;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var14 = -0.0020855502;
                        } else {
                            var14 = 0.014644913;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.68) {
                            var14 = 0.010333969;
                        } else {
                            var14 = 0.014445652;
                        }
                    } else {
                        if (input[3] < 4.41) {
                            var14 = 0.026331335;
                        } else {
                            var14 = 0.04532828;
                        }
                    }
                }
            }
        }
        double var15;
        if (input[3] < 3.02) {
            if (input[3] < 2.16) {
                if (input[2] < 4.0) {
                    if (input[3] < 1.83) {
                        var15 = -0.032556426;
                    } else {
                        if (input[0] < 42.0) {
                            var15 = -0.022287931;
                        } else {
                            var15 = -0.031114211;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.58) {
                            var15 = -0.03171385;
                        } else {
                            var15 = -0.022463089;
                        }
                    } else {
                        if (input[3] < 1.63) {
                            var15 = -0.01936968;
                        } else {
                            var15 = -0.006068729;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.55) {
                        var15 = -0.024203785;
                    } else {
                        if (input[3] < 2.94) {
                            var15 = -0.01660925;
                        } else {
                            var15 = -0.011408434;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.53) {
                            var15 = -0.018971244;
                        } else {
                            var15 = -0.009392742;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var15 = -0.0038588967;
                        } else {
                            var15 = 0.01016086;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var15 = -0.009199582;
                } else {
                    if (input[3] < 3.47) {
                        if (input[2] < 4.0) {
                            var15 = 0.00055817806;
                        } else {
                            var15 = 0.009083123;
                        }
                    } else {
                        if (input[3] < 3.82) {
                            var15 = 0.011221545;
                        } else {
                            var15 = 0.013932514;
                        }
                    }
                }
            } else {
                if (input[3] < 4.03) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.78) {
                            var15 = -0.0038260263;
                        } else {
                            var15 = 0.0040354514;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var15 = 0.0076116235;
                        } else {
                            var15 = 0.029246537;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 4.33) {
                            var15 = 0.012506138;
                        } else {
                            var15 = 0.033775456;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var15 = 0.0331786;
                        } else {
                            var15 = 0.0544648;
                        }
                    }
                }
            }
        }
        double var16;
        if (input[3] < 2.55) {
            if (input[3] < 1.83) {
                if (input[2] < 4.0) {
                    var16 = -0.030935362;
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.33) {
                            var16 = -0.032416668;
                        } else {
                            var16 = -0.024692703;
                        }
                    } else {
                        if (input[3] < 1.22) {
                            var16 = -0.025501294;
                        } else {
                            var16 = -0.01346841;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.18) {
                        var16 = -0.032197326;
                    } else {
                        var16 = -0.022851674;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 59.0) {
                            var16 = -0.0169641;
                        } else {
                            var16 = -0.026910646;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var16 = -0.011251744;
                        } else {
                            var16 = -0.00093061227;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                if (input[3] < 2.77) {
                    if (input[0] < 40.0) {
                        if (input[1] < 4.0) {
                            var16 = -0.010545717;
                        } else {
                            var16 = -0.004552144;
                        }
                    } else {
                        var16 = -0.015812853;
                    }
                } else {
                    var16 = -0.008833533;
                }
            } else {
                if (input[3] < 3.36) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.07) {
                            var16 = -0.015000279;
                        } else {
                            var16 = -0.0059849396;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var16 = -0.0045754495;
                        } else {
                            var16 = 0.011384147;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.68) {
                            var16 = 0.008482455;
                        } else {
                            var16 = 0.013047573;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var16 = 0.01842647;
                        } else {
                            var16 = 0.036431998;
                        }
                    }
                }
            }
        }
        double var17;
        if (input[3] < 3.05) {
            if (input[3] < 2.34) {
                if (input[3] < 1.52) {
                    if (input[1] < 5.0) {
                        if (input[3] < 1.33) {
                            var17 = -0.029970342;
                        } else {
                            var17 = -0.025555143;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var17 = -0.028973002;
                        } else {
                            var17 = -0.015266617;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.14) {
                            var17 = -0.031809922;
                        } else {
                            var17 = -0.02367583;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var17 = -0.023925994;
                        } else {
                            var17 = -0.010327249;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.64) {
                            var17 = -0.019085774;
                        } else {
                            var17 = -0.013485692;
                        }
                    } else {
                        if (input[0] < 40.0) {
                            var17 = -0.004316581;
                        } else {
                            var17 = -0.008884739;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 42.0) {
                            var17 = -0.006078846;
                        } else {
                            var17 = -0.014771721;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var17 = -0.013140201;
                        } else {
                            var17 = 0.011353373;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var17 = -0.008301667;
                } else {
                    if (input[3] < 3.47) {
                        if (input[2] < 4.0) {
                            var17 = 0.0012464555;
                        } else {
                            var17 = 0.008333296;
                        }
                    } else {
                        if (input[3] < 3.82) {
                            var17 = 0.010128593;
                        } else {
                            var17 = 0.012588686;
                        }
                    }
                }
            } else {
                if (input[3] < 4.21) {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var17 = -0.0011091505;
                        } else {
                            var17 = 0.014508995;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var17 = 0.006780609;
                        } else {
                            var17 = 0.038811196;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 4.65) {
                            var17 = 0.02593987;
                        } else {
                            var17 = 0.033252712;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var17 = 0.021713207;
                        } else {
                            var17 = 0.0508057;
                        }
                    }
                }
            }
        }
        double var18;
        if (input[3] < 3.05) {
            if (input[3] < 2.16) {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        var18 = -0.02934578;
                    } else {
                        if (input[3] < 1.67) {
                            var18 = -0.02793852;
                        } else {
                            var18 = -0.019429134;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.82) {
                            var18 = -0.028075246;
                        } else {
                            var18 = -0.021589305;
                        }
                    } else {
                        if (input[3] < 1.33) {
                            var18 = -0.023894044;
                        } else {
                            var18 = -0.010166345;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.53) {
                            var18 = -0.020955635;
                        } else {
                            var18 = -0.013692522;
                        }
                    } else {
                        if (input[3] < 2.56) {
                            var18 = -0.012123582;
                        } else {
                            var18 = -0.005135995;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 68.0) {
                            var18 = -0.008664853;
                        } else {
                            var18 = -0.018417899;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var18 = -0.013248923;
                        } else {
                            var18 = 0.008824321;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var18 = -0.007888605;
                } else {
                    if (input[3] < 3.47) {
                        if (input[2] < 4.0) {
                            var18 = 0.0011857308;
                        } else {
                            var18 = 0.007923146;
                        }
                    } else {
                        if (input[3] < 3.82) {
                            var18 = 0.009629959;
                        } else {
                            var18 = 0.011961661;
                        }
                    }
                }
            } else {
                if (input[3] < 4.21) {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var18 = -0.0010541938;
                        } else {
                            var18 = 0.013787192;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var18 = 0.0064462866;
                        } else {
                            var18 = 0.036884397;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 4.65) {
                            var18 = 0.024655974;
                        } else {
                            var18 = 0.03160855;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var18 = 0.020656114;
                        } else {
                            var18 = 0.048286233;
                        }
                    }
                }
            }
        }
        double var19;
        if (input[3] < 2.55) {
            if (input[3] < 1.83) {
                if (input[2] < 4.0) {
                    var19 = -0.02663683;
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.43) {
                            var19 = -0.027176863;
                        } else {
                            var19 = -0.020771394;
                        }
                    } else {
                        if (input[3] < 1.22) {
                            var19 = -0.021955227;
                        } else {
                            var19 = -0.011410072;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.18) {
                        var19 = -0.027677521;
                    } else {
                        var19 = -0.019665131;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 59.0) {
                            var19 = -0.014442426;
                        } else {
                            var19 = -0.023599409;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var19 = -0.009804599;
                        } else {
                            var19 = -0.00038301077;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                if (input[3] < 2.77) {
                    if (input[0] < 40.0) {
                        if (input[1] < 4.0) {
                            var19 = -0.00923081;
                        } else {
                            var19 = -0.0038285465;
                        }
                    } else {
                        var19 = -0.013829631;
                    }
                } else {
                    var19 = -0.007558922;
                }
            } else {
                if (input[3] < 3.36) {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var19 = -0.010557848;
                        } else {
                            var19 = -0.00089458993;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var19 = -0.004053491;
                        } else {
                            var19 = 0.012770543;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[3] < 3.68) {
                            var19 = 0.007331259;
                        } else {
                            var19 = 0.0112023605;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var19 = 0.013841408;
                        } else {
                            var19 = 0.031027177;
                        }
                    }
                }
            }
        }
        double var20;
        if (input[3] < 3.05) {
            if (input[3] < 2.25) {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        var20 = -0.026252974;
                    } else {
                        if (input[3] < 1.67) {
                            var20 = -0.02529049;
                        } else {
                            var20 = -0.017081866;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.82) {
                            var20 = -0.02535813;
                        } else {
                            var20 = -0.018887544;
                        }
                    } else {
                        if (input[3] < 1.61) {
                            var20 = -0.017574191;
                        } else {
                            var20 = -0.0062150382;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.64) {
                            var20 = -0.0175854;
                        } else {
                            var20 = -0.01163701;
                        }
                    } else {
                        if (input[3] < 2.56) {
                            var20 = -0.010084219;
                        } else {
                            var20 = -0.004787781;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 42.0) {
                            var20 = -0.005488276;
                        } else {
                            var20 = -0.013862471;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var20 = -0.011916764;
                        } else {
                            var20 = 0.008877047;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var20 = -0.0071200035;
                } else {
                    if (input[3] < 3.47) {
                        if (input[0] < 36.0) {
                            var20 = 0.009559238;
                        } else {
                            var20 = 0.0029747975;
                        }
                    } else {
                        if (input[3] < 3.82) {
                            var20 = 0.008690721;
                        } else {
                            var20 = 0.010807897;
                        }
                    }
                }
            } else {
                if (input[3] < 4.21) {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var20 = -0.0017064275;
                        } else {
                            var20 = 0.012195103;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var20 = 0.0056199664;
                        } else {
                            var20 = 0.0337395;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 4.65) {
                            var20 = 0.022212407;
                        } else {
                            var20 = 0.028721614;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var20 = 0.029308384;
                        } else {
                            var20 = 0.052360725;
                        }
                    }
                }
            }
        }
        double var21;
        if (input[3] < 3.05) {
            if (input[3] < 2.34) {
                if (input[3] < 1.78) {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.33) {
                            var21 = -0.02506685;
                        } else {
                            var21 = -0.02119579;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var21 = -0.023951761;
                        } else {
                            var21 = -0.013208373;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.14) {
                            var21 = -0.025746617;
                        } else {
                            var21 = -0.01941502;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var21 = -0.018280787;
                        } else {
                            var21 = -0.00573477;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.76) {
                            var21 = -0.014907082;
                        } else {
                            var21 = -0.009976569;
                        }
                    } else {
                        if (input[0] < 40.0) {
                            var21 = -0.0032300595;
                        } else {
                            var21 = -0.0075562946;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 33.0) {
                            var21 = -0.0033510767;
                        } else {
                            var21 = -0.011261004;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var21 = -0.010873556;
                        } else {
                            var21 = 0.009406771;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var21 = -0.0067657456;
                } else {
                    if (input[3] < 3.29) {
                        if (input[2] < 4.0) {
                            var21 = -0.0027111026;
                        } else {
                            var21 = 0.0061647915;
                        }
                    } else {
                        if (input[3] < 3.7) {
                            var21 = 0.0071825846;
                        } else {
                            var21 = 0.0101544615;
                        }
                    }
                }
            } else {
                if (input[3] < 4.4) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.83) {
                            var21 = -0.003936302;
                        } else {
                            var21 = 0.004608114;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var21 = 0.0062916772;
                        } else {
                            var21 = 0.02565445;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        var21 = 0.025882456;
                    } else {
                        if (input[2] < 4.0) {
                            var21 = 0.022560718;
                        } else {
                            var21 = 0.049483165;
                        }
                    }
                }
            }
        }
        double var22;
        if (input[3] < 2.55) {
            if (input[3] < 1.83) {
                if (input[2] < 4.0) {
                    var22 = -0.022913774;
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.33) {
                            var22 = -0.024242686;
                        } else {
                            var22 = -0.01837582;
                        }
                    } else {
                        if (input[3] < 1.22) {
                            var22 = -0.019385949;
                        } else {
                            var22 = -0.009503457;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.14) {
                        var22 = -0.024172772;
                    } else {
                        var22 = -0.017188659;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 45.0) {
                            var22 = -0.011295469;
                        } else {
                            var22 = -0.01953;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var22 = -0.008659302;
                        } else {
                            var22 = -0.00008135337;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                if (input[3] < 2.78) {
                    if (input[0] < 40.0) {
                        if (input[2] < 4.0) {
                            var22 = -0.0036774396;
                        } else {
                            var22 = -0.008446719;
                        }
                    } else {
                        var22 = -0.011961775;
                    }
                } else {
                    var22 = -0.006438537;
                }
            } else {
                if (input[3] < 3.71) {
                    if (input[1] < 3.0) {
                        if (input[3] < 3.22) {
                            var22 = -0.0067475303;
                        } else {
                            var22 = 0.0023576636;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var22 = -0.0000852577;
                        } else {
                            var22 = 0.014169811;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        var22 = 0.009638433;
                    } else {
                        if (input[1] < 3.0) {
                            var22 = 0.016066298;
                        } else {
                            var22 = 0.030453507;
                        }
                    }
                }
            }
        }
        double var23;
        if (input[3] < 3.15) {
            if (input[3] < 2.39) {
                if (input[3] < 1.78) {
                    if (input[1] < 5.0) {
                        if (input[3] < 1.33) {
                            var23 = -0.022352286;
                        } else {
                            var23 = -0.017927356;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var23 = -0.021046197;
                        } else {
                            var23 = -0.008577171;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.14) {
                            var23 = -0.023327462;
                        } else {
                            var23 = -0.01746989;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var23 = -0.016327046;
                        } else {
                            var23 = -0.0050645643;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.84) {
                            var23 = -0.012873915;
                        } else {
                            var23 = -0.008115678;
                        }
                    } else {
                        if (input[0] < 64.0) {
                            var23 = -0.0011404761;
                        } else {
                            var23 = -0.0069141835;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 42.0) {
                            var23 = -0.0031753115;
                        } else {
                            var23 = -0.009935394;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var23 = -0.01057404;
                        } else {
                            var23 = 0.012104602;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var23 = -0.006106888;
                } else {
                    if (input[3] < 3.68) {
                        if (input[1] < 2.0) {
                            var23 = -0.002513837;
                        } else {
                            var23 = 0.007382714;
                        }
                    } else {
                        var23 = 0.009141193;
                    }
                }
            } else {
                if (input[3] < 4.41) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.83) {
                            var23 = -0.0033917618;
                        } else {
                            var23 = 0.0035925258;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var23 = 0.0064773285;
                        } else {
                            var23 = 0.02451056;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 4.65) {
                            var23 = 0.019982178;
                        } else {
                            var23 = 0.024827715;
                        }
                    } else {
                        if (input[2] < 5.0) {
                            var23 = 0.023505876;
                        } else {
                            var23 = 0.047714163;
                        }
                    }
                }
            }
        }
        double var24;
        if (input[3] < 3.15) {
            if (input[3] < 2.39) {
                if (input[3] < 1.78) {
                    if (input[1] < 3.0) {
                        if (input[0] < 6.0) {
                            var24 = -0.015291705;
                        } else {
                            var24 = -0.02122819;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var24 = -0.020737465;
                        } else {
                            var24 = -0.013025652;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.14) {
                            var24 = -0.022183096;
                        } else {
                            var24 = -0.016617194;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var24 = -0.015516365;
                        } else {
                            var24 = -0.0048125503;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.86) {
                            var24 = -0.012052509;
                        } else {
                            var24 = -0.0073509472;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var24 = -0.006818483;
                        } else {
                            var24 = -0.0011694905;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 42.0) {
                            var24 = -0.0030202407;
                        } else {
                            var24 = -0.009450741;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var24 = -0.0100805815;
                        } else {
                            var24 = 0.011504419;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var24 = -0.005803127;
                } else {
                    if (input[3] < 3.68) {
                        if (input[1] < 2.0) {
                            var24 = -0.0023959987;
                        } else {
                            var24 = 0.0070178746;
                        }
                    } else {
                        var24 = 0.008685677;
                    }
                }
            } else {
                if (input[3] < 4.41) {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var24 = -0.00017349828;
                        } else {
                            var24 = 0.010417051;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var24 = 0.006005872;
                        } else {
                            var24 = 0.027134467;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 4.65) {
                            var24 = 0.019006308;
                        } else {
                            var24 = 0.023600122;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var24 = 0.019120736;
                        } else {
                            var24 = 0.043589994;
                        }
                    }
                }
            }
        }
        double var25;
        if (input[3] < 3.05) {
            if (input[3] < 2.16) {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        var25 = -0.020902006;
                    } else {
                        if (input[3] < 1.42) {
                            var25 = -0.020939862;
                        } else {
                            var25 = -0.01498087;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 22.0) {
                            var25 = -0.015156597;
                        } else {
                            var25 = -0.019787801;
                        }
                    } else {
                        if (input[3] < 1.33) {
                            var25 = -0.017466238;
                        } else {
                            var25 = -0.006579996;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.47) {
                            var25 = -0.015146007;
                        } else {
                            var25 = -0.0099982545;
                        }
                    } else {
                        if (input[3] < 2.56) {
                            var25 = -0.008690565;
                        } else {
                            var25 = -0.0036033199;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 68.0) {
                            var25 = -0.0057860445;
                        } else {
                            var25 = -0.013722616;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var25 = -0.010295438;
                        } else {
                            var25 = 0.006451974;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var25 = -0.0055105495;
                } else {
                    if (input[3] < 3.29) {
                        if (input[0] < 62.0) {
                            var25 = 0.0055011935;
                        } else {
                            var25 = -0.0023909782;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var25 = 0.005460424;
                        } else {
                            var25 = 0.008251838;
                        }
                    }
                }
            } else {
                if (input[3] < 3.99) {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var25 = -0.002813842;
                        } else {
                            var25 = 0.007942035;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var25 = 0.0034703077;
                        } else {
                            var25 = 0.025727898;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.65) {
                            var25 = 0.00999619;
                        } else {
                            var25 = 0.025992975;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var25 = 0.010425478;
                        } else {
                            var25 = 0.03097865;
                        }
                    }
                }
            }
        }
        double var26;
        if (input[3] < 3.15) {
            if (input[3] < 2.4) {
                if (input[3] < 1.52) {
                    if (input[1] < 5.0) {
                        if (input[3] < 1.33) {
                            var26 = -0.019340346;
                        } else {
                            var26 = -0.016463773;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var26 = -0.018507777;
                        } else {
                            var26 = -0.008958063;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.09) {
                            var26 = -0.02101709;
                        } else {
                            var26 = -0.015293355;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var26 = -0.015171203;
                        } else {
                            var26 = -0.0059485887;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.84) {
                            var26 = -0.010964378;
                        } else {
                            var26 = -0.0069506164;
                        }
                    } else {
                        if (input[0] < 50.0) {
                            var26 = -0.00010705925;
                        } else {
                            var26 = -0.00551449;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 42.0) {
                            var26 = -0.0026120152;
                        } else {
                            var26 = -0.008299398;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var26 = -0.009177552;
                        } else {
                            var26 = 0.010574302;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var26 = -0.0052403742;
                } else {
                    if (input[3] < 3.68) {
                        if (input[1] < 2.0) {
                            var26 = -0.0024905712;
                        } else {
                            var26 = 0.006335155;
                        }
                    } else {
                        if (input[3] < 3.86) {
                            var26 = 0.006768995;
                        } else {
                            var26 = 0.008046097;
                        }
                    }
                }
            } else {
                if (input[3] < 4.29) {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var26 = -0.0010122536;
                        } else {
                            var26 = 0.007891141;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var26 = 0.004513425;
                        } else {
                            var26 = 0.023979528;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 4.65) {
                            var26 = 0.015975062;
                        } else {
                            var26 = 0.021110881;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var26 = 0.016077956;
                        } else {
                            var26 = 0.037933964;
                        }
                    }
                }
            }
        }
        double var27;
        if (input[3] < 2.92) {
            if (input[3] < 2.09) {
                if (input[1] < 5.0) {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var27 = -0.019022783;
                        } else {
                            var27 = -0.016125722;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var27 = -0.014938715;
                        } else {
                            var27 = -0.005565261;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        var27 = -0.016490065;
                    } else {
                        if (input[3] < 1.42) {
                            var27 = -0.010037015;
                        } else {
                            var27 = -0.00009267648;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.47) {
                            var27 = -0.014117486;
                        } else {
                            var27 = -0.009619842;
                        }
                    } else {
                        if (input[3] < 2.56) {
                            var27 = -0.008383012;
                        } else {
                            var27 = -0.0034184959;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 50.0) {
                            var27 = -0.00512614;
                        } else {
                            var27 = -0.011785124;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var27 = -0.011081393;
                        } else {
                            var27 = 0.005236358;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var27 = -0.0049487576;
                } else {
                    if (input[3] < 3.23) {
                        if (input[2] < 4.0) {
                            var27 = -0.0035504203;
                        } else {
                            var27 = 0.003199989;
                        }
                    } else {
                        if (input[3] < 3.68) {
                            var27 = 0.0051121237;
                        } else {
                            var27 = 0.007475374;
                        }
                    }
                }
            } else {
                if (input[3] < 3.82) {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var27 = -0.0037239701;
                        } else {
                            var27 = 0.0038114153;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var27 = 0.0017326018;
                        } else {
                            var27 = 0.021770513;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.57) {
                            var27 = 0.003996556;
                        } else {
                            var27 = 0.020225;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var27 = 0.0123556545;
                        } else {
                            var27 = 0.027574465;
                        }
                    }
                }
            }
        }
        double var28;
        if (input[3] < 3.15) {
            if (input[3] < 2.34) {
                if (input[3] < 1.52) {
                    if (input[1] < 5.0) {
                        if (input[3] < 1.33) {
                            var28 = -0.01759944;
                        } else {
                            var28 = -0.014871741;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var28 = -0.016816216;
                        } else {
                            var28 = -0.008123725;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.09) {
                            var28 = -0.01904012;
                        } else {
                            var28 = -0.014159977;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var28 = -0.01395481;
                        } else {
                            var28 = -0.0055103987;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.74) {
                            var28 = -0.010619083;
                        } else {
                            var28 = -0.0067372993;
                        }
                    } else {
                        if (input[0] < 64.0) {
                            var28 = -0.0010949773;
                        } else {
                            var28 = -0.0061429352;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 37.0) {
                            var28 = -0.0020966465;
                        } else {
                            var28 = -0.007332567;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var28 = -0.009228296;
                        } else {
                            var28 = 0.009413086;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var28 = -0.004733549;
                } else {
                    if (input[3] < 3.68) {
                        if (input[1] < 2.0) {
                            var28 = -0.0025863901;
                        } else {
                            var28 = 0.0058001797;
                        }
                    } else {
                        if (input[3] < 3.86) {
                            var28 = 0.0060716174;
                        } else {
                            var28 = 0.007273137;
                        }
                    }
                }
            } else {
                if (input[3] < 4.4) {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var28 = -0.0003039782;
                        } else {
                            var28 = 0.008257347;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var28 = 0.0043288525;
                        } else {
                            var28 = 0.022319816;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 4.81) {
                            var28 = 0.016351214;
                        } else {
                            var28 = 0.020301946;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var28 = 0.01287248;
                        } else {
                            var28 = 0.036012758;
                        }
                    }
                }
            }
        }
        double var29;
        if (input[3] < 3.23) {
            if (input[3] < 2.45) {
                if (input[3] < 1.78) {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.44) {
                            var29 = -0.016671252;
                        } else {
                            var29 = -0.014095164;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var29 = -0.016218822;
                        } else {
                            var29 = -0.0084656095;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var29 = -0.015078376;
                        } else {
                            var29 = -0.010003464;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var29 = -0.011688502;
                        } else {
                            var29 = -0.001609922;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.94) {
                            var29 = -0.0088128485;
                        } else {
                            var29 = -0.005079779;
                        }
                    } else {
                        if (input[0] < 65.0) {
                            var29 = 0.000000088214875;
                        } else {
                            var29 = -0.0054617575;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 66.0) {
                            var29 = -0.0026068613;
                        } else {
                            var29 = -0.00909599;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var29 = -0.007221304;
                        } else {
                            var29 = 0.00951794;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var29 = -0.0044968175;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.86) {
                            var29 = -0.0013531166;
                        } else {
                            var29 = 0.0068783807;
                        }
                    } else {
                        if (input[0] < 64.0) {
                            var29 = 0.0071822046;
                        } else {
                            var29 = 0.0057289023;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[3] < 4.33) {
                        if (input[1] < 2.0) {
                            var29 = -0.00018886811;
                        } else {
                            var29 = 0.007145434;
                        }
                    } else {
                        if (input[3] < 4.72) {
                            var29 = 0.012460602;
                        } else {
                            var29 = 0.02237239;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.63) {
                            var29 = 0.005105874;
                        } else {
                            var29 = 0.020755881;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var29 = 0.017718144;
                        } else {
                            var29 = 0.031763975;
                        }
                    }
                }
            }
        }
        double var30;
        if (input[3] < 3.15) {
            if (input[3] < 2.16) {
                if (input[1] < 5.0) {
                    if (input[3] < 1.33) {
                        var30 = -0.015946781;
                    } else {
                        if (input[1] < 2.0) {
                            var30 = -0.01704982;
                        } else {
                            var30 = -0.010461817;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.85) {
                            var30 = -0.0150958095;
                        } else {
                            var30 = -0.009992025;
                        }
                    } else {
                        if (input[3] < 1.42) {
                            var30 = -0.008740726;
                        } else {
                            var30 = 0.0008371969;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.65) {
                            var30 = -0.010881993;
                        } else {
                            var30 = -0.0065138126;
                        }
                    } else {
                        if (input[3] < 2.56) {
                            var30 = -0.0067546624;
                        } else {
                            var30 = -0.002836869;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 32.0) {
                            var30 = -0.0012966574;
                        } else {
                            var30 = -0.008265833;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var30 = -0.008087323;
                        } else {
                            var30 = 0.0055337553;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var30 = -0.0042759734;
                } else {
                    if (input[3] < 3.68) {
                        if (input[1] < 2.0) {
                            var30 = -0.0023900853;
                        } else {
                            var30 = 0.0052291686;
                        }
                    } else {
                        if (input[3] < 3.86) {
                            var30 = 0.0055105155;
                        } else {
                            var30 = 0.006576384;
                        }
                    }
                }
            } else {
                if (input[3] < 4.29) {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var30 = -0.0008831354;
                        } else {
                            var30 = 0.00750914;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var30 = 0.0032883615;
                        } else {
                            var30 = 0.02264025;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 4.65) {
                            var30 = 0.012971911;
                        } else {
                            var30 = 0.01704865;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var30 = 0.018479487;
                        } else {
                            var30 = 0.036975928;
                        }
                    }
                }
            }
        }
        double var31;
        if (input[3] < 3.29) {
            if (input[3] < 2.45) {
                if (input[3] < 1.83) {
                    if (input[2] < 4.0) {
                        var31 = -0.014827897;
                    } else {
                        if (input[1] < 4.0) {
                            var31 = -0.013469427;
                        } else {
                            var31 = -0.007319475;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[3] < 2.13) {
                            var31 = -0.013773224;
                        } else {
                            var31 = -0.009178262;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var31 = -0.010328382;
                        } else {
                            var31 = -0.0013352038;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.94) {
                            var31 = -0.0079570515;
                        } else {
                            var31 = -0.0045072204;
                        }
                    } else {
                        if (input[0] < 49.0) {
                            var31 = 0.0010318113;
                        } else {
                            var31 = -0.003916487;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 66.0) {
                            var31 = -0.0022276465;
                        } else {
                            var31 = -0.0085348105;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var31 = -0.0062329327;
                        } else {
                            var31 = 0.008619657;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var31 = -0.004060073;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.86) {
                            var31 = -0.0011097015;
                        } else {
                            var31 = 0.0062205964;
                        }
                    } else {
                        if (input[0] < 64.0) {
                            var31 = 0.006501332;
                        } else {
                            var31 = 0.005373442;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[3] < 4.59) {
                        if (input[1] < 2.0) {
                            var31 = 0.00097587;
                        } else {
                            var31 = 0.008224078;
                        }
                    } else {
                        if (input[3] < 4.72) {
                            var31 = 0.012870985;
                        } else {
                            var31 = 0.020420041;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.65) {
                            var31 = 0.005003292;
                        } else {
                            var31 = 0.018957548;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var31 = 0.01637905;
                        } else {
                            var31 = 0.029505974;
                        }
                    }
                }
            }
        }
        double var32;
        if (input[3] < 2.56) {
            if (input[3] < 1.83) {
                if (input[2] < 4.0) {
                    var32 = -0.014089582;
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.38) {
                            var32 = -0.014882037;
                        } else {
                            var32 = -0.010915192;
                        }
                    } else {
                        if (input[3] < 1.2) {
                            var32 = -0.013298543;
                        } else {
                            var32 = -0.0048737773;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.21) {
                            var32 = -0.014411707;
                        } else {
                            var32 = -0.010163799;
                        }
                    } else {
                        if (input[0] < 64.0) {
                            var32 = -0.0049917377;
                        } else {
                            var32 = -0.010795138;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[2] < 4.0) {
                            var32 = -0.008792418;
                        } else {
                            var32 = -0.0023229858;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var32 = -0.010128909;
                        } else {
                            var32 = 0.011384593;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 3.71) {
                if (input[1] < 3.0) {
                    if (input[3] < 3.22) {
                        if (input[1] < 2.0) {
                            var32 = -0.0062159696;
                        } else {
                            var32 = -0.0025806294;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var32 = -0.0026604317;
                        } else {
                            var32 = 0.0019650036;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 58.0) {
                            var32 = 0.0027192635;
                        } else {
                            var32 = -0.0066638733;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var32 = -0.0046888534;
                        } else {
                            var32 = 0.008531812;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[4] < 2.0) {
                        var32 = -0.0038517658;
                    } else {
                        if (input[3] < 3.86) {
                            var32 = 0.00489047;
                        } else {
                            var32 = 0.0059434595;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.57) {
                            var32 = 0.0023956846;
                        } else {
                            var32 = 0.015770778;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var32 = 0.008676278;
                        } else {
                            var32 = 0.021660361;
                        }
                    }
                }
            }
        }
        double var33;
        if (input[3] < 3.29) {
            if (input[3] < 2.39) {
                if (input[1] < 5.0) {
                    if (input[3] < 1.63) {
                        if (input[3] < 1.21) {
                            var33 = -0.014379046;
                        } else {
                            var33 = -0.01194327;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var33 = -0.013551776;
                        } else {
                            var33 = -0.0072681843;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.08) {
                            var33 = -0.012319048;
                        } else {
                            var33 = -0.006073154;
                        }
                    } else {
                        if (input[3] < 1.42) {
                            var33 = -0.007533123;
                        } else {
                            var33 = 0.0013650564;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 54.0) {
                        if (input[3] < 2.86) {
                            var33 = -0.004473525;
                        } else {
                            var33 = -0.00064183946;
                        }
                    } else {
                        if (input[0] < 79.0) {
                            var33 = -0.0061187437;
                        } else {
                            var33 = -0.009896482;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var33 = -0.006491554;
                        } else {
                            var33 = -0.00018025126;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var33 = -0.006207613;
                        } else {
                            var33 = 0.007766763;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var33 = -0.0036870264;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.86) {
                            var33 = -0.001049893;
                        } else {
                            var33 = 0.0056259064;
                        }
                    } else {
                        if (input[0] < 54.0) {
                            var33 = 0.0059854365;
                        } else {
                            var33 = 0.0049737487;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[3] < 4.33) {
                        if (input[1] < 2.0) {
                            var33 = -0.00018387975;
                        } else {
                            var33 = 0.005765074;
                        }
                    } else {
                        if (input[3] < 4.72) {
                            var33 = 0.01019158;
                        } else {
                            var33 = 0.018606652;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 49.0) {
                            var33 = 0.010808685;
                        } else {
                            var33 = 0.0010170989;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var33 = 0.014626587;
                        } else {
                            var33 = 0.0271317;
                        }
                    }
                }
            }
        }
        double var34;
        if (input[3] < 3.29) {
            if (input[3] < 2.45) {
                if (input[1] < 5.0) {
                    if (input[3] < 1.63) {
                        if (input[3] < 1.21) {
                            var34 = -0.013665343;
                        } else {
                            var34 = -0.011348388;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var34 = -0.01252039;
                        } else {
                            var34 = -0.006862224;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.08) {
                            var34 = -0.0117139;
                        } else {
                            var34 = -0.005946471;
                        }
                    } else {
                        if (input[3] < 1.42) {
                            var34 = -0.0071663815;
                        } else {
                            var34 = 0.0016114431;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 54.0) {
                        if (input[1] < 2.0) {
                            var34 = -0.0052504996;
                        } else {
                            var34 = -0.0012019488;
                        }
                    } else {
                        if (input[0] < 88.0) {
                            var34 = -0.0059329816;
                        } else {
                            var34 = -0.010016153;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var34 = -0.0059504188;
                        } else {
                            var34 = -0.000087743036;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var34 = -0.005433801;
                        } else {
                            var34 = 0.007402677;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var34 = -0.0035036989;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.86) {
                            var34 = -0.0009997797;
                        } else {
                            var34 = 0.0053508594;
                        }
                    } else {
                        if (input[0] < 54.0) {
                            var34 = 0.0056878915;
                        } else {
                            var34 = 0.0047269086;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[3] < 4.33) {
                        if (input[1] < 2.0) {
                            var34 = -0.00017477795;
                        } else {
                            var34 = 0.0054797675;
                        }
                    } else {
                        if (input[3] < 4.72) {
                            var34 = 0.009690489;
                        } else {
                            var34 = 0.0176957;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 4.63) {
                            var34 = 0.0041246037;
                        } else {
                            var34 = 0.017024798;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var34 = 0.013899776;
                        } else {
                            var34 = 0.02578398;
                        }
                    }
                }
            }
        }
        double var35;
        if (input[3] < 2.92) {
            if (input[3] < 2.1) {
                if (input[1] < 3.0) {
                    if (input[0] < 48.0) {
                        if (input[1] < 2.0) {
                            var35 = -0.012722394;
                        } else {
                            var35 = -0.008776826;
                        }
                    } else {
                        var35 = -0.013143457;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 15.0) {
                            var35 = -0.008212017;
                        } else {
                            var35 = -0.012573245;
                        }
                    } else {
                        if (input[3] < 1.21) {
                            var35 = -0.013223973;
                        } else {
                            var35 = -0.0038327042;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.47) {
                            var35 = -0.009306247;
                        } else {
                            var35 = -0.0065256506;
                        }
                    } else {
                        if (input[0] < 31.0) {
                            var35 = -0.00024729653;
                        } else {
                            var35 = -0.0051381164;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 75.0) {
                            var35 = -0.0038830843;
                        } else {
                            var35 = -0.00972563;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var35 = -0.011304483;
                        } else {
                            var35 = 0.0061137867;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var35 = -0.0033059318;
                } else {
                    if (input[3] < 3.18) {
                        if (input[2] < 4.0) {
                            var35 = -0.002406958;
                        } else {
                            var35 = 0.0018672157;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var35 = 0.0030343405;
                        } else {
                            var35 = 0.004926507;
                        }
                    }
                }
            } else {
                if (input[3] < 3.82) {
                    if (input[1] < 4.0) {
                        if (input[0] < 40.0) {
                            var35 = 0.0026421;
                        } else {
                            var35 = -0.0018005865;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var35 = 0.0010551051;
                        } else {
                            var35 = 0.014836;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.7) {
                            var35 = 0.0033317008;
                        } else {
                            var35 = 0.01497355;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var35 = 0.00823546;
                        } else {
                            var35 = 0.01913222;
                        }
                    }
                }
            }
        }
        double var36;
        if (input[3] < 3.29) {
            if (input[3] < 2.25) {
                if (input[1] < 5.0) {
                    if (input[0] < 38.0) {
                        if (input[3] < 1.58) {
                            var36 = -0.0101543395;
                        } else {
                            var36 = -0.0049383193;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var36 = -0.011397635;
                        } else {
                            var36 = -0.008217831;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.08) {
                            var36 = -0.010566757;
                        } else {
                            var36 = -0.004360271;
                        }
                    } else {
                        if (input[3] < 1.42) {
                            var36 = -0.0064208307;
                        } else {
                            var36 = 0.0013258039;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 25.0) {
                        if (input[3] < 2.86) {
                            var36 = -0.0024607608;
                        } else {
                            var36 = 0.0014410567;
                        }
                    } else {
                        if (input[3] < 2.76) {
                            var36 = -0.007626448;
                        } else {
                            var36 = -0.0039245947;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var36 = -0.006105115;
                        } else {
                            var36 = -0.00059910497;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var36 = -0.0068788948;
                        } else {
                            var36 = 0.0065661157;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var36 = -0.0031651154;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.86) {
                            var36 = -0.0010968886;
                        } else {
                            var36 = 0.0049409172;
                        }
                    } else {
                        if (input[0] < 64.0) {
                            var36 = 0.005087366;
                        } else {
                            var36 = 0.0041280133;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[3] < 4.37) {
                        if (input[1] < 2.0) {
                            var36 = -0.00016064914;
                        } else {
                            var36 = 0.0076950076;
                        }
                    } else {
                        if (input[3] < 4.77) {
                            var36 = 0.011826181;
                        } else {
                            var36 = 0.018350966;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[2] < 3.0) {
                            var36 = 0.005287897;
                        } else {
                            var36 = 0.013571086;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var36 = 0.008507647;
                        } else {
                            var36 = 0.030442137;
                        }
                    }
                }
            }
        }
        double var37;
        if (input[3] < 3.12) {
            if (input[3] < 2.1) {
                if (input[1] < 3.0) {
                    if (input[0] < 48.0) {
                        if (input[1] < 2.0) {
                            var37 = -0.01167068;
                        } else {
                            var37 = -0.007928081;
                        }
                    } else {
                        var37 = -0.0119514745;
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 15.0) {
                            var37 = -0.007392025;
                        } else {
                            var37 = -0.011421577;
                        }
                    } else {
                        if (input[3] < 1.21) {
                            var37 = -0.012125197;
                        } else {
                            var37 = -0.0033176288;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.64) {
                            var37 = -0.008055384;
                        } else {
                            var37 = -0.0048550535;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var37 = -0.005557177;
                        } else {
                            var37 = -0.0013601183;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[2] < 4.0) {
                            var37 = -0.004058236;
                        } else {
                            var37 = 0.0018882556;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var37 = -0.008797348;
                        } else {
                            var37 = 0.012232582;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.13) {
                        var37 = -0.0011946559;
                    } else {
                        var37 = -0.0030176383;
                    }
                } else {
                    if (input[3] < 3.68) {
                        if (input[1] < 2.0) {
                            var37 = -0.0020875742;
                        } else {
                            var37 = 0.0038120262;
                        }
                    } else {
                        if (input[3] < 3.99) {
                            var37 = 0.00404226;
                        } else {
                            var37 = 0.004687095;
                        }
                    }
                }
            } else {
                if (input[3] < 4.29) {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var37 = -0.00083652197;
                        } else {
                            var37 = 0.0045743776;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var37 = 0.0016972251;
                        } else {
                            var37 = 0.01596641;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 4.95) {
                            var37 = 0.00978262;
                        } else {
                            var37 = 0.0143838525;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var37 = 0.013441078;
                        } else {
                            var37 = 0.029144203;
                        }
                    }
                }
            }
        }
        double var38;
        if (input[3] < 3.29) {
            if (input[3] < 2.45) {
                if (input[1] < 5.0) {
                    if (input[3] < 1.58) {
                        if (input[3] < 1.18) {
                            var38 = -0.01144868;
                        } else {
                            var38 = -0.009531381;
                        }
                    } else {
                        if (input[0] < 41.0) {
                            var38 = -0.004268116;
                        } else {
                            var38 = -0.008613626;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.85) {
                            var38 = -0.010180567;
                        } else {
                            var38 = -0.0060753515;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var38 = -0.008240207;
                        } else {
                            var38 = 0.00090989884;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 66.0) {
                        if (input[0] < 25.0) {
                            var38 = -0.00028895432;
                        } else {
                            var38 = -0.003200665;
                        }
                    } else {
                        if (input[0] < 88.0) {
                            var38 = -0.005616294;
                        } else {
                            var38 = -0.008856515;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var38 = -0.004910731;
                        } else {
                            var38 = 0.000040197167;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var38 = -0.0045024212;
                        } else {
                            var38 = 0.0060296217;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var38 = -0.002857709;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.86) {
                            var38 = -0.0010563482;
                        } else {
                            var38 = 0.004471645;
                        }
                    } else {
                        if (input[0] < 54.0) {
                            var38 = 0.004689717;
                        } else {
                            var38 = 0.0038154318;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[3] < 4.59) {
                        if (input[3] < 3.78) {
                            var38 = -0.0007376092;
                        } else {
                            var38 = 0.0052758725;
                        }
                    } else {
                        if (input[3] < 4.83) {
                            var38 = 0.010517745;
                        } else {
                            var38 = 0.016201396;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 49.0) {
                            var38 = 0.008893974;
                        } else {
                            var38 = -0.00043339003;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var38 = 0.01121191;
                        } else {
                            var38 = 0.021908654;
                        }
                    }
                }
            }
        }
        double var39;
        if (input[3] < 2.56) {
            if (input[3] < 1.78) {
                if (input[1] < 4.0) {
                    if (input[0] < 43.0) {
                        if (input[3] < 1.58) {
                            var39 = -0.009294042;
                        } else {
                            var39 = -0.0054157097;
                        }
                    } else {
                        if (input[3] < 1.74) {
                            var39 = -0.010774287;
                        } else {
                            var39 = -0.0077012493;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[2] < 4.0) {
                            var39 = -0.009991887;
                        } else {
                            var39 = -0.0063275467;
                        }
                    } else {
                        if (input[3] < 1.28) {
                            var39 = -0.0026700578;
                        } else {
                            var39 = 0.0074922144;
                        }
                    }
                }
            } else {
                if (input[2] < 9.0) {
                    if (input[0] < 42.0) {
                        if (input[1] < 2.0) {
                            var39 = -0.0091004055;
                        } else {
                            var39 = -0.0023105254;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var39 = -0.009899223;
                        } else {
                            var39 = -0.005408314;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var39 = -0.007941543;
                        } else {
                            var39 = -0.0030434297;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var39 = -0.00853131;
                        } else {
                            var39 = 0.010686718;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 3.71) {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.97) {
                            var39 = -0.0052232305;
                        } else {
                            var39 = -0.0024990796;
                        }
                    } else {
                        if (input[0] < 54.0) {
                            var39 = 0.0014921592;
                        } else {
                            var39 = -0.0024470696;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 48.0) {
                            var39 = 0.003070573;
                        } else {
                            var39 = -0.004499989;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var39 = -0.003544052;
                        } else {
                            var39 = 0.0059388904;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[4] < 2.0) {
                        var39 = -0.002690797;
                    } else {
                        if (input[3] < 3.99) {
                            var39 = 0.0036160152;
                        } else {
                            var39 = 0.004237704;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.66) {
                            var39 = 0.0016639391;
                        } else {
                            var39 = 0.011716816;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var39 = 0.0059367577;
                        } else {
                            var39 = 0.015841043;
                        }
                    }
                }
            }
        }
        double var40;
        if (input[3] < 3.29) {
            if (input[3] < 2.25) {
                if (input[1] < 5.0) {
                    if (input[0] < 38.0) {
                        if (input[1] < 2.0) {
                            var40 = -0.010350135;
                        } else {
                            var40 = -0.0050942055;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var40 = -0.009480218;
                        } else {
                            var40 = -0.006622327;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 24.0) {
                            var40 = -0.0054552797;
                        } else {
                            var40 = -0.009282351;
                        }
                    } else {
                        if (input[3] < 1.42) {
                            var40 = -0.005447407;
                        } else {
                            var40 = 0.0014866109;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 25.0) {
                        if (input[3] < 2.86) {
                            var40 = -0.002008422;
                        } else {
                            var40 = 0.0014298782;
                        }
                    } else {
                        if (input[0] < 79.0) {
                            var40 = -0.004134594;
                        } else {
                            var40 = -0.007972605;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var40 = -0.004995052;
                        } else {
                            var40 = -0.0005210252;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var40 = -0.006048052;
                        } else {
                            var40 = 0.005481376;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var40 = -0.002587995;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.86) {
                            var40 = -0.0009839394;
                        } else {
                            var40 = 0.004047244;
                        }
                    } else {
                        if (input[0] < 64.0) {
                            var40 = 0.0041958587;
                        } else {
                            var40 = 0.003357121;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[3] < 4.37) {
                        if (input[1] < 2.0) {
                            var40 = -0.0003031743;
                        } else {
                            var40 = 0.006113196;
                        }
                    } else {
                        if (input[3] < 4.77) {
                            var40 = 0.009540426;
                        } else {
                            var40 = 0.015473666;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 3.87) {
                            var40 = 0.014043468;
                        } else {
                            var40 = 0.007524585;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var40 = 0.006949027;
                        } else {
                            var40 = 0.026182786;
                        }
                    }
                }
            }
        }
        double var41;
        if (input[3] < 3.29) {
            if (input[3] < 2.16) {
                if (input[1] < 3.0) {
                    if (input[0] < 48.0) {
                        if (input[1] < 2.0) {
                            var41 = -0.009770933;
                        } else {
                            var41 = -0.006341892;
                        }
                    } else {
                        if (input[3] < 2.02) {
                            var41 = -0.0101139685;
                        } else {
                            var41 = -0.007602235;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[2] < 4.0) {
                            var41 = -0.008730936;
                        } else {
                            var41 = -0.0049870014;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var41 = -0.0056325323;
                        } else {
                            var41 = 0.003947018;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 31.0) {
                        if (input[1] < 2.0) {
                            var41 = -0.0046265866;
                        } else {
                            var41 = -0.00010889343;
                        }
                    } else {
                        if (input[0] < 79.0) {
                            var41 = -0.004178632;
                        } else {
                            var41 = -0.00791373;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var41 = -0.004951514;
                        } else {
                            var41 = -0.00061511126;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var41 = -0.0062586674;
                        } else {
                            var41 = 0.0050099376;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var41 = -0.0024593163;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.82) {
                            var41 = -0.0010520032;
                        } else {
                            var41 = 0.003797843;
                        }
                    } else {
                        if (input[0] < 87.0) {
                            var41 = 0.0038426195;
                        } else {
                            var41 = 0.002581137;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[3] < 4.35) {
                        if (input[1] < 2.0) {
                            var41 = -0.0003524425;
                        } else {
                            var41 = 0.0057183295;
                        }
                    } else {
                        if (input[3] < 4.77) {
                            var41 = 0.008953772;
                        } else {
                            var41 = 0.01471088;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 3.87) {
                            var41 = 0.0133655025;
                        } else {
                            var41 = 0.0071547367;
                        }
                    } else {
                        if (input[2] < 3.0) {
                            var41 = 0.0033399072;
                        } else {
                            var41 = 0.024005253;
                        }
                    }
                }
            }
        }
        double var42;
        if (input[3] < 3.12) {
            if (input[3] < 2.08) {
                if (input[1] < 3.0) {
                    if (input[0] < 48.0) {
                        if (input[1] < 2.0) {
                            var42 = -0.009293027;
                        } else {
                            var42 = -0.006202804;
                        }
                    } else {
                        if (input[3] < 1.28) {
                            var42 = -0.008244637;
                        } else {
                            var42 = -0.00988043;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 15.0) {
                            var42 = -0.005619523;
                        } else {
                            var42 = -0.009107043;
                        }
                    } else {
                        if (input[3] < 1.21) {
                            var42 = -0.0102790985;
                        } else {
                            var42 = -0.0022810677;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[2] < 7.0) {
                        if (input[3] < 2.53) {
                            var42 = -0.005669964;
                        } else {
                            var42 = -0.00254583;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var42 = -0.003420235;
                        } else {
                            var42 = 0.0014945039;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.86) {
                            var42 = -0.003518801;
                        } else {
                            var42 = -0.00026565717;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var42 = -0.00603074;
                        } else {
                            var42 = 0.007630545;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.13) {
                        if (input[0] < 79.0) {
                            var42 = -0.00068128906;
                        } else {
                            var42 = 0.00032111406;
                        }
                    } else {
                        var42 = -0.0023447296;
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.82) {
                            var42 = -0.0012592514;
                        } else {
                            var42 = 0.0036120825;
                        }
                    } else {
                        if (input[0] < 62.0) {
                            var42 = 0.0038810913;
                        } else {
                            var42 = 0.0027722677;
                        }
                    }
                }
            } else {
                if (input[3] < 4.25) {
                    if (input[1] < 4.0) {
                        if (input[3] < 3.78) {
                            var42 = 0.000020245134;
                        } else {
                            var42 = 0.004394037;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var42 = 0.00055499433;
                        } else {
                            var42 = 0.012658126;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[2] < 4.0) {
                            var42 = 0.009628196;
                        } else {
                            var42 = 0.006912775;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var42 = 0.010431001;
                        } else {
                            var42 = 0.024041656;
                        }
                    }
                }
            }
        }
        double var43;
        if (input[3] < 2.56) {
            if (input[3] < 1.68) {
                if (input[1] < 4.0) {
                    if (input[0] < 44.0) {
                        if (input[3] < 1.3) {
                            var43 = -0.008604784;
                        } else {
                            var43 = -0.0065472587;
                        }
                    } else {
                        if (input[2] < 6.0) {
                            var43 = -0.008181527;
                        } else {
                            var43 = -0.009625916;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[3] < 1.52) {
                            var43 = -0.00760664;
                        } else {
                            var43 = -0.0037269802;
                        }
                    } else {
                        if (input[3] < 1.28) {
                            var43 = -0.002090255;
                        } else {
                            var43 = 0.0059053064;
                        }
                    }
                }
            } else {
                if (input[2] < 9.0) {
                    if (input[0] < 42.0) {
                        if (input[1] < 2.0) {
                            var43 = -0.007972303;
                        } else {
                            var43 = -0.0016659178;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var43 = -0.008516568;
                        } else {
                            var43 = -0.004871593;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[1] < 2.0) {
                            var43 = -0.007162664;
                        } else {
                            var43 = -0.0020898487;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var43 = -0.0078779515;
                        } else {
                            var43 = 0.009953637;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 3.71) {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.97) {
                            var43 = -0.0043776426;
                        } else {
                            var43 = -0.0021090286;
                        }
                    } else {
                        if (input[0] < 54.0) {
                            var43 = 0.0014013107;
                        } else {
                            var43 = -0.0023335207;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 34.0) {
                            var43 = 0.004453554;
                        } else {
                            var43 = -0.0006399184;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var43 = 0.0012629138;
                        } else {
                            var43 = 0.011692065;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[4] < 2.0) {
                        var43 = -0.0021903021;
                    } else {
                        if (input[3] < 3.99) {
                            var43 = 0.0029575161;
                        } else {
                            var43 = 0.003470828;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.81) {
                            var43 = 0.0016361008;
                        } else {
                            var43 = 0.012247196;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var43 = 0.0044184653;
                        } else {
                            var43 = 0.013435902;
                        }
                    }
                }
            }
        }
        double var44;
        if (input[3] < 3.31) {
            if (input[3] < 2.49) {
                if (input[1] < 5.0) {
                    if (input[3] < 1.58) {
                        if (input[3] < 1.18) {
                            var44 = -0.008844979;
                        } else {
                            var44 = -0.007132146;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var44 = -0.005830506;
                        } else {
                            var44 = -0.001080182;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.85) {
                            var44 = -0.00762712;
                        } else {
                            var44 = -0.004190244;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var44 = -0.0070723714;
                        } else {
                            var44 = 0.0012959194;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[0] < 69.0) {
                        if (input[1] < 2.0) {
                            var44 = -0.003467551;
                        } else {
                            var44 = 0.00047115312;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var44 = -0.00581417;
                        } else {
                            var44 = -0.0024918418;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[2] < 4.0) {
                            var44 = -0.0018005004;
                        } else {
                            var44 = 0.002213214;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var44 = 0.0017026162;
                        } else {
                            var44 = 0.014096627;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var44 = -0.0021356212;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.86) {
                            var44 = -0.0008287088;
                        } else {
                            var44 = 0.0033185778;
                        }
                    } else {
                        if (input[0] < 83.0) {
                            var44 = 0.0033714199;
                        } else {
                            var44 = 0.0023963302;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[3] < 4.37) {
                        if (input[1] < 2.0) {
                            var44 = -0.00044515356;
                        } else {
                            var44 = 0.0050741765;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var44 = 0.007126763;
                        } else {
                            var44 = 0.012564178;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 3.87) {
                            var44 = 0.0119208805;
                        } else {
                            var44 = 0.0058997497;
                        }
                    } else {
                        if (input[2] < 2.0) {
                            var44 = -0.001982094;
                        } else {
                            var44 = 0.020801747;
                        }
                    }
                }
            }
        }
        double var45;
        if (input[3] < 3.12) {
            if (input[3] < 2.1) {
                if (input[1] < 3.0) {
                    if (input[0] < 57.0) {
                        if (input[1] < 2.0) {
                            var45 = -0.008142417;
                        } else {
                            var45 = -0.0056678257;
                        }
                    } else {
                        if (input[3] < 1.28) {
                            var45 = -0.006778288;
                        } else {
                            var45 = -0.009085337;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[2] < 4.0) {
                            var45 = -0.007394416;
                        } else {
                            var45 = -0.0041055805;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var45 = -0.005294535;
                        } else {
                            var45 = 0.0036243312;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.7) {
                            var45 = -0.005483532;
                        } else {
                            var45 = -0.0029497321;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var45 = -0.0036708538;
                        } else {
                            var45 = -0.00031959015;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 2.86) {
                            var45 = -0.0030967423;
                        } else {
                            var45 = -0.00021839813;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var45 = -0.005625447;
                        } else {
                            var45 = 0.007116673;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.13) {
                        if (input[0] < 79.0) {
                            var45 = -0.00048894883;
                        } else {
                            var45 = 0.00037409665;
                        }
                    } else {
                        var45 = -0.002052658;
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.78) {
                            var45 = -0.0015083319;
                        } else {
                            var45 = 0.0029336787;
                        }
                    } else {
                        if (input[0] < 62.0) {
                            var45 = 0.0033915986;
                        } else {
                            var45 = 0.002404064;
                        }
                    }
                }
            } else {
                if (input[3] < 4.4) {
                    if (input[2] < 4.0) {
                        if (input[0] < 60.0) {
                            var45 = 0.0031534773;
                        } else {
                            var45 = -0.0049609854;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var45 = 0.002830307;
                        } else {
                            var45 = 0.011497185;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[2] < 4.0) {
                            var45 = 0.0099817915;
                        } else {
                            var45 = 0.0057139355;
                        }
                    } else {
                        if (input[2] < 5.0) {
                            var45 = 0.007394459;
                        } else {
                            var45 = 0.021725686;
                        }
                    }
                }
            }
        }
        double var46;
        if (input[3] < 3.31) {
            if (input[3] < 2.4) {
                if (input[1] < 5.0) {
                    if (input[0] < 37.0) {
                        if (input[3] < 1.58) {
                            var46 = -0.006253667;
                        } else {
                            var46 = -0.002288903;
                        }
                    } else {
                        if (input[3] < 2.01) {
                            var46 = -0.0071996585;
                        } else {
                            var46 = -0.004999801;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 71.0) {
                            var46 = -0.0049894904;
                        } else {
                            var46 = -0.00844809;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var46 = -0.006374868;
                        } else {
                            var46 = 0.0011107756;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 55.0) {
                        if (input[3] < 2.86) {
                            var46 = -0.0024816417;
                        } else {
                            var46 = 0.00017593558;
                        }
                    } else {
                        if (input[0] < 88.0) {
                            var46 = -0.0036842339;
                        } else {
                            var46 = -0.007117086;
                        }
                    }
                } else {
                    if (input[1] < 5.0) {
                        if (input[1] < 2.0) {
                            var46 = -0.0033681374;
                        } else {
                            var46 = 0.0005034712;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var46 = -0.0028929305;
                        } else {
                            var46 = 0.006719269;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var46 = -0.0019274012;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.96) {
                            var46 = -0.0006899269;
                        } else {
                            var46 = 0.003058205;
                        }
                    } else {
                        if (input[0] < 87.0) {
                            var46 = 0.003023149;
                        } else {
                            var46 = 0.0019712632;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[3] < 4.72) {
                        if (input[1] < 2.0) {
                            var46 = 0.000005810887;
                        } else {
                            var46 = 0.005437798;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var46 = 0.006891294;
                        } else {
                            var46 = 0.018672219;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 3.87) {
                            var46 = 0.010933414;
                        } else {
                            var46 = 0.0052493773;
                        }
                    } else {
                        if (input[3] < 4.29) {
                            var46 = 0.010801113;
                        } else {
                            var46 = 0.025387282;
                        }
                    }
                }
            }
        }
        double var47;
        if (input[3] < 3.31) {
            if (input[3] < 2.53) {
                if (input[3] < 1.52) {
                    if (input[3] < 1.18) {
                        if (input[1] < 2.0) {
                            var47 = -0.00503705;
                        } else {
                            var47 = -0.008004081;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var47 = -0.006981177;
                        } else {
                            var47 = -0.004911564;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.06) {
                            var47 = -0.008818305;
                        } else {
                            var47 = -0.005360462;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var47 = -0.005718705;
                        } else {
                            var47 = -0.00094856304;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[0] < 69.0) {
                        if (input[1] < 2.0) {
                            var47 = -0.0029916102;
                        } else {
                            var47 = 0.00048159348;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var47 = -0.0050680162;
                        } else {
                            var47 = -0.0022686105;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[2] < 4.0) {
                            var47 = -0.0013883639;
                        } else {
                            var47 = 0.0017973458;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var47 = 0.0014918548;
                        } else {
                            var47 = 0.013238052;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var47 = -0.0018315768;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.96) {
                            var47 = -0.00065692764;
                        } else {
                            var47 = 0.0029087705;
                        }
                    } else {
                        if (input[0] < 87.0) {
                            var47 = 0.0028725471;
                        } else {
                            var47 = 0.0018758805;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[3] < 4.57) {
                        if (input[1] < 2.0) {
                            var47 = -0.00037884098;
                        } else {
                            var47 = 0.004932776;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var47 = 0.0065278956;
                        } else {
                            var47 = 0.014960932;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 62.0) {
                            var47 = 0.0067995423;
                        } else {
                            var47 = -0.005238198;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var47 = 0.008199736;
                        } else {
                            var47 = 0.01977899;
                        }
                    }
                }
            }
        }
        double var48;
        if (input[3] < 3.31) {
            if (input[3] < 2.1) {
                if (input[1] < 3.0) {
                    if (input[0] < 57.0) {
                        if (input[1] < 2.0) {
                            var48 = -0.0070912647;
                        } else {
                            var48 = -0.004883623;
                        }
                    } else {
                        if (input[3] < 1.28) {
                            var48 = -0.0057715094;
                        } else {
                            var48 = -0.007985553;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 67.0) {
                            var48 = -0.0037890815;
                        } else {
                            var48 = -0.0069404887;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var48 = -0.004632144;
                        } else {
                            var48 = 0.0037611052;
                        }
                    }
                }
            } else {
                if (input[1] < 3.0) {
                    if (input[3] < 2.56) {
                        if (input[0] < 26.0) {
                            var48 = -0.0026190933;
                        } else {
                            var48 = -0.0047455113;
                        }
                    } else {
                        if (input[3] < 3.09) {
                            var48 = -0.002425006;
                        } else {
                            var48 = -0.00044857943;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 35.0) {
                            var48 = 0.001706272;
                        } else {
                            var48 = -0.0020191916;
                        }
                    } else {
                        if (input[4] < 3.0) {
                            var48 = -0.0011432909;
                        } else {
                            var48 = 0.006898485;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var48 = -0.0017405177;
                } else {
                    if (input[3] < 3.43) {
                        if (input[2] < 3.0) {
                            var48 = -0.0018279407;
                        } else {
                            var48 = 0.0022421766;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var48 = 0.001961814;
                        } else {
                            var48 = 0.0027110574;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 4.59) {
                        if (input[0] < 46.0) {
                            var48 = 0.004093846;
                        } else {
                            var48 = -0.0034400937;
                        }
                    } else {
                        if (input[3] < 4.81) {
                            var48 = 0.0066023283;
                        } else {
                            var48 = 0.013282117;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var48 = -0.00004279092;
                        } else {
                            var48 = 0.005752206;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var48 = 0.0067405524;
                        } else {
                            var48 = 0.015158832;
                        }
                    }
                }
            }
        }
        double var49;
        if (input[3] < 2.56) {
            if (input[3] < 1.52) {
                if (input[3] < 1.13) {
                    if (input[1] < 2.0) {
                        var49 = -0.004396494;
                    } else {
                        if (input[2] < 4.0) {
                            var49 = -0.0058375774;
                        } else {
                            var49 = -0.009116928;
                        }
                    }
                } else {
                    if (input[0] < 27.0) {
                        if (input[2] < 9.0) {
                            var49 = -0.004745676;
                        } else {
                            var49 = 0.0018895323;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var49 = -0.006218719;
                        } else {
                            var49 = -0.004321566;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.06) {
                        if (input[2] < 4.0) {
                            var49 = -0.005765132;
                        } else {
                            var49 = -0.009571648;
                        }
                    } else {
                        if (input[3] < 2.37) {
                            var49 = -0.005370276;
                        } else {
                            var49 = -0.0038192351;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 46.0) {
                            var49 = -0.0026153491;
                        } else {
                            var49 = -0.0073958756;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var49 = -0.004912188;
                        } else {
                            var49 = 0.000025827421;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 3.71) {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.84) {
                            var49 = -0.0037002768;
                        } else {
                            var49 = -0.0018883108;
                        }
                    } else {
                        if (input[0] < 54.0) {
                            var49 = 0.0011437632;
                        } else {
                            var49 = -0.0022460436;
                        }
                    }
                } else {
                    if (input[0] < 68.0) {
                        if (input[2] < 9.0) {
                            var49 = 0.0019865772;
                        } else {
                            var49 = 0.007515614;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var49 = -0.0055734427;
                        } else {
                            var49 = 0.00067740894;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[4] < 2.0) {
                        var49 = -0.0016007171;
                    } else {
                        if (input[2] < 4.0) {
                            var49 = 0.002702386;
                        } else {
                            var49 = 0.0023382958;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 4.77) {
                            var49 = 0.0037165086;
                        } else {
                            var49 = 0.010162598;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var49 = 0.005471334;
                        } else {
                            var49 = 0.014959085;
                        }
                    }
                }
            }
        }
        double var50;
        if (input[3] < 3.22) {
            if (input[3] < 2.08) {
                if (input[1] < 4.0) {
                    if (input[0] < 43.0) {
                        if (input[1] < 2.0) {
                            var50 = -0.0065743364;
                        } else {
                            var50 = -0.003448962;
                        }
                    } else {
                        if (input[0] < 77.0) {
                            var50 = -0.005950706;
                        } else {
                            var50 = -0.0070889727;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 67.0) {
                            var50 = -0.0032296428;
                        } else {
                            var50 = -0.0063987398;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var50 = -0.0017579201;
                        } else {
                            var50 = 0.0071191564;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[2] < 9.0) {
                        if (input[0] < 74.0) {
                            var50 = -0.0015782133;
                        } else {
                            var50 = -0.0043154117;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var50 = -0.0016386679;
                        } else {
                            var50 = 0.00836354;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 18.0) {
                            var50 = 0.00036007672;
                        } else {
                            var50 = -0.0023969419;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var50 = -0.0047979755;
                        } else {
                            var50 = 0.006068422;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.23) {
                        var50 = -0.00049026014;
                    } else {
                        if (input[3] < 3.68) {
                            var50 = -0.0018444918;
                        } else {
                            var50 = -0.0015234298;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.86) {
                            var50 = -0.0008606496;
                        } else {
                            var50 = 0.0025089805;
                        }
                    } else {
                        if (input[0] < 17.0) {
                            var50 = 0.0031369217;
                        } else {
                            var50 = 0.0022386515;
                        }
                    }
                }
            } else {
                if (input[3] < 4.45) {
                    if (input[2] < 4.0) {
                        if (input[0] < 25.0) {
                            var50 = 0.006199255;
                        } else {
                            var50 = -0.002094806;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var50 = 0.0022926964;
                        } else {
                            var50 = 0.009828283;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[2] < 4.0) {
                            var50 = 0.008264811;
                        } else {
                            var50 = 0.004169631;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var50 = 0.002454042;
                        } else {
                            var50 = 0.017523577;
                        }
                    }
                }
            }
        }
        double var51;
        if (input[3] < 2.56) {
            if (input[2] < 9.0) {
                if (input[1] < 5.0) {
                    if (input[0] < 76.0) {
                        if (input[3] < 1.58) {
                            var51 = -0.005467226;
                        } else {
                            var51 = -0.0033366976;
                        }
                    } else {
                        if (input[3] < 2.18) {
                            var51 = -0.006970312;
                        } else {
                            var51 = -0.0052225585;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[3] < 1.85) {
                            var51 = -0.0056398683;
                        } else {
                            var51 = -0.002754699;
                        }
                    } else {
                        if (input[3] < 1.44) {
                            var51 = -0.00310501;
                        } else {
                            var51 = 0.0013998587;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 1.68) {
                        if (input[0] < 6.0) {
                            var51 = -0.0028497146;
                        } else {
                            var51 = -0.0068996297;
                        }
                    } else {
                        if (input[0] < 70.0) {
                            var51 = -0.0007105047;
                        } else {
                            var51 = -0.004495803;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[4] < 2.0) {
                            var51 = -0.005242603;
                        } else {
                            var51 = 0.0017497115;
                        }
                    } else {
                        if (input[3] < 1.13) {
                            var51 = -0.0027276555;
                        } else {
                            var51 = 0.008675598;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 3.71) {
                if (input[0] < 24.0) {
                    if (input[1] < 2.0) {
                        if (input[4] < 2.0) {
                            var51 = -0.00080432295;
                        } else {
                            var51 = -0.002766011;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var51 = -0.0031754393;
                        } else {
                            var51 = 0.004792012;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 73.0) {
                            var51 = -0.0012807932;
                        } else {
                            var51 = -0.005062291;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var51 = -0.00010177626;
                        } else {
                            var51 = 0.0043780296;
                        }
                    }
                }
            } else {
                if (input[4] < 4.0) {
                    if (input[4] < 2.0) {
                        var51 = -0.0014456371;
                    } else {
                        if (input[2] < 4.0) {
                            var51 = 0.002453432;
                        } else {
                            var51 = 0.0021051483;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.86) {
                            var51 = 0.00081471;
                        } else {
                            var51 = 0.010683282;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var51 = 0.002285158;
                        } else {
                            var51 = 0.009732487;
                        }
                    }
                }
            }
        }
        double var52;
        if (input[3] < 3.37) {
            if (input[3] < 2.49) {
                if (input[1] < 5.0) {
                    if (input[2] < 9.0) {
                        if (input[0] < 66.0) {
                            var52 = -0.003950261;
                        } else {
                            var52 = -0.006028607;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var52 = -0.0041126925;
                        } else {
                            var52 = 0.0061130053;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 24.0) {
                            var52 = -0.00242196;
                        } else {
                            var52 = -0.0052574147;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var52 = -0.005560094;
                        } else {
                            var52 = 0.0015012794;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[0] < 69.0) {
                        if (input[1] < 2.0) {
                            var52 = -0.002376004;
                        } else {
                            var52 = 0.0005428863;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var52 = -0.002924736;
                        } else {
                            var52 = 0.00040508388;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 50.0) {
                            var52 = 0.0001580677;
                        } else {
                            var52 = -0.0027747536;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var52 = 0.0009940907;
                        } else {
                            var52 = 0.0070358166;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    var52 = -0.0014297656;
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.96) {
                            var52 = -0.0005344776;
                        } else {
                            var52 = 0.002310827;
                        }
                    } else {
                        if (input[4] < 3.0) {
                            var52 = 0.0019110636;
                        } else {
                            var52 = 0.0025119067;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 49.0) {
                        if (input[3] < 4.65) {
                            var52 = 0.0034683913;
                        } else {
                            var52 = 0.010796902;
                        }
                    } else {
                        if (input[3] < 4.5) {
                            var52 = -0.0038591528;
                        } else {
                            var52 = 0.004371309;
                        }
                    }
                } else {
                    if (input[1] < 2.0) {
                        if (input[3] < 4.76) {
                            var52 = -0.0018391993;
                        } else {
                            var52 = 0.0062001334;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var52 = 0.0051306253;
                        } else {
                            var52 = 0.011612653;
                        }
                    }
                }
            }
        }
        double var53;
        if (input[3] < 3.37) {
            if (input[3] < 2.09) {
                if (input[1] < 3.0) {
                    if (input[0] < 6.0) {
                        if (input[4] < 6.0) {
                            var53 = -0.004345783;
                        } else {
                            var53 = 0.00113343;
                        }
                    } else {
                        if (input[0] < 59.0) {
                            var53 = -0.004997687;
                        } else {
                            var53 = -0.005898276;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 11.0) {
                            var53 = -0.0024893524;
                        } else {
                            var53 = -0.0056001483;
                        }
                    } else {
                        if (input[3] < 1.21) {
                            var53 = -0.007306162;
                        } else {
                            var53 = -0.0005958141;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[0] < 25.0) {
                        if (input[1] < 2.0) {
                            var53 = -0.0028899754;
                        } else {
                            var53 = 0.0014532566;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var53 = -0.0033398927;
                        } else {
                            var53 = -0.00096418586;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 54.0) {
                            var53 = -0.00032324097;
                        } else {
                            var53 = -0.0028414854;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var53 = -0.0042565186;
                        } else {
                            var53 = 0.0053018616;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.69) {
                        if (input[0] < 98.0) {
                            var53 = -0.0016036596;
                        } else {
                            var53 = -0.00038167834;
                        }
                    } else {
                        var53 = -0.001302103;
                    }
                } else {
                    if (input[3] < 3.43) {
                        if (input[2] < 4.0) {
                            var53 = -0.0020186116;
                        } else {
                            var53 = 0.0020028225;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var53 = 0.0015252958;
                        } else {
                            var53 = 0.0021252034;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[3] < 4.77) {
                        if (input[0] < 59.0) {
                            var53 = 0.004529104;
                        } else {
                            var53 = 0.0004592645;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var53 = 0.005043228;
                        } else {
                            var53 = 0.016600518;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[3] < 3.87) {
                            var53 = 0.008920959;
                        } else {
                            var53 = 0.0032692738;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var53 = 0.0024944523;
                        } else {
                            var53 = 0.016870694;
                        }
                    }
                }
            }
        }
        double var54;
        if (input[3] < 2.92) {
            if (input[3] < 2.01) {
                if (input[0] < 42.0) {
                    if (input[3] < 1.35) {
                        if (input[1] < 5.0) {
                            var54 = -0.005082173;
                        } else {
                            var54 = -0.0029049872;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var54 = -0.0066028596;
                        } else {
                            var54 = -0.00038903198;
                        }
                    }
                } else {
                    if (input[1] < 5.0) {
                        if (input[2] < 9.0) {
                            var54 = -0.0053417166;
                        } else {
                            var54 = -0.0038163636;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var54 = -0.0036379825;
                        } else {
                            var54 = 0.0028599303;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 85.0) {
                        if (input[0] < 17.0) {
                            var54 = -0.00015274943;
                        } else {
                            var54 = -0.0029720676;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var54 = -0.0015534258;
                        } else {
                            var54 = -0.0074645625;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[1] < 4.0) {
                            var54 = -0.004043616;
                        } else {
                            var54 = -0.008035378;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var54 = -0.00048668124;
                        } else {
                            var54 = 0.005900263;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                if (input[0] < 51.0) {
                    if (input[3] < 3.68) {
                        if (input[2] < 4.0) {
                            var54 = -0.0027400143;
                        } else {
                            var54 = -0.0014206996;
                        }
                    } else {
                        var54 = -0.0012272045;
                    }
                } else {
                    if (input[3] < 3.13) {
                        if (input[1] < 4.0) {
                            var54 = -0.0012923757;
                        } else {
                            var54 = 0.00075406337;
                        }
                    } else {
                        var54 = -0.0012857595;
                    }
                }
            } else {
                if (input[3] < 4.25) {
                    if (input[0] < 49.0) {
                        if (input[1] < 2.0) {
                            var54 = -0.0010633103;
                        } else {
                            var54 = 0.004371287;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var54 = -0.0025591538;
                        } else {
                            var54 = 0.0018105507;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[4] < 4.0) {
                            var54 = 0.0020060611;
                        } else {
                            var54 = 0.004235731;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var54 = 0.0025223566;
                        } else {
                            var54 = 0.013407907;
                        }
                    }
                }
            }
        }
        double var55;
        if (input[3] < 2.59) {
            if (input[3] < 1.58) {
                if (input[3] < 1.13) {
                    if (input[1] < 2.0) {
                        var55 = -0.0029222718;
                    } else {
                        if (input[2] < 4.0) {
                            var55 = -0.0043716487;
                        } else {
                            var55 = -0.007540267;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[0] < 19.0) {
                            var55 = -0.0033504795;
                        } else {
                            var55 = -0.0048231985;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var55 = -0.0037239369;
                        } else {
                            var55 = 0.0035358784;
                        }
                    }
                }
            } else {
                if (input[1] < 2.0) {
                    if (input[3] < 2.14) {
                        if (input[2] < 4.0) {
                            var55 = -0.004500806;
                        } else {
                            var55 = -0.007414944;
                        }
                    } else {
                        if (input[3] < 2.37) {
                            var55 = -0.004206121;
                        } else {
                            var55 = -0.0030681526;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 50.0) {
                            var55 = -0.0017114759;
                        } else {
                            var55 = -0.0059817727;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var55 = -0.0042114747;
                        } else {
                            var55 = 0.0008458385;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 3.86) {
                if (input[1] < 4.0) {
                    if (input[0] < 69.0) {
                        if (input[1] < 2.0) {
                            var55 = -0.0020350448;
                        } else {
                            var55 = 0.0011765416;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var55 = -0.0036759393;
                        } else {
                            var55 = -0.0012610977;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 34.0) {
                            var55 = 0.0034207494;
                        } else {
                            var55 = -0.00050676445;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var55 = 0.0005529992;
                        } else {
                            var55 = 0.01272391;
                        }
                    }
                }
            } else {
                if (input[4] < 6.0) {
                    if (input[4] < 2.0) {
                        var55 = -0.0011748356;
                    } else {
                        if (input[4] < 4.0) {
                            var55 = 0.001874739;
                        } else {
                            var55 = 0.003495992;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 4.77) {
                            var55 = 0.0028267235;
                        } else {
                            var55 = 0.013474933;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var55 = 0.00020113567;
                        } else {
                            var55 = 0.01767913;
                        }
                    }
                }
            }
        }
        double var56;
        if (input[3] < 3.37) {
            if (input[3] < 2.49) {
                if (input[2] < 9.0) {
                    if (input[0] < 76.0) {
                        if (input[3] < 1.52) {
                            var56 = -0.004137626;
                        } else {
                            var56 = -0.0022069595;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var56 = -0.0054250117;
                        } else {
                            var56 = -0.0034899053;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 1.68) {
                            var56 = -0.0055127796;
                        } else {
                            var56 = -0.0017921504;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var56 = -0.00070199586;
                        } else {
                            var56 = 0.0071422914;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[4] < 2.0) {
                        if (input[3] < 2.83) {
                            var56 = -0.0042579602;
                        } else {
                            var56 = -0.0017749002;
                        }
                    } else {
                        if (input[0] < 62.0) {
                            var56 = 0.00044160467;
                        } else {
                            var56 = -0.0015498508;
                        }
                    }
                } else {
                    if (input[2] < 5.0) {
                        if (input[0] < 89.0) {
                            var56 = -0.000060788716;
                        } else {
                            var56 = -0.00461843;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var56 = 0.0006325713;
                        } else {
                            var56 = 0.006538993;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.69) {
                        if (input[0] < 98.0) {
                            var56 = -0.0014449428;
                        } else {
                            var56 = -0.0003273189;
                        }
                    } else {
                        var56 = -0.0011191805;
                    }
                } else {
                    if (input[3] < 3.43) {
                        if (input[2] < 4.0) {
                            var56 = -0.0018444691;
                        } else {
                            var56 = 0.0018017812;
                        }
                    } else {
                        if (input[2] < 3.0) {
                            var56 = 0.002077134;
                        } else {
                            var56 = 0.0016024256;
                        }
                    }
                }
            } else {
                if (input[3] < 4.52) {
                    if (input[2] < 4.0) {
                        if (input[0] < 25.0) {
                            var56 = 0.005219962;
                        } else {
                            var56 = -0.0021478217;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var56 = -0.0022191291;
                        } else {
                            var56 = 0.006279067;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[2] < 4.0) {
                            var56 = 0.006819705;
                        } else {
                            var56 = 0.0026890044;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var56 = 0.0021892686;
                        } else {
                            var56 = 0.016535407;
                        }
                    }
                }
            }
        }
        double var57;
        if (input[3] < 3.12) {
            if (input[3] < 2.01) {
                if (input[0] < 40.0) {
                    if (input[3] < 1.35) {
                        if (input[1] < 5.0) {
                            var57 = -0.0043945364;
                        } else {
                            var57 = -0.002336237;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var57 = -0.0059095225;
                        } else {
                            var57 = -0.00010412636;
                        }
                    }
                } else {
                    if (input[1] < 5.0) {
                        if (input[2] < 9.0) {
                            var57 = -0.004640008;
                        } else {
                            var57 = -0.003296187;
                        }
                    } else {
                        if (input[2] < 5.0) {
                            var57 = -0.0046109715;
                        } else {
                            var57 = -0.0007667661;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[0] < 29.0) {
                        if (input[1] < 2.0) {
                            var57 = -0.0029167875;
                        } else {
                            var57 = 0.0007414148;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var57 = -0.0035812133;
                        } else {
                            var57 = -0.0017400334;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 35.0) {
                            var57 = 0.0016191142;
                        } else {
                            var57 = -0.0014036503;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var57 = -0.006457048;
                        } else {
                            var57 = 0.007577434;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                if (input[3] < 3.13) {
                    if (input[0] < 79.0) {
                        if (input[0] < 6.0) {
                            var57 = 0.00019710958;
                        } else {
                            var57 = -0.0000016510487;
                        }
                    } else {
                        var57 = 0.0011964381;
                    }
                } else {
                    if (input[3] < 3.18) {
                        var57 = -0.00220607;
                    } else {
                        if (input[3] < 3.26) {
                            var57 = -0.000341928;
                        } else {
                            var57 = -0.0011659758;
                        }
                    }
                }
            } else {
                if (input[3] < 4.25) {
                    if (input[0] < 45.0) {
                        if (input[1] < 2.0) {
                            var57 = -0.0008335636;
                        } else {
                            var57 = 0.0042957864;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var57 = -0.0020384898;
                        } else {
                            var57 = 0.0018205045;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[4] < 4.0) {
                            var57 = 0.0017255864;
                        } else {
                            var57 = 0.0036757519;
                        }
                    } else {
                        if (input[1] < 5.0) {
                            var57 = 0.006076246;
                        } else {
                            var57 = 0.017175801;
                        }
                    }
                }
            }
        }
        double var58;
        if (input[3] < 3.37) {
            if (input[3] < 2.49) {
                if (input[2] < 4.0) {
                    if (input[0] < 10.0) {
                        if (input[3] < 1.76) {
                            var58 = -0.0038948932;
                        } else {
                            var58 = 0.0007505348;
                        }
                    } else {
                        if (input[0] < 80.0) {
                            var58 = -0.0037779647;
                        } else {
                            var58 = -0.005373585;
                        }
                    }
                } else {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var58 = -0.004481103;
                        } else {
                            var58 = -0.002935998;
                        }
                    } else {
                        if (input[3] < 1.21) {
                            var58 = -0.0060968264;
                        } else {
                            var58 = 0.000028425351;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[4] < 2.0) {
                        if (input[3] < 2.83) {
                            var58 = -0.0039773304;
                        } else {
                            var58 = -0.0016367224;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var58 = -0.0006660685;
                        } else {
                            var58 = 0.0018702308;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 87.0) {
                            var58 = -0.00056438474;
                        } else {
                            var58 = -0.0044184485;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var58 = 0.00067001657;
                        } else {
                            var58 = 0.0056942496;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.69) {
                        if (input[0] < 98.0) {
                            var58 = -0.0013188983;
                        } else {
                            var58 = -0.00028998853;
                        }
                    } else {
                        var58 = -0.0010057521;
                    }
                } else {
                    if (input[3] < 3.43) {
                        if (input[2] < 6.0) {
                            var58 = -0.0006615792;
                        } else {
                            var58 = 0.0028079662;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var58 = 0.0018662344;
                        } else {
                            var58 = 0.0013845549;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[3] < 4.77) {
                        if (input[0] < 59.0) {
                            var58 = 0.0036137335;
                        } else {
                            var58 = -0.00006129459;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var58 = 0.0040502413;
                        } else {
                            var58 = 0.01368891;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[0] < 88.0) {
                            var58 = 0.0024009324;
                        } else {
                            var58 = -0.0070166485;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var58 = 0.0049143354;
                        } else {
                            var58 = 0.013377415;
                        }
                    }
                }
            }
        }
        double var59;
        if (input[3] < 3.37) {
            if (input[3] < 2.19) {
                if (input[0] < 76.0) {
                    if (input[1] < 3.0) {
                        if (input[1] < 2.0) {
                            var59 = -0.004290691;
                        } else {
                            var59 = -0.0030676702;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var59 = -0.00349609;
                        } else {
                            var59 = -0.00012896436;
                        }
                    }
                } else {
                    if (input[2] < 7.0) {
                        if (input[1] < 2.0) {
                            var59 = -0.0033995;
                        } else {
                            var59 = -0.0051552453;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var59 = -0.004868469;
                        } else {
                            var59 = -0.00012827326;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[0] < 74.0) {
                        if (input[1] < 2.0) {
                            var59 = -0.0022201312;
                        } else {
                            var59 = -0.000036447153;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var59 = -0.0039826673;
                        } else {
                            var59 = -0.0019875749;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 35.0) {
                            var59 = 0.0015695147;
                        } else {
                            var59 = -0.0010956738;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var59 = -0.00008117144;
                        } else {
                            var59 = 0.009692919;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.69) {
                        if (input[0] < 98.0) {
                            var59 = -0.0012552257;
                        } else {
                            var59 = -0.0002827406;
                        }
                    } else {
                        var59 = -0.00095583143;
                    }
                } else {
                    if (input[3] < 3.43) {
                        if (input[2] < 6.0) {
                            var59 = -0.00063086156;
                        } else {
                            var59 = 0.0026876298;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var59 = 0.001773619;
                        } else {
                            var59 = 0.0013156728;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 4.52) {
                        if (input[0] < 43.0) {
                            var59 = 0.0028360556;
                        } else {
                            var59 = -0.00057273975;
                        }
                    } else {
                        if (input[3] < 4.91) {
                            var59 = 0.0041323877;
                        } else {
                            var59 = 0.0080205;
                        }
                    }
                } else {
                    if (input[2] < 4.0) {
                        if (input[0] < 49.0) {
                            var59 = 0.0034207222;
                        } else {
                            var59 = -0.004071073;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var59 = 0.004478725;
                        } else {
                            var59 = 0.012161859;
                        }
                    }
                }
            }
        }
        double var60;
        if (input[3] < 2.59) {
            if (input[1] < 5.0) {
                if (input[0] < 25.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 2.3) {
                            var60 = -0.0044902256;
                        } else {
                            var60 = -0.002188414;
                        }
                    } else {
                        if (input[3] < 1.35) {
                            var60 = -0.0040889373;
                        } else {
                            var60 = 0.0005516917;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 81.0) {
                            var60 = -0.0031867847;
                        } else {
                            var60 = -0.0046822587;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var60 = -0.0035695843;
                        } else {
                            var60 = 0.005875477;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[3] < 1.85) {
                        var60 = -0.0038626844;
                    } else {
                        if (input[0] < 71.0) {
                            var60 = -0.0010736034;
                        } else {
                            var60 = -0.006867929;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 1.85) {
                            var60 = -0.00031336816;
                        } else {
                            var60 = -0.008002645;
                        }
                    } else {
                        if (input[3] < 1.5) {
                            var60 = -0.0017432336;
                        } else {
                            var60 = 0.0039729946;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 3.79) {
                if (input[1] < 3.0) {
                    if (input[1] < 2.0) {
                        if (input[3] < 3.58) {
                            var60 = -0.0013953451;
                        } else {
                            var60 = -0.0033946678;
                        }
                    } else {
                        if (input[0] < 69.0) {
                            var60 = 0.00052917766;
                        } else {
                            var60 = -0.00230413;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 52.0) {
                            var60 = 0.0018681154;
                        } else {
                            var60 = -0.0011621683;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var60 = 0.00040345496;
                        } else {
                            var60 = 0.007596098;
                        }
                    }
                }
            } else {
                if (input[4] < 6.0) {
                    if (input[4] < 2.0) {
                        var60 = -0.0009095098;
                    } else {
                        if (input[4] < 4.0) {
                            var60 = 0.001446264;
                        } else {
                            var60 = 0.002831402;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 4.72) {
                            var60 = 0.0016912085;
                        } else {
                            var60 = 0.009558107;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var60 = -0.0008870395;
                        } else {
                            var60 = 0.014736156;
                        }
                    }
                }
            }
        }
        double var61;
        if (input[3] < 3.2) {
            if (input[3] < 2.01) {
                if (input[0] < 42.0) {
                    if (input[3] < 1.58) {
                        if (input[2] < 4.0) {
                            var61 = -0.004049934;
                        } else {
                            var61 = -0.002019825;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var61 = -0.005149222;
                        } else {
                            var61 = 0.0008161315;
                        }
                    }
                } else {
                    if (input[1] < 5.0) {
                        if (input[3] < 1.13) {
                            var61 = -0.0048723035;
                        } else {
                            var61 = -0.0035726638;
                        }
                    } else {
                        if (input[2] < 9.0) {
                            var61 = -0.0027059575;
                        } else {
                            var61 = 0.0025684827;
                        }
                    }
                }
            } else {
                if (input[2] < 4.0) {
                    if (input[0] < 19.0) {
                        if (input[1] < 2.0) {
                            var61 = -0.0022897075;
                        } else {
                            var61 = 0.00072573975;
                        }
                    } else {
                        if (input[0] < 80.0) {
                            var61 = -0.002042825;
                        } else {
                            var61 = -0.004637755;
                        }
                    }
                } else {
                    if (input[4] < 2.0) {
                        if (input[3] < 2.77) {
                            var61 = -0.0049900245;
                        } else {
                            var61 = -0.0012008313;
                        }
                    } else {
                        if (input[1] < 3.0) {
                            var61 = -0.001500774;
                        } else {
                            var61 = 0.0021771854;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 2.0) {
                if (input[3] < 3.26) {
                    if (input[2] < 4.0) {
                        var61 = 0.00076170266;
                    } else {
                        if (input[1] < 2.0) {
                            var61 = -0.00001812776;
                        } else {
                            var61 = -0.0006819447;
                        }
                    }
                } else {
                    if (input[3] < 3.69) {
                        if (input[0] < 61.0) {
                            var61 = -0.0015748468;
                        } else {
                            var61 = -0.0009712726;
                        }
                    } else {
                        if (input[3] < 3.7) {
                            var61 = -0.0002475858;
                        } else {
                            var61 = -0.0008649593;
                        }
                    }
                }
            } else {
                if (input[3] < 4.57) {
                    if (input[0] < 59.0) {
                        if (input[1] < 2.0) {
                            var61 = -0.0007789049;
                        } else {
                            var61 = 0.003637474;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var61 = -0.002277992;
                        } else {
                            var61 = 0.0018323055;
                        }
                    }
                } else {
                    if (input[4] < 6.0) {
                        if (input[2] < 4.0) {
                            var61 = 0.0035895936;
                        } else {
                            var61 = 0.0016341007;
                        }
                    } else {
                        if (input[1] < 2.0) {
                            var61 = 0.0010571234;
                        } else {
                            var61 = 0.014688338;
                        }
                    }
                }
            }
        }
        double var62;
        if (input[3] < 3.37) {
            if (input[3] < 2.1) {
                if (input[0] < 76.0) {
                    if (input[1] < 3.0) {
                        if (input[0] < 6.0) {
                            var62 = -0.0019724532;
                        } else {
                            var62 = -0.0034220086;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var62 = -0.0032448028;
                        } else {
                            var62 = -0.00005996764;
                        }
                    }
                } else {
                    if (input[2] < 7.0) {
                        if (input[3] < 1.9) {
                            var62 = -0.003914884;
                        } else {
                            var62 = -0.005886869;
                        }
                    } else {
                        if (input[1] < 4.0) {
                            var62 = -0.0045615146;
                        } else {
                            var62 = -0.00007130582;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[0] < 69.0) {
                        if (input[1] < 2.0) {
                            var62 = -0.0020869707;
                        } else {
                            var62 = 0.00018923123;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var62 = -0.0033635895;
                        } else {
                            var62 = -0.0012051914;
                        }
                    }
                } else {
                    if (input[2] < 5.0) {
                        if (input[0] < 93.0) {
                            var62 = -0.00025340213;
                        } else {
                            var62 = -0.004075523;
                        }
                    } else {
                        if (input[4] < 2.0) {
                            var62 = -0.004013999;
                        } else {
                            var62 = 0.0043717637;
                        }
                    }
                }
            }
        } else {
            if (input[4] < 4.0) {
                if (input[4] < 2.0) {
                    if (input[3] < 3.69) {
                        if (input[0] < 38.0) {
                            var62 = -0.0014048815;
                        } else {
                            var62 = -0.0008847384;
                        }
                    } else {
                        var62 = -0.00081958313;
                    }
                } else {
                    if (input[4] < 3.0) {
                        if (input[3] < 3.51) {
                            var62 = -0.000082847975;
                        } else {
                            var62 = 0.0011827113;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var62 = 0.0018209433;
                        } else {
                            var62 = 0.00115273;
                        }
                    }
                }
            } else {
                if (input[1] < 5.0) {
                    if (input[3] < 4.77) {
                        if (input[0] < 59.0) {
                            var62 = 0.003008044;
                        } else {
                            var62 = -0.00025328188;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var62 = 0.003325857;
                        } else {
                            var62 = 0.011687238;
                        }
                    }
                } else {
                    if (input[2] < 3.0) {
                        if (input[0] < 33.0) {
                            var62 = 0.005405176;
                        } else {
                            var62 = -0.0025439297;
                        }
                    } else {
                        if (input[4] < 6.0) {
                            var62 = 0.0042097466;
                        } else {
                            var62 = 0.011326792;
                        }
                    }
                }
            }
        }
        double var63;
        if (input[3] < 2.53) {
            if (input[2] < 9.0) {
                if (input[0] < 76.0) {
                    if (input[1] < 5.0) {
                        if (input[3] < 1.58) {
                            var63 = -0.0032069136;
                        } else {
                            var63 = -0.0018811697;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var63 = -0.0021757802;
                        } else {
                            var63 = 0.0009922603;
                        }
                    }
                } else {
                    if (input[1] < 5.0) {
                        if (input[1] < 2.0) {
                            var63 = -0.0027500212;
                        } else {
                            var63 = -0.0043268953;
                        }
                    } else {
                        if (input[3] < 2.08) {
                            var63 = -0.003341347;
                        } else {
                            var63 = 0.00037447363;
                        }
                    }
                }
            } else {
                if (input[1] < 4.0) {
                    if (input[3] < 1.68) {
                        if (input[0] < 43.0) {
                            var63 = -0.0031969175;
                        } else {
                            var63 = -0.0048858854;
                        }
                    } else {
                        if (input[0] < 69.0) {
                            var63 = 0.000174139;
                        } else {
                            var63 = -0.0029120352;
                        }
                    }
                } else {
                    if (input[4] < 4.0) {
                        if (input[4] < 2.0) {
                            var63 = -0.0039562583;
                        } else {
                            var63 = 0.0016890023;
                        }
                    } else {
                        if (input[3] < 1.13) {
                            var63 = -0.0021188399;
                        } else {
                            var63 = 0.006992053;
                        }
                    }
                }
            }
        } else {
            if (input[3] < 4.17) {
                if (input[1] < 4.0) {
                    if (input[0] < 25.0) {
                        if (input[1] < 2.0) {
                            var63 = -0.0013597505;
                        } else {
                            var63 = 0.0021641112;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var63 = -0.0015218279;
                        } else {
                            var63 = -0.00027874814;
                        }
                    }
                } else {
                    if (input[2] < 9.0) {
                        if (input[0] < 34.0) {
                            var63 = 0.0024504156;
                        } else {
                            var63 = -0.00039685934;
                        }
                    } else {
                        if (input[4] < 4.0) {
                            var63 = 0.00029356565;
                        } else {
                            var63 = 0.010209558;
                        }
                    }
                }
            } else {
                if (input[4] < 6.0) {
                    if (input[4] < 2.0) {
                        var63 = -0.0007743489;
                    } else {
                        if (input[4] < 4.0) {
                            var63 = 0.0012613685;
                        } else {
                            var63 = 0.0025985837;
                        }
                    }
                } else {
                    if (input[1] < 4.0) {
                        if (input[3] < 4.77) {
                            var63 = 0.0020411937;
                        } else {
                            var63 = 0.009515773;
                        }
                    } else {
                        if (input[2] < 4.0) {
                            var63 = -0.00078172685;
                        } else {
                            var63 = 0.015408327;
                        }
                    }
                }
            }
        }
        return var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12 + var13 + var14 + var15 + var16 + var17 + var18 + var19 + var20 + var21 + var22 + var23 + var24 + var25 + var26 + var27 + var28 + var29 + var30 + var31 + var32 + var33 + var34 + var35 + var36 + var37 + var38 + var39 + var40 + var41 + var42 + var43 + var44 + var45 + var46 + var47 + var48 + var49 + var50 + var51 + var52 + var53 + var54 + var55 + var56 + var57 + var58 + var59 + var60 + var61 + var62 + var63;
    }
}
