package ua.itaysonlab.vkxreborn.cache.realm;

import defpackage.AbstractC0593l;
import defpackage.AbstractC10340l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15011l;
import defpackage.AbstractC15684l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC5293l;
import defpackage.AbstractC6710l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC8676l;
import defpackage.AbstractC9029l;
import defpackage.AbstractC9795l;
import defpackage.C0717l;
import defpackage.C1332l;
import defpackage.C16694l;
import defpackage.C18725l;
import defpackage.C2330l;
import defpackage.C2336l;
import defpackage.C2782l;
import defpackage.C3364l;
import defpackage.C3585l;
import defpackage.C3961l;
import defpackage.C3971l;
import defpackage.C4272l;
import defpackage.C7507l;
import defpackage.C8195l;
import defpackage.C8339l;
import defpackage.C8878l;
import defpackage.InterfaceC11334l;
import defpackage.InterfaceC13226l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC2463l;
import defpackage.InterfaceC2851l;
import defpackage.InterfaceC3327l;
import defpackage.InterfaceC7457l;
import defpackage.InterfaceC9671l;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPlaylistLibrary;", "Llؚٕۗ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CachedPlaylistLibrary implements InterfaceC7457l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C16694l f36744l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final int f36745l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final String f36746l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final InterfaceC1388l f36747l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Map f36748l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C1332l f36749l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC11334l f36750l = AbstractC15684l.purchase(new CachedPlaylist[0]);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f36751l;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPlaylistLibrary$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return CachedPlaylistLibrary.f36745l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            return new CachedPlaylistLibrary();
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return CachedPlaylistLibrary.f36748l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return CachedPlaylistLibrary.f36747l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            return CachedPlaylistLibrary.f36744l;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            return new C3971l(new C7507l("CachedPlaylistLibrary", "uid", 2L, 0L, AbstractC10340l.crashlytics(), 0), AbstractC14055l.remoteconfig(AbstractC0593l.loadAd("uid", 1, 1, null, "", false, true, false), AbstractC0593l.loadAd("playlists", 9, 2, AbstractC18202l.yandex.loadAd(CachedPlaylist.class), "", false, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return CachedPlaylistLibrary.f36746l;
        }
    }

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        f36747l = c2336l.loadAd(CachedPlaylistLibrary.class);
        f36746l = "CachedPlaylistLibrary";
        f36748l = AbstractC8676l.remoteconfig(new C8195l("uid", new C8195l(c2336l.loadAd(Long.TYPE), C3961l.f8143l)), new C8195l("playlists", new C8195l(c2336l.loadAd(CachedPlaylist.class), C8878l.f18245l)));
        f36744l = C16694l.f32715l;
        f36745l = 1;
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF36749l() {
        return this.f36749l;
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f36749l = c1332l;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[RETURN] */
    public final void crashlytics(InterfaceC11334l interfaceC11334l) {
        int i;
        int i2;
        C3364l c3364lLicense;
        long ptr$cinterop_release;
        long ptr$cinterop_release2;
        C1332l c1332l = this.f36749l;
        if (c1332l == null) {
            this.f36750l = interfaceC11334l;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(CachedPlaylist.class);
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(interfaceC1388lLoadAd);
        if (interfaceC13226lYandex == null) {
            if (interfaceC1388lLoadAd.equals(c2336l.loadAd(InterfaceC3327l.class))) {
                i2 = 2;
            } else {
                i = 1;
            }
            c3364lLicense = C2782l.license(c1332l, c1332l.crashlytics("playlists"), interfaceC1388lLoadAd, i2, false, false);
            if (interfaceC11334l instanceof C3364l) {
                LongPointerWrapper longPointerWrapper = c3364lLicense.f7163l;
                LongPointerWrapper longPointerWrapper2 = ((C3364l) interfaceC11334l).f7163l;
                ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                ptr$cinterop_release2 = longPointerWrapper2.getPtr$cinterop_release();
                int i3 = AbstractC9795l.yandex;
                if (realmcJNI.realm_equals(ptr$cinterop_release, ptr$cinterop_release2)) {
                    return;
                }
            }
            c3364lLicense.clear();
            c3364lLicense.f7162l.applovin(c3364lLicense.pro(), interfaceC11334l, 2, linkedHashMap);
        }
        i = interfaceC13226lYandex.amazon() == 2 ? 4 : 3;
        i2 = i;
        c3364lLicense = C2782l.license(c1332l, c1332l.crashlytics("playlists"), interfaceC1388lLoadAd, i2, false, false);
        if (interfaceC11334l instanceof C3364l) {
            LongPointerWrapper longPointerWrapper3 = c3364lLicense.f7163l;
            LongPointerWrapper longPointerWrapper4 = ((C3364l) interfaceC11334l).f7163l;
            ptr$cinterop_release = longPointerWrapper3.getPtr$cinterop_release();
            ptr$cinterop_release2 = longPointerWrapper4.getPtr$cinterop_release();
            int i4 = AbstractC9795l.yandex;
            if (realmcJNI.realm_equals(ptr$cinterop_release, ptr$cinterop_release2)) {
                return;
            }
        }
        c3364lLicense.clear();
        c3364lLicense.f7162l.applovin(c3364lLicense.pro(), interfaceC11334l, 2, linkedHashMap);
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

    public final long loadAd() {
        C1332l c1332l = this.f36749l;
        if (c1332l == null) {
            return this.f36751l;
        }
        long j = c1332l.crashlytics("uid").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void purchase(long j) {
        C1332l c1332l = this.f36749l;
        if (c1332l == null) {
            this.f36751l = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(j);
        c1332l.yandex();
        long j2 = c1332l.crashlytics("uid").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j2, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final String toString() {
        return C2782l.ad(this);
    }

    public final InterfaceC11334l yandex() {
        C1332l c1332l = this.f36749l;
        if (c1332l == null) {
            return this.f36750l;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(CachedPlaylist.class);
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(interfaceC1388lLoadAd);
        int i = 2;
        if (interfaceC13226lYandex != null) {
            i = interfaceC13226lYandex.amazon() == 2 ? 4 : 3;
        } else if (!interfaceC1388lLoadAd.equals(c2336l.loadAd(InterfaceC3327l.class))) {
            i = 1;
        }
        return C2782l.license(c1332l, c1332l.crashlytics("playlists"), interfaceC1388lLoadAd, i, false, false);
    }
}
