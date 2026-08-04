package defpackage;

import android.view.View;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙۦ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6889l {
    public static final double[][] yandex = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] loadAd = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] crashlytics = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] amazon = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    public static boolean admob(double d) {
        return 0.0d <= d && d <= 100.0d;
    }

    public static boolean amazon(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2) {
        if (!(interfaceC11661l2 instanceof C12113l) || !(interfaceC11661l instanceof InterfaceC4884l)) {
            return false;
        }
        C12113l c12113l = (C12113l) interfaceC11661l2;
        c12113l.mo1007finally().size();
        InterfaceC4884l interfaceC4884l = (InterfaceC4884l) interfaceC11661l;
        interfaceC4884l.mo1007finally().size();
        for (C8195l c8195l : AbstractC16901l.m4226l(interfaceC4884l.mo864l().mo1007finally(), c12113l.loadAd().mo1007finally())) {
            if ((subs((InterfaceC4884l) interfaceC11661l2, (C17538l) c8195l.f17098l) instanceof C4285l) != (subs(interfaceC4884l, (C17538l) c8195l.f17097l) instanceof C4285l)) {
                return true;
            }
        }
        return false;
    }

    public static double billing(double[] dArr) {
        double[] dArrIsPro = AbstractC9151l.isPro(dArr, yandex);
        double dCrashlytics = crashlytics(dArrIsPro[0]);
        double dCrashlytics2 = crashlytics(dArrIsPro[1]);
        double dCrashlytics3 = crashlytics(dArrIsPro[2]);
        return Math.atan2(((dCrashlytics + dCrashlytics2) - (dCrashlytics3 * 2.0d)) / 9.0d, ((((-12.0d) * dCrashlytics2) + (dCrashlytics * 11.0d)) + dCrashlytics3) / 11.0d);
    }

    public static double crashlytics(double d) {
        int i;
        double dPow = Math.pow(Math.abs(d), 0.42d);
        if (d < 0.0d) {
            i = -1;
        } else {
            i = d == 0.0d ? 0 : 1;
        }
        return ((((double) i) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0323  */
    /* JADX WARN: Code duplicated, block: B:103:0x032f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0333  */
    /* JADX WARN: Code duplicated, block: B:107:0x034a  */
    /* JADX WARN: Code duplicated, block: B:116:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:117:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0213  */
    /* JADX WARN: Code duplicated, block: B:58:0x021f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0222  */
    /* JADX WARN: Code duplicated, block: B:62:0x0228  */
    /* JADX WARN: Code duplicated, block: B:64:0x022c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0231  */
    /* JADX WARN: Code duplicated, block: B:68:0x0241  */
    /* JADX WARN: Code duplicated, block: B:70:0x0252  */
    /* JADX WARN: Code duplicated, block: B:71:0x0260  */
    /* JADX WARN: Code duplicated, block: B:73:0x0266  */
    /* JADX WARN: Code duplicated, block: B:75:0x0276  */
    /* JADX WARN: Code duplicated, block: B:76:0x0285  */
    /* JADX WARN: Code duplicated, block: B:77:0x0293  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:80:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:84:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:86:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:90:0x02df  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e6 A[PHI: r1 r2 r7 r14
  0x02e6: PHI (r1v18 double[]) = (r1v5 double[]), (r1v20 double[]), (r1v5 double[]) binds: [B:82:0x02c1, B:95:0x02fb, B:89:0x02dd] A[DONT_GENERATE, DONT_INLINE]
  0x02e6: PHI (r2v19 double) = (r2v5 double), (r2v21 double), (r2v5 double) binds: [B:82:0x02c1, B:95:0x02fb, B:89:0x02dd] A[DONT_GENERATE, DONT_INLINE]
  0x02e6: PHI (r7v17 boolean) = (r7v3 boolean), (r7v19 boolean), (r7v3 boolean) binds: [B:82:0x02c1, B:95:0x02fb, B:89:0x02dd] A[DONT_GENERATE, DONT_INLINE]
  0x02e6: PHI (r14v12 double) = (r14v7 double), (r14v15 double), (r14v7 double) binds: [B:82:0x02c1, B:95:0x02fb, B:89:0x02dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02fb  */
    public static int firebase(double d, double d2, double d3) {
        int iLoadAd;
        int iLoadAd2;
        int i;
        int iLoadAd3;
        double[] dArr;
        double d4;
        double[] dArr2;
        double d5;
        double d6;
        boolean z;
        int i2;
        boolean z2;
        double[] dArr3;
        double dBilling;
        double[] dArr4;
        int i3;
        double d7;
        double d8;
        int iCeil;
        double dFloor;
        int i4;
        int i5;
        int iFloor;
        double[] dArr5;
        double dBilling2;
        boolean zYandex;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double[] dArr6;
        double d16;
        double[] dArr7;
        double d17;
        double dBilling3;
        double d18;
        double d19;
        double d20;
        double d21 = d % 360.0d;
        if (d21 < 0.0d) {
            d21 += 360.0d;
        }
        if (d2 < 1.0E-4d || d3 < 1.0E-4d || d3 > 99.9999d) {
            iLoadAd = AbstractC2533l.loadAd(AbstractC2533l.billing(d3)) & 255;
            iLoadAd2 = (iLoadAd << 16) | (-16777216) | (iLoadAd << 8);
        } else {
            double d22 = (d21 / 180.0d) * 3.141592653589793d;
            double d23 = (d3 + 16.0d) / 116.0d;
            double d24 = d23 * d23 * d23;
            if (d24 <= 0.008856451679035631d) {
                d24 = ((116.0d * d23) - 16.0d) / 903.2962962962963d;
            }
            double d25 = d24 * 100.0d;
            double dSqrt = Math.sqrt(d25) * 11.0d;
            C10472l c10472l = C10472l.firebase;
            double d26 = 1.0d;
            double dPow = 1.0d / Math.pow(1.64d - Math.pow(0.29d, c10472l.yandex), 0.73d);
            double dCos = (Math.cos(d22 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * c10472l.billing * c10472l.amazon;
            double dSin = Math.sin(d22);
            double dCos2 = Math.cos(d22);
            int i6 = 0;
            while (true) {
                double d27 = d26;
                double[] dArr8 = crashlytics;
                int i7 = 8;
                int i8 = 1;
                if (i6 < 5) {
                    i = 2;
                    double d28 = dSqrt / 100.0d;
                    double d29 = dPow;
                    double dPow2 = Math.pow(((d2 == 0.0d || dSqrt == 0.0d) ? 0.0d : d2 / Math.sqrt(d28)) * dPow, 1.1111111111111112d);
                    double dPow3 = (Math.pow(d28, (d27 / c10472l.purchase) / c10472l.isPro) * c10472l.loadAd) / c10472l.crashlytics;
                    double d30 = (((0.305d + dPow3) * 23.0d) * dPow2) / (((108.0d * dPow2) * dSin) + (((11.0d * dPow2) * dCos2) + (23.0d * dCos)));
                    double d31 = d30 * dCos2;
                    double d32 = d30 * dSin;
                    double d33 = dPow3 * 460.0d;
                    double[] dArrIsPro = AbstractC9151l.isPro(new double[]{mopub(((288.0d * d32) + ((451.0d * d31) + d33)) / 1403.0d), mopub(((d33 - (891.0d * d31)) - (261.0d * d32)) / 1403.0d), mopub(((d33 - (d31 * 220.0d)) - (d32 * 6300.0d)) / 1403.0d)}, loadAd);
                    double d34 = dArrIsPro[0];
                    if (d34 >= 0.0d) {
                        double d35 = dArrIsPro[1];
                        if (d35 >= 0.0d) {
                            double d36 = dArrIsPro[2];
                            if (d36 >= 0.0d) {
                                double d37 = (dArr8[2] * d36) + (dArr8[1] * d35) + (dArr8[0] * d34);
                                if (d37 > 0.0d) {
                                    if (i6 != 4) {
                                        double d38 = d37 - d25;
                                        if (Math.abs(d38) >= 0.002d) {
                                            dSqrt -= (d38 * dSqrt) / (d37 * 2.0d);
                                            i6++;
                                            d26 = d27;
                                            dPow = d29;
                                        }
                                    }
                                    double d39 = dArrIsPro[0];
                                    if (d39 <= 100.01d && dArrIsPro[1] <= 100.01d && dArrIsPro[2] <= 100.01d) {
                                        iLoadAd3 = (AbstractC2533l.loadAd(dArrIsPro[2]) & 255) | ((AbstractC2533l.loadAd(d39) & 255) << 16) | (-16777216) | ((AbstractC2533l.loadAd(dArrIsPro[1]) & 255) << 8);
                                    }
                                    if (iLoadAd3 != 0) {
                                        return iLoadAd3;
                                    }
                                    dArr = new double[3];
                                    d4 = -1.0d;
                                    dArr[0] = -1.0d;
                                    dArr[1] = -1.0d;
                                    dArr[i] = -1.0d;
                                    dArr2 = dArr;
                                    d5 = 0.0d;
                                    d6 = 0.0d;
                                    z = false;
                                    i2 = 0;
                                    z2 = true;
                                    while (i2 < 12) {
                                        d10 = dArr8[0];
                                        d11 = dArr8[i8];
                                        d12 = dArr8[i];
                                        if (i2 % 4 <= i8) {
                                            d13 = 0.0d;
                                        } else {
                                            d13 = 100.0d;
                                        }
                                        if (i2 % 2 == 0) {
                                            d14 = 0.0d;
                                        } else {
                                            d14 = 100.0d;
                                        }
                                        if (i2 < 4) {
                                            d20 = ((d25 - (d11 * d13)) - (d12 * d14)) / d10;
                                            if (admob(d20)) {
                                                d15 = d4;
                                                dArr7 = new double[3];
                                                dArr7[0] = d20;
                                                dArr7[1] = d13;
                                                dArr7[i] = d14;
                                            } else {
                                                d15 = d4;
                                                dArr7 = new double[3];
                                                dArr7[0] = d15;
                                                dArr7[1] = d15;
                                                dArr7[i] = d15;
                                            }
                                            dArr6 = dArr2;
                                        } else {
                                            d15 = d4;
                                            if (i2 < i7) {
                                                d17 = ((d25 - (d10 * d14)) - (d12 * d13)) / d11;
                                                if (admob(d17)) {
                                                    dArr6 = dArr2;
                                                    double[] dArr9 = new double[3];
                                                    dArr9[0] = d14;
                                                    dArr9[1] = d17;
                                                    dArr9[i] = d13;
                                                    dArr7 = dArr9;
                                                } else {
                                                    dArr6 = dArr2;
                                                    dArr7 = new double[3];
                                                    dArr7[0] = d15;
                                                    dArr7[1] = d15;
                                                    dArr7[i] = d15;
                                                }
                                            } else {
                                                dArr6 = dArr2;
                                                d16 = ((d25 - (d10 * d13)) - (d11 * d14)) / d12;
                                                if (admob(d16)) {
                                                    double[] dArr10 = new double[3];
                                                    dArr10[0] = d13;
                                                    dArr10[1] = d14;
                                                    dArr10[i] = d16;
                                                    dArr7 = dArr10;
                                                } else {
                                                    dArr7 = new double[3];
                                                    dArr7[0] = d15;
                                                    dArr7[1] = d15;
                                                    dArr7[i] = d15;
                                                }
                                            }
                                        }
                                        if (dArr7[0] < 0.0d) {
                                            dArr2 = dArr6;
                                        } else {
                                            dBilling3 = billing(dArr7);
                                            if (!z) {
                                                dArr2 = dArr7;
                                                dArr = dArr2;
                                                d5 = dBilling3;
                                                d6 = d5;
                                                z = true;
                                            } else if (!z2 || yandex(d5, dBilling3, d6)) {
                                                d18 = d22;
                                                d19 = d5;
                                                d5 = d19;
                                                d22 = d18;
                                                if (yandex(d19, d18, dBilling3)) {
                                                    dArr2 = dArr7;
                                                    d6 = dBilling3;
                                                    z2 = false;
                                                } else {
                                                    dArr = dArr7;
                                                    d5 = dBilling3;
                                                    z2 = false;
                                                    dArr2 = dArr6;
                                                }
                                            } else {
                                                dArr2 = dArr6;
                                            }
                                        }
                                        i2++;
                                        d4 = d15;
                                        i7 = 8;
                                        i8 = 1;
                                    }
                                    double[][] dArr11 = new double[i][];
                                    dArr11[0] = dArr;
                                    dArr11[1] = dArr2;
                                    dArr3 = dArr11[0];
                                    dBilling = billing(dArr3);
                                    dArr4 = dArr11[1];
                                    i3 = 0;
                                    while (i3 < 3) {
                                        d7 = dArr3[i3];
                                        d8 = dArr4[i3];
                                        if (d7 != d8) {
                                            if (d7 < d8) {
                                                iCeil = (int) Math.floor(smaato(d7) - 0.5d);
                                                dFloor = Math.ceil(smaato(dArr4[i3]) - 0.5d);
                                            } else {
                                                iCeil = (int) Math.ceil(smaato(d7) - 0.5d);
                                                dFloor = Math.floor(smaato(dArr4[i3]) - 0.5d);
                                            }
                                            i4 = (int) dFloor;
                                            i5 = 0;
                                            while (i5 < 8 && Math.abs(i4 - iCeil) > 1) {
                                                iFloor = (int) Math.floor(((double) (iCeil + i4)) / 2.0d);
                                                double d40 = amazon[iFloor];
                                                double d41 = dArr3[i3];
                                                double d42 = (d40 - d41) / (dArr4[i3] - d41);
                                                double d43 = dArr3[0];
                                                double d44 = ((dArr4[0] - d43) * d42) + d43;
                                                double d45 = dArr3[1];
                                                double d46 = ((dArr4[1] - d45) * d42) + d45;
                                                double d47 = dArr3[2];
                                                dArr5 = new double[]{d44, d46, ((dArr4[2] - d47) * d42) + d47};
                                                dBilling2 = billing(dArr5);
                                                double d48 = d22;
                                                double d49 = dBilling;
                                                zYandex = yandex(d49, d48, dBilling2);
                                                d9 = d49;
                                                if (zYandex) {
                                                    i4 = iFloor;
                                                    dArr4 = dArr5;
                                                } else {
                                                    iCeil = iFloor;
                                                    dArr3 = dArr5;
                                                    d9 = dBilling2;
                                                }
                                                i5++;
                                                d22 = d48;
                                                dBilling = d9;
                                            }
                                        }
                                        i3++;
                                        d22 = d22;
                                        dBilling = dBilling;
                                    }
                                    double[] dArr12 = {(dArr3[0] + dArr4[0]) / 2.0d, (dArr3[1] + dArr4[1]) / 2.0d, (dArr3[2] + dArr4[2]) / 2.0d};
                                    iLoadAd2 = ((AbstractC2533l.loadAd(dArr12[0]) & 255) << 16) | (-16777216) | ((AbstractC2533l.loadAd(dArr12[1]) & 255) << 8);
                                    iLoadAd = AbstractC2533l.loadAd(dArr12[2]) & 255;
                                }
                            }
                        }
                    }
                } else {
                    i = 2;
                }
                iLoadAd3 = 0;
                if (iLoadAd3 != 0) {
                    return iLoadAd3;
                }
                dArr = new double[3];
                d4 = -1.0d;
                dArr[0] = -1.0d;
                dArr[1] = -1.0d;
                dArr[i] = -1.0d;
                dArr2 = dArr;
                d5 = 0.0d;
                d6 = 0.0d;
                z = false;
                i2 = 0;
                z2 = true;
                while (i2 < 12) {
                    d10 = dArr8[0];
                    d11 = dArr8[i8];
                    d12 = dArr8[i];
                    if (i2 % 4 <= i8) {
                        d13 = 0.0d;
                    } else {
                        d13 = 100.0d;
                    }
                    if (i2 % 2 == 0) {
                        d14 = 0.0d;
                    } else {
                        d14 = 100.0d;
                    }
                    if (i2 < 4) {
                        d20 = ((d25 - (d11 * d13)) - (d12 * d14)) / d10;
                        if (admob(d20)) {
                            d15 = d4;
                            dArr7 = new double[3];
                            dArr7[0] = d20;
                            dArr7[1] = d13;
                            dArr7[i] = d14;
                        } else {
                            d15 = d4;
                            dArr7 = new double[3];
                            dArr7[0] = d15;
                            dArr7[1] = d15;
                            dArr7[i] = d15;
                        }
                        dArr6 = dArr2;
                    } else {
                        d15 = d4;
                        if (i2 < i7) {
                            d17 = ((d25 - (d10 * d14)) - (d12 * d13)) / d11;
                            if (admob(d17)) {
                                dArr6 = dArr2;
                                double[] dArr13 = new double[3];
                                dArr13[0] = d14;
                                dArr13[1] = d17;
                                dArr13[i] = d13;
                                dArr7 = dArr13;
                            } else {
                                dArr6 = dArr2;
                                dArr7 = new double[3];
                                dArr7[0] = d15;
                                dArr7[1] = d15;
                                dArr7[i] = d15;
                            }
                        } else {
                            dArr6 = dArr2;
                            d16 = ((d25 - (d10 * d13)) - (d11 * d14)) / d12;
                            if (admob(d16)) {
                                double[] dArr14 = new double[3];
                                dArr14[0] = d13;
                                dArr14[1] = d14;
                                dArr14[i] = d16;
                                dArr7 = dArr14;
                            } else {
                                dArr7 = new double[3];
                                dArr7[0] = d15;
                                dArr7[1] = d15;
                                dArr7[i] = d15;
                            }
                        }
                    }
                    if (dArr7[0] < 0.0d) {
                        dArr2 = dArr6;
                    } else {
                        dBilling3 = billing(dArr7);
                        if (!z) {
                            dArr2 = dArr7;
                            dArr = dArr2;
                            d5 = dBilling3;
                            d6 = d5;
                            z = true;
                        } else if (z2) {
                            d18 = d22;
                            d19 = d5;
                            d5 = d19;
                            d22 = d18;
                            if (yandex(d19, d18, dBilling3)) {
                                dArr2 = dArr7;
                                d6 = dBilling3;
                                z2 = false;
                            } else {
                                dArr = dArr7;
                                d5 = dBilling3;
                                z2 = false;
                                dArr2 = dArr6;
                            }
                        } else {
                            d18 = d22;
                            d19 = d5;
                            d5 = d19;
                            d22 = d18;
                            if (yandex(d19, d18, dBilling3)) {
                                dArr2 = dArr7;
                                d6 = dBilling3;
                                z2 = false;
                            } else {
                                dArr = dArr7;
                                d5 = dBilling3;
                                z2 = false;
                                dArr2 = dArr6;
                            }
                        }
                    }
                    i2++;
                    d4 = d15;
                    i7 = 8;
                    i8 = 1;
                }
                double[][] dArr15 = new double[i][];
                dArr15[0] = dArr;
                dArr15[1] = dArr2;
                dArr3 = dArr15[0];
                dBilling = billing(dArr3);
                dArr4 = dArr15[1];
                i3 = 0;
                while (i3 < 3) {
                    d7 = dArr3[i3];
                    d8 = dArr4[i3];
                    if (d7 != d8) {
                        if (d7 < d8) {
                            iCeil = (int) Math.floor(smaato(d7) - 0.5d);
                            dFloor = Math.ceil(smaato(dArr4[i3]) - 0.5d);
                        } else {
                            iCeil = (int) Math.ceil(smaato(d7) - 0.5d);
                            dFloor = Math.floor(smaato(dArr4[i3]) - 0.5d);
                        }
                        i4 = (int) dFloor;
                        i5 = 0;
                        while (i5 < 8) {
                            iFloor = (int) Math.floor(((double) (iCeil + i4)) / 2.0d);
                            double d410 = amazon[iFloor];
                            double d411 = dArr3[i3];
                            double d412 = (d410 - d411) / (dArr4[i3] - d411);
                            double d413 = dArr3[0];
                            double d414 = ((dArr4[0] - d413) * d412) + d413;
                            double d415 = dArr3[1];
                            double d416 = ((dArr4[1] - d415) * d412) + d415;
                            double d417 = dArr3[2];
                            dArr5 = new double[]{d414, d416, ((dArr4[2] - d417) * d412) + d417};
                            dBilling2 = billing(dArr5);
                            double d418 = d22;
                            double d419 = dBilling;
                            zYandex = yandex(d419, d418, dBilling2);
                            d9 = d419;
                            if (zYandex) {
                                i4 = iFloor;
                                dArr4 = dArr5;
                            } else {
                                iCeil = iFloor;
                                dArr3 = dArr5;
                                d9 = dBilling2;
                            }
                            i5++;
                            d22 = d418;
                            dBilling = d9;
                        }
                    }
                    i3++;
                    d22 = d22;
                    dBilling = dBilling;
                }
                double[] dArr16 = {(dArr3[0] + dArr4[0]) / 2.0d, (dArr3[1] + dArr4[1]) / 2.0d, (dArr3[2] + dArr4[2]) / 2.0d};
                iLoadAd2 = ((AbstractC2533l.loadAd(dArr16[0]) & 255) << 16) | (-16777216) | ((AbstractC2533l.loadAd(dArr16[1]) & 255) << 8);
                iLoadAd = AbstractC2533l.loadAd(dArr16[2]) & 255;
            }
        }
        return iLoadAd | iLoadAd2;
    }

    public static final InterfaceC1388l isPro(InterfaceC1388l interfaceC1388l) {
        C2336l c2336l = AbstractC18202l.yandex;
        if (interfaceC1388l.equals(c2336l.loadAd(C4695l.class))) {
            return c2336l.loadAd(InterfaceC15393l.class);
        }
        if (interfaceC1388l.equals(c2336l.loadAd(C15729l.class))) {
            return c2336l.loadAd(InterfaceC11616l.class);
        }
        if (interfaceC1388l.equals(c2336l.loadAd(InterfaceC11343l.class)) || interfaceC1388l.equals(c2336l.loadAd(C12555l.class)) || interfaceC1388l.equals(c2336l.loadAd(DynamicMutableRealmObject.class))) {
            return c2336l.loadAd(InterfaceC9671l.class);
        }
        return interfaceC1388l.equals(c2336l.loadAd(C14076l.class)) ? c2336l.loadAd(InterfaceC3327l.class) : interfaceC1388l;
    }

    public static C17873l loadAd(InterfaceC9573l interfaceC9573l, int i) {
        C17873l c17873l = new C17873l(interfaceC9573l, false, (i & 2) != 0 ? 0 : 1);
        c17873l.amazon.crashlytics(C17873l.purchase[0], true);
        c17873l.amazon();
        return c17873l;
    }

    public static double mopub(double d) {
        int i;
        double dAbs = Math.abs(d);
        double dMax = Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs));
        if (d < 0.0d) {
            i = -1;
        } else {
            i = d == 0.0d ? 0 : 1;
        }
        return Math.pow(dMax, 2.380952380952381d) * ((double) i);
    }

    public static final InterfaceC3177l purchase(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC3177l interfaceC3177l = tag instanceof InterfaceC3177l ? (InterfaceC3177l) tag : null;
            if (interfaceC3177l != null) {
                return interfaceC3177l;
            }
            Object objBilling = AbstractC6710l.billing(view);
            view = objBilling instanceof View ? (View) objBilling : null;
        }
        return null;
    }

    public static double smaato(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        if (defpackage.AbstractC3759l.mopub(r0).equals(defpackage.AbstractC3759l.mopub(r1)) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.AbstractC3050l subs(defpackage.InterfaceC4884l r5, defpackage.C17538l r6) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6889l.subs(lؗٔٝ, lٗۥ٘):lؔۦٛ");
    }

    public static boolean yandex(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }
}
