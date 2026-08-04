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
import defpackage.C18725l;
import defpackage.C2330l;
import defpackage.C2336l;
import defpackage.C2782l;
import defpackage.C3585l;
import defpackage.C3971l;
import defpackage.C4272l;
import defpackage.C5451l;
import defpackage.C7507l;
import defpackage.C7748l;
import defpackage.C8195l;
import defpackage.C8339l;
import defpackage.C9286l;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedLibrary;", "Llؚٕۗ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CachedLibrary implements InterfaceC7457l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C5451l f36690l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final int f36691l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final String f36692l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final InterfaceC1388l f36693l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Map f36694l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C1332l f36695l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC11334l f36696l = AbstractC15684l.purchase(new CachedTrack[0]);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f36697l;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedLibrary$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return CachedLibrary.f36691l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            return new CachedLibrary();
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return CachedLibrary.f36694l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return CachedLibrary.f36693l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            return CachedLibrary.f36690l;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            return new C3971l(new C7507l("CachedLibrary", "uid", 2L, 0L, AbstractC10340l.crashlytics(), 0), AbstractC14055l.remoteconfig(AbstractC0593l.loadAd("uid", 1, 1, null, "", false, true, false), AbstractC0593l.loadAd("tracks", 9, 2, AbstractC18202l.yandex.loadAd(CachedTrack.class), "", false, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return CachedLibrary.f36692l;
        }
    }

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        f36693l = c2336l.loadAd(CachedLibrary.class);
        f36692l = "CachedLibrary";
        f36694l = AbstractC8676l.remoteconfig(new C8195l("uid", new C8195l(c2336l.loadAd(Long.TYPE), C9286l.f19082l)), new C8195l("tracks", new C8195l(c2336l.loadAd(CachedTrack.class), C7748l.f16255l)));
        f36690l = C5451l.f11684l;
        f36691l = 1;
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF36695l() {
        return this.f36695l;
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f36695l = c1332l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void crashlytics(long j) {
        C1332l c1332l = this.f36695l;
        if (c1332l == null) {
            this.f36697l = j;
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
        C1332l c1332l = this.f36695l;
        if (c1332l == null) {
            return this.f36697l;
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

    public final String toString() {
        return C2782l.ad(this);
    }

    public final InterfaceC11334l yandex() {
        C1332l c1332l = this.f36695l;
        if (c1332l == null) {
            return this.f36696l;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(CachedTrack.class);
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(interfaceC1388lLoadAd);
        int i = 2;
        if (interfaceC13226lYandex != null) {
            i = interfaceC13226lYandex.amazon() == 2 ? 4 : 3;
        } else if (!interfaceC1388lLoadAd.equals(c2336l.loadAd(InterfaceC3327l.class))) {
            i = 1;
        }
        return C2782l.license(c1332l, c1332l.crashlytics("tracks"), interfaceC1388lLoadAd, i, false, false);
    }
}
