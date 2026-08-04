package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8583l extends AbstractC16111l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f17696l = 0;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public Function0 f17697l = new C6573l(29);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C8946l f17698l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final ArrayList f17699l;

    public C8583l(ArrayList arrayList, C8946l c8946l) {
        this.f17699l = arrayList;
        this.f17698l = c8946l;
    }

    public static final void advert(C8583l c8583l, C7933l c7933l) {
        C8206l c8206l;
        c8583l.getClass();
        C2757l c2757l = c7933l.loadAd;
        StringBuilder sb = new StringBuilder();
        sb.append((Object) String.valueOf(c2757l.crashlytics));
        sb.append('_');
        sb.append(c2757l.loadAd);
        String string = sb.toString();
        String str = c2757l.amazon;
        String str2 = c2757l.yandex;
        C12787l c12787l = c2757l.adcel;
        new C9174l(new C0383l(string, str, str2, (c12787l == null || (c8206l = c12787l.purchase) == null) ? null : c8206l.admob, c2757l.firebase)).Signature(c8583l.f5081l);
    }

    public final void ad(InterfaceC16088l interfaceC16088l, C6956l c6956l, int i) {
        c6956l.m2133new(949408498);
        int i2 = i | (c6956l.billing(interfaceC16088l) ? 4 : 2) | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC8714l interfaceC8714lPurchase = AbstractC9637l.purchase(((C10610l) interfaceC16088l).billing, c6956l, 0);
            AbstractC15497l.loadAd(null, null, AbstractC14566l.amazon(1176852855, new C3158l(interfaceC16088l, interfaceC8714lPurchase, 28), c6956l), null, null, 0, 0L, 0L, AbstractC10439l.yandex, AbstractC14566l.amazon(2125111745, new Cprotected(interfaceC16088l, this, interfaceC8714lPurchase, 27), c6956l), c6956l, 905970048, 251);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(this, interfaceC16088l, i, 29);
        }
    }

    @Override // defpackage.AbstractC16111l
    public final /* bridge */ /* synthetic */ void license(Object obj, C6956l c6956l) {
        ad((InterfaceC16088l) obj, c6956l, 0);
    }

    @Override // defpackage.AbstractC16111l
    public final Object pro(C16793l c16793l) {
        C10610l c10610l = new C10610l(this.f17699l, c16793l, new C8250l(17, this), new C10740l(17, this));
        this.f17697l = new C4936l(0, c10610l, C10610l.class, "onBackPressed", "onBackPressed()Z", 0, 0, 9);
        return c10610l;
    }

    @Override // defpackage.AbstractC2338l
    public final void subs() {
        if (((Boolean) this.f17697l.invoke()).booleanValue()) {
            return;
        }
        super.subs();
    }
}
