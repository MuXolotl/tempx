package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: lَؑٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0364l implements InterfaceC9760l, InterfaceC18325l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2672l f1431l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C7819l f1432l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13177l f1433l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC7042l f1434l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC6475l f1435l;

    public C0364l(C13177l c13177l, C7819l c7819l, C2672l c2672l, AbstractC6475l abstractC6475l, InterfaceC7042l interfaceC7042l) {
        this.f1433l = c13177l;
        this.f1432l = c7819l;
        this.f1431l = c2672l;
        this.f1435l = abstractC6475l;
        this.f1434l = interfaceC7042l;
    }

    public final void amazon() {
        this.f1434l.ads(null);
        C2672l c2672l = this.f1431l;
        boolean z = c2672l instanceof InterfaceC1711l;
        AbstractC6475l abstractC6475l = this.f1435l;
        if (z && abstractC6475l != null) {
            abstractC6475l.loadAd(c2672l);
        }
        if (abstractC6475l != null) {
            abstractC6475l.loadAd(this);
        }
    }

    @Override // defpackage.InterfaceC9760l
    public final void loadAd() {
        C2672l c2672l = this.f1431l;
        if (c2672l.f5804l.isAttachedToWindow()) {
            return;
        }
        ViewOnAttachStateChangeListenerC5635l viewOnAttachStateChangeListenerC5635lYandex = AbstractC7477l.yandex(c2672l.f5804l);
        C0364l c0364l = viewOnAttachStateChangeListenerC5635lYandex.f11990l;
        if (c0364l != null) {
            c0364l.amazon();
        }
        viewOnAttachStateChangeListenerC5635lYandex.f11990l = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // defpackage.InterfaceC18325l
    public final void onDestroy(InterfaceC3177l interfaceC3177l) {
        AbstractC7477l.yandex(this.f1431l.f5804l).yandex();
    }

    @Override // defpackage.InterfaceC9760l
    public final void start() {
        AbstractC6475l abstractC6475l = this.f1435l;
        if (abstractC6475l != null) {
            abstractC6475l.yandex(this);
        }
        C2672l c2672l = this.f1431l;
        if ((c2672l instanceof InterfaceC1711l) && abstractC6475l != null) {
            C2672l c2672l2 = c2672l;
            abstractC6475l.loadAd(c2672l2);
            abstractC6475l.yandex(c2672l2);
        }
        ViewOnAttachStateChangeListenerC5635l viewOnAttachStateChangeListenerC5635lYandex = AbstractC7477l.yandex(c2672l.f5804l);
        C0364l c0364l = viewOnAttachStateChangeListenerC5635lYandex.f11990l;
        if (c0364l != null) {
            c0364l.amazon();
        }
        viewOnAttachStateChangeListenerC5635lYandex.f11990l = this;
    }

    @Override // defpackage.InterfaceC9760l
    public final Object yandex(C9039l c9039l) throws Throwable {
        AbstractC6475l abstractC6475l = this.f1435l;
        if (abstractC6475l == null) {
            return Unit.INSTANCE;
        }
        Object objAmazon = AbstractC15344l.amazon(abstractC6475l, c9039l);
        return objAmazon == EnumC9342l.f19165l ? objAmazon : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC9760l
    public final /* synthetic */ void crashlytics() {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void mopub() {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onPause(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onResume(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onStart(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onStop(InterfaceC3177l interfaceC3177l) {
    }
}
