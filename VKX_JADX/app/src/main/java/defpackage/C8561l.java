package defpackage;

/* JADX INFO: renamed from: lٌؘؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8561l implements InterfaceC11947l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f17648l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f17649l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17650l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f17651l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f17652l;

    public C8561l(C8256l c8256l, EnumC2771l enumC2771l, C7062l c7062l, C13663l c13663l) {
        this.f17649l = c8256l;
        this.f17648l = enumC2771l;
        this.f17652l = c7062l;
        this.f17651l = c13663l;
    }

    @Override // defpackage.InterfaceC11947l
    public final void amazon() {
        switch (this.f17650l) {
            case 0:
                break;
            default:
                if (((EnumC2771l) this.f17648l) == EnumC2771l.f6020l) {
                    ((C7062l) this.f17652l).invoke();
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void billing() {
        switch (this.f17650l) {
            case 0:
                break;
            default:
                if (((EnumC2771l) this.f17648l) == EnumC2771l.f6021l) {
                    ((C7062l) this.f17652l).invoke();
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void loadAd() {
        switch (this.f17650l) {
            case 0:
                break;
            default:
                if (((EnumC2771l) this.f17648l) == EnumC2771l.f6021l) {
                    ((C13663l) this.f17651l).invoke();
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void onCreate() {
        switch (this.f17650l) {
            case 0:
                break;
            default:
                if (((EnumC2771l) this.f17648l) == EnumC2771l.f6017l) {
                    ((C7062l) this.f17652l).invoke();
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void onDestroy() {
        int i = this.f17650l;
        Object obj = this.f17649l;
        Object obj2 = this.f17651l;
        Object obj3 = this.f17648l;
        switch (i) {
            case 0:
                ((InterfaceC12356l) obj).crashlytics((C8633l) obj3);
                ((C17326l) obj2).crashlytics((C8633l) this.f17652l);
                break;
            default:
                if (((EnumC2771l) obj3) == EnumC2771l.f6017l) {
                    ((C13663l) obj2).invoke();
                }
                ((C8256l) obj).invoke();
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void purchase() {
        switch (this.f17650l) {
            case 0:
                break;
            default:
                if (((EnumC2771l) this.f17648l) == EnumC2771l.f6020l) {
                    ((C13663l) this.f17651l).invoke();
                }
                break;
        }
    }

    public C8561l(InterfaceC12356l interfaceC12356l, C8633l c8633l, C17326l c17326l, C8633l c8633l2) {
        this.f17649l = interfaceC12356l;
        this.f17648l = c8633l;
        this.f17651l = c17326l;
        this.f17652l = c8633l2;
    }

    private final void admob() {
    }

    private final void crashlytics() {
    }

    private final void mopub() {
    }

    private final void subs() {
    }

    private final void yandex() {
    }
}
