package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lِْۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12221l extends AbstractC11801l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final List f24277l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final Map f24278l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f24279l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f24280l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f24281l;

    static {
        Map mapRemoteconfig = AbstractC8676l.remoteconfig(new C8195l("en", "English"), new C8195l("uk", "Українська"), new C8195l("ru", "Русский"));
        f24278l = mapRemoteconfig;
        f24277l = AbstractC8676l.ads(mapRemoteconfig);
    }

    public C12221l() {
        super(0);
        this.f24280l = AbstractC11990l.loadAd();
        String strAmazon = AbstractC16358l.amazon();
        this.f24281l = AbstractC8020l.smaato(strAmazon);
        this.f24279l = AbstractC8020l.smaato(strAmazon);
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-1069631463);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1628191275, new C9772l(c13072lYandex, this, 12), c6956l), null, null, AbstractC14566l.amazon(-865023054, new C1182l(this, b, b), c6956l), 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1485480938, new C7442l(c13072lYandex, this, 21), c6956l), c6956l, 805330992, 237);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1182l(this, i);
        }
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f24280l.f36440l;
    }
}
