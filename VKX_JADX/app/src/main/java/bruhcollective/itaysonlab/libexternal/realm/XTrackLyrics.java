package bruhcollective.itaysonlab.libexternal.realm;

import defpackage.AbstractC0593l;
import defpackage.AbstractC10340l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15011l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC6710l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC8676l;
import defpackage.AbstractC9029l;
import defpackage.AbstractC9795l;
import defpackage.C0717l;
import defpackage.C1332l;
import defpackage.C17012l;
import defpackage.C17810l;
import defpackage.C18725l;
import defpackage.C2330l;
import defpackage.C2336l;
import defpackage.C2782l;
import defpackage.C3585l;
import defpackage.C3971l;
import defpackage.C4272l;
import defpackage.C6071l;
import defpackage.C7507l;
import defpackage.C8195l;
import defpackage.C8339l;
import defpackage.InterfaceC13226l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC2463l;
import defpackage.InterfaceC2851l;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lbruhcollective/itaysonlab/libexternal/realm/XTrackLyrics;", "Llؚٕۗ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class XTrackLyrics implements InterfaceC7457l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C6071l f495l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final int f496l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final String f497l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final InterfaceC1388l f498l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Map f499l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C1332l f500l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f502l = "";

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f501l = "";

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libexternal/realm/XTrackLyrics$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return XTrackLyrics.f496l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            return new XTrackLyrics();
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return XTrackLyrics.f499l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return XTrackLyrics.f498l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            return XTrackLyrics.f495l;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            return new C3971l(new C7507l("XTrackLyrics", "id", 2L, 0L, AbstractC10340l.crashlytics(), 0), AbstractC14055l.remoteconfig(AbstractC0593l.loadAd("id", 3, 1, null, "", false, true, false), AbstractC0593l.loadAd("content", 3, 1, null, "", false, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return XTrackLyrics.f497l;
        }
    }

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        f498l = c2336l.loadAd(XTrackLyrics.class);
        f497l = "XTrackLyrics";
        f499l = AbstractC8676l.remoteconfig(new C8195l("id", new C8195l(c2336l.loadAd(String.class), C17810l.f34742l)), new C8195l("content", new C8195l(c2336l.loadAd(String.class), C17012l.f33145l)));
        f495l = C6071l.f12845l;
        f496l = 1;
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF500l() {
        return this.f500l;
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f500l = c1332l;
    }

    public final void crashlytics(String str) {
        C1332l c1332l = this.f500l;
        if (c1332l == null) {
            this.f501l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("content").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
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

    public final String loadAd() {
        C1332l c1332l = this.f500l;
        if (c1332l == null) {
            return this.f502l;
        }
        long j = c1332l.crashlytics("id").amazon;
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
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final void purchase(String str) {
        C1332l c1332l = this.f500l;
        if (c1332l == null) {
            this.f502l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("id").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
        c3585lRemoteconfig.tapsense();
    }

    public final String toString() {
        return C2782l.ad(this);
    }

    public final String yandex() {
        C1332l c1332l = this.f500l;
        if (c1332l == null) {
            return this.f501l;
        }
        long j = c1332l.crashlytics("content").amazon;
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
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }
}
