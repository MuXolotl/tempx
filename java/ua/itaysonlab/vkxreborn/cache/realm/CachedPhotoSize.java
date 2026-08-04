package ua.itaysonlab.vkxreborn.cache.realm;

import defpackage.AbstractC0593l;
import defpackage.AbstractC10340l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC15011l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC6710l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC8676l;
import defpackage.C0922l;
import defpackage.C1332l;
import defpackage.C1457l;
import defpackage.C2336l;
import defpackage.C2782l;
import defpackage.C3971l;
import defpackage.C6006l;
import defpackage.C6137l;
import defpackage.C7507l;
import defpackage.C8195l;
import defpackage.InterfaceC13226l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC2463l;
import defpackage.InterfaceC2851l;
import defpackage.InterfaceC7457l;
import defpackage.InterfaceC9671l;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPhotoSize;", "Llؚٕۗ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CachedPhotoSize implements InterfaceC7457l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final String f36698l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Map f36699l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final int f36700l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final InterfaceC1388l f36701l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f36702l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f36703l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f36704l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C1332l f36705l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f36706l;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPhotoSize$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return CachedPhotoSize.f36700l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            CachedPhotoSize cachedPhotoSize = new CachedPhotoSize();
            cachedPhotoSize.f36702l = "";
            return cachedPhotoSize;
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return CachedPhotoSize.f36699l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return CachedPhotoSize.f36701l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            Companion companion = CachedPhotoSize.INSTANCE;
            return null;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            return new C3971l(new C7507l("CachedPhotoSize", "", 4L, 0L, AbstractC10340l.crashlytics(), 0), AbstractC14055l.remoteconfig(AbstractC0593l.loadAd("width", 1, 1, null, "", false, false, false), AbstractC0593l.loadAd("height", 1, 1, null, "", false, false, false), AbstractC0593l.loadAd("url", 3, 1, null, "", false, false, false), AbstractC0593l.loadAd("type", 3, 1, null, "", true, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return CachedPhotoSize.f36698l;
        }
    }

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        f36701l = c2336l.loadAd(CachedPhotoSize.class);
        f36698l = "CachedPhotoSize";
        Class cls = Integer.TYPE;
        f36699l = AbstractC8676l.remoteconfig(new C8195l("width", new C8195l(c2336l.loadAd(cls), C6006l.f12749l)), new C8195l("height", new C8195l(c2336l.loadAd(cls), C1457l.f3640l)), new C8195l("url", new C8195l(c2336l.loadAd(String.class), C6137l.f12920l)), new C8195l("type", new C8195l(c2336l.loadAd(String.class), C0922l.f2602l)));
        f36700l = 1;
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF36807l() {
        return this.f36705l;
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f36705l = c1332l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj;
            if (AbstractC15011l.subs(interfaceC9671l) && AbstractC15011l.isPro(this) == AbstractC15011l.isPro(interfaceC9671l)) {
                return AbstractC8576l.yandex(AbstractC6710l.purchase(this), AbstractC6710l.purchase(interfaceC9671l));
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2782l.pro(this);
    }

    public final String toString() {
        return C2782l.ad(this);
    }
}
