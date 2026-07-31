package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌَٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10271l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f20906l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f20907l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12015l f20908l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20909l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ float f20910l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f20911l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ boolean f20912l;

    public C10271l(boolean z, C12015l c12015l, int i, InterfaceC8714l interfaceC8714l, float f, boolean z2, InterfaceC8714l interfaceC8714l2) {
        this.f20909l = z;
        this.f20908l = c12015l;
        this.f20906l = i;
        this.f20911l = interfaceC8714l;
        this.f20910l = f;
        this.f20912l = z2;
        this.f20907l = interfaceC8714l2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((C18583l) obj).yandex;
        if (!this.f20909l) {
            return Boolean.FALSE;
        }
        int iPurchase = AbstractC16422l.purchase(keyEvent);
        boolean z = false;
        if (iPurchase == 2) {
            C12015l c12015l = this.f20908l;
            float f = c12015l.yandex;
            float f2 = c12015l.loadAd;
            float fAbs = Math.abs(f2 - f);
            int i = this.f20906l;
            int i2 = i > 0 ? i + 1 : 100;
            float f3 = fAbs / i2;
            long jYandex = AbstractC0593l.yandex(keyEvent.getKeyCode());
            boolean zYandex = AbstractC5072l.yandex(jYandex, AbstractC5072l.amazon);
            float f4 = this.f20910l;
            InterfaceC8714l interfaceC8714l = this.f20911l;
            if (zYandex) {
                ((Function1) interfaceC8714l.getValue()).invoke(AbstractC8576l.admob(Float.valueOf(f4 + f3), c12015l));
            } else if (AbstractC5072l.yandex(jYandex, AbstractC5072l.purchase)) {
                ((Function1) interfaceC8714l.getValue()).invoke(AbstractC8576l.admob(Float.valueOf(f4 - f3), c12015l));
            } else {
                boolean zYandex2 = AbstractC5072l.yandex(jYandex, AbstractC5072l.mopub);
                boolean z2 = this.f20912l;
                if (zYandex2) {
                    ((Function1) interfaceC8714l.getValue()).invoke(AbstractC8576l.admob(Float.valueOf(((z2 ? -1 : 1) * f3) + f4), c12015l));
                } else if (AbstractC5072l.yandex(jYandex, AbstractC5072l.billing)) {
                    ((Function1) interfaceC8714l.getValue()).invoke(AbstractC8576l.admob(Float.valueOf(f4 - ((z2 ? -1 : 1) * f3)), c12015l));
                } else if (AbstractC5072l.yandex(jYandex, AbstractC5072l.license)) {
                    ((Function1) interfaceC8714l.getValue()).invoke(Float.valueOf(f));
                } else if (AbstractC5072l.yandex(jYandex, AbstractC5072l.pro)) {
                    ((Function1) interfaceC8714l.getValue()).invoke(Float.valueOf(f2));
                } else if (AbstractC5072l.yandex(jYandex, AbstractC5072l.applovin)) {
                    ((Function1) interfaceC8714l.getValue()).invoke(AbstractC8576l.admob(Float.valueOf(f4 - (AbstractC8576l.purchase(i2 / 10, 1, 10) * f3)), c12015l));
                } else if (AbstractC5072l.yandex(jYandex, AbstractC5072l.appmetrica)) {
                    ((Function1) interfaceC8714l.getValue()).invoke(AbstractC8576l.admob(Float.valueOf((AbstractC8576l.purchase(i2 / 10, 1, 10) * f3) + f4), c12015l));
                }
            }
            z = true;
        } else if (iPurchase == 1) {
            long jYandex2 = AbstractC0593l.yandex(keyEvent.getKeyCode());
            if (AbstractC5072l.yandex(jYandex2, AbstractC5072l.amazon) || AbstractC5072l.yandex(jYandex2, AbstractC5072l.purchase) || AbstractC5072l.yandex(jYandex2, AbstractC5072l.mopub) || AbstractC5072l.yandex(jYandex2, AbstractC5072l.billing) || AbstractC5072l.yandex(jYandex2, AbstractC5072l.license) || AbstractC5072l.yandex(jYandex2, AbstractC5072l.pro) || AbstractC5072l.yandex(jYandex2, AbstractC5072l.applovin) || AbstractC5072l.yandex(jYandex2, AbstractC5072l.appmetrica)) {
                Function0 function0 = (Function0) this.f20907l.getValue();
                if (function0 != null) {
                    function0.invoke();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
