package defpackage;

/* JADX INFO: renamed from: lًٍٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16289l implements InterfaceC17896l {
    public static final C9782l admob;
    public static final C9782l firebase;
    public static final C9782l isPro;
    public static final C9782l mopub;
    public static final C15780l remoteconfig;
    public static final C15780l smaato;
    public static final C9782l subs;
    public static final C9782l vip;
    public final C7263l loadAd;
    public final InterfaceC7233l yandex;
    public static final C9782l crashlytics = new C9782l(2);
    public static final C9782l amazon = new C9782l(3);
    public static final C9782l purchase = new C9782l(4);
    public static final C9782l billing = new C9782l(5);

    static {
        new C15780l(2);
        mopub = new C9782l(6);
        admob = new C9782l(7);
        subs = new C9782l(8);
        isPro = new C9782l(9);
        firebase = new C9782l(0);
        smaato = new C15780l(0);
        remoteconfig = new C15780l(1);
        vip = new C9782l(1);
    }

    public C16289l(InterfaceC7233l interfaceC7233l) {
        C7263l c7263l = new C7263l(interfaceC7233l);
        this.yandex = interfaceC7233l;
        this.loadAd = c7263l;
    }

    @Override // defpackage.InterfaceC17896l
    public final void crashlytics(String str, C6344l c6344l) throws C2584l {
        if (((C5390l) c6344l.f13307l) != null) {
            throw C2584l.yandex(this.yandex.loadAd(), 22, null);
        }
        if (((C3930l) c6344l.f13309l) == null) {
            c6344l.f13309l = new C3930l();
        }
        this.loadAd.crashlytics(str, c6344l);
    }
}
