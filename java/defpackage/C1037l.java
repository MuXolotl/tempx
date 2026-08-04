package defpackage;

/* JADX INFO: renamed from: lٖؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1037l {
    public final /* synthetic */ int yandex;
    public static final C1037l loadAd = new C1037l(0);
    public static final C1037l crashlytics = new C1037l(1);
    public static final C1037l amazon = new C1037l(2);
    public static final C1037l purchase = new C1037l(3);
    public static final C1037l billing = new C1037l(4);
    public static final C1037l mopub = new C1037l(5);
    public static final C1037l admob = new C1037l(6);
    public static final C1037l subs = new C1037l(7);
    public static final C1037l isPro = new C1037l(8);
    public static final C1037l firebase = new C1037l(9);
    public static final C1037l smaato = new C1037l(10);
    public static final C1037l remoteconfig = new C1037l(11);
    public static final C1037l vip = new C1037l(12);
    public static final C1037l metrica = new C1037l(13);
    public static final C1037l startapp = new C1037l(14);

    public /* synthetic */ C1037l(int i) {
        this.yandex = i;
    }

    public final boolean yandex(int i) {
        switch (this.yandex) {
            case 0:
                return EnumC13207l.yandex(i) != null;
            case 1:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 2:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i == 0 || i == 1 || i == 2;
            case 4:
                return AbstractC15450l.purchase(i) != 0;
            case 5:
                return i == 0 || i == 1 || i == 2;
            case 6:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            case 7:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 8:
                return i == 0 || i == 1 || i == 2;
            case 9:
                return i == 0 || i == 1;
            case 10:
                return i == 1 || i == 2;
            case 11:
                return AbstractC9029l.amazon(i) != 0;
            case 12:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            case 13:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            default:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
        }
    }
}
