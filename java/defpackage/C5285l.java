package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؗۦُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5285l implements InterfaceC18325l, InterfaceC9760l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f11402l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f11403l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11404l;

    public /* synthetic */ C5285l(Object obj, Object obj2, int i) {
        this.f11404l = i;
        this.f11403l = obj;
        this.f11402l = obj2;
    }

    @Override // defpackage.InterfaceC9760l
    public void crashlytics() {
        ((AbstractC6475l) this.f11403l).loadAd(this);
    }

    @Override // defpackage.InterfaceC18325l
    public final void mopub() {
        switch (this.f11404l) {
            case 0:
                ((InterfaceC11947l) this.f11403l).onCreate();
                break;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onDestroy(InterfaceC3177l interfaceC3177l) {
        int i = this.f11404l;
        Object obj = this.f11402l;
        switch (i) {
            case 0:
                ((InterfaceC11947l) this.f11403l).onDestroy();
                ((C12242l) obj).invoke();
                break;
            default:
                ((InterfaceC7042l) obj).ads(null);
                break;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onPause(InterfaceC3177l interfaceC3177l) {
        switch (this.f11404l) {
            case 0:
                ((InterfaceC11947l) this.f11403l).purchase();
                break;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onResume(InterfaceC3177l interfaceC3177l) {
        switch (this.f11404l) {
            case 0:
                ((InterfaceC11947l) this.f11403l).amazon();
                break;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onStart(InterfaceC3177l interfaceC3177l) {
        switch (this.f11404l) {
            case 0:
                ((InterfaceC11947l) this.f11403l).billing();
                break;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onStop(InterfaceC3177l interfaceC3177l) {
        switch (this.f11404l) {
            case 0:
                ((InterfaceC11947l) this.f11403l).loadAd();
                break;
        }
    }

    @Override // defpackage.InterfaceC9760l
    public void start() {
        ((AbstractC6475l) this.f11403l).yandex(this);
    }

    @Override // defpackage.InterfaceC9760l
    public Object yandex(C9039l c9039l) throws Throwable {
        Object objAmazon = AbstractC15344l.amazon((AbstractC6475l) this.f11403l, c9039l);
        return objAmazon == EnumC9342l.f19165l ? objAmazon : Unit.INSTANCE;
    }

    private final /* synthetic */ void amazon() {
    }

    @Override // defpackage.InterfaceC9760l
    public /* synthetic */ void loadAd() {
    }

    private final /* synthetic */ void admob(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void billing(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void purchase(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void subs(InterfaceC3177l interfaceC3177l) {
    }
}
