package defpackage;

import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lَۛۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10581l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f21493l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f21494l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f21495l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f21496l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f21497l;

    public AbstractC10581l() {
        super(0);
        C16076l c16076l = VKXApplication.f36632l;
        this.f21496l = AbstractC8020l.smaato((c16076l == null ? null : c16076l).f31521l.amazon);
        C16076l c16076l2 = VKXApplication.f36632l;
        this.f21497l = AbstractC8020l.smaato((c16076l2 == null ? null : c16076l2).purchase());
        C16076l c16076l3 = VKXApplication.f36632l;
        C10507l c10507lCrashlytics = (c16076l3 == null ? null : c16076l3).crashlytics();
        this.f21495l = AbstractC8020l.smaato(c10507lCrashlytics != null ? c10507lCrashlytics.loadAd : null);
        C16076l c16076l4 = VKXApplication.f36632l;
        c16076l4 = c16076l4 == null ? null : c16076l4;
        c16076l4.getClass();
        this.f21494l = AbstractC8020l.smaato((C1100l) c16076l4.admob(new C18606l(c16076l4, 13)));
        C16076l c16076l5 = VKXApplication.f36632l;
        C16076l c16076l6 = c16076l5 != null ? c16076l5 : null;
        c16076l6.getClass();
        Boolean bool = (Boolean) c16076l6.admob(new C18606l(c16076l6, 20));
        bool.booleanValue();
        this.f21493l = AbstractC8020l.smaato(bool);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final EnumC11447l m2931abstract() {
        return (EnumC11447l) this.f21497l.getValue();
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final InterfaceC17817l m2932import() {
        return (InterfaceC17817l) this.f21496l.getValue();
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final AbstractC18643l m2933instanceof() {
        return (AbstractC18643l) this.f21495l.getValue();
    }

    @Override // defpackage.AbstractC17777l
    public void premium() {
        InterfaceC14029l interfaceC14029l = null;
        int i = 0;
        C5165l c5165l = new C5165l(this, interfaceC14029l, i);
        C8490l c8490l = AbstractC6025l.yandex;
        C8084l c8084l = AbstractC6025l.loadAd;
        int i2 = 29;
        int i3 = 2;
        C2347l c2347l = new C2347l(new C13900l(c8084l, 28), new C9181l(c5165l, interfaceC14029l, i2), i3);
        C5268l c5268l = this.f34614l;
        EnumC8981l enumC8981l = EnumC8981l.f18524l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        int i4 = 1;
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C13900l(c8084l, i2), new C6637l(new C5165l(this, interfaceC14029l, i4), null), i3), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        int i5 = 3;
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, i), new C6637l(new C5165l(this, interfaceC14029l, i3), interfaceC14029l, i5), i3), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, i4), new C6637l(new C5165l(this, interfaceC14029l, i5), interfaceC14029l, 5), i3), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
    }
}
