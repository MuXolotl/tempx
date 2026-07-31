package ua.itaysonlab.vkxreborn.cache.realm;

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
import defpackage.C16356l;
import defpackage.C17544l;
import defpackage.C18725l;
import defpackage.C2330l;
import defpackage.C2336l;
import defpackage.C2782l;
import defpackage.C3585l;
import defpackage.C3795l;
import defpackage.C3971l;
import defpackage.C4272l;
import defpackage.C5256l;
import defpackage.C7507l;
import defpackage.C8195l;
import defpackage.C8339l;
import defpackage.InterfaceC13166l;
import defpackage.InterfaceC13226l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC2463l;
import defpackage.InterfaceC2851l;
import defpackage.InterfaceC9671l;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/NewCachedPodcastInfo;", "Llؘْٙ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class NewCachedPodcastInfo implements InterfaceC13166l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final String f36817l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Map f36818l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final int f36819l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final InterfaceC1388l f36820l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f36821l = "";

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f36822l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f36823l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C1332l f36824l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f36825l;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/NewCachedPodcastInfo$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return NewCachedPodcastInfo.f36819l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            return new NewCachedPodcastInfo();
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return NewCachedPodcastInfo.f36818l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return NewCachedPodcastInfo.f36820l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            Companion companion = NewCachedPodcastInfo.INSTANCE;
            return null;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            return new C3971l(new C7507l("NewCachedPodcastInfo", "", 4L, 0L, AbstractC10340l.crashlytics(), 1), AbstractC14055l.remoteconfig(AbstractC0593l.loadAd("plays", 1, 1, null, "", false, false, false), AbstractC0593l.loadAd("isFavorite", 2, 1, null, "", false, false, false), AbstractC0593l.loadAd("description", 3, 1, null, "", false, false, false), AbstractC0593l.loadAd("position", 1, 1, null, "", false, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return NewCachedPodcastInfo.f36817l;
        }
    }

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        f36820l = c2336l.loadAd(NewCachedPodcastInfo.class);
        f36817l = "NewCachedPodcastInfo";
        Class cls = Integer.TYPE;
        f36818l = AbstractC8676l.remoteconfig(new C8195l("plays", new C8195l(c2336l.loadAd(cls), C17544l.f34164l)), new C8195l("isFavorite", new C8195l(c2336l.loadAd(Boolean.TYPE), C3795l.f7892l)), new C8195l("description", new C8195l(c2336l.loadAd(String.class), C16356l.f31985l)), new C8195l("position", new C8195l(c2336l.loadAd(cls), C5256l.f11339l)));
        f36819l = 2;
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF36677l() {
        return this.f36824l;
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f36824l = c1332l;
    }

    public final void billing(String str) {
        C1332l c1332l = this.f36824l;
        if (c1332l == null) {
            this.f36821l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("description").amazon;
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

    public final int crashlytics() {
        C1332l c1332l = this.f36824l;
        if (c1332l == null) {
            return this.f36825l;
        }
        long j = c1332l.crashlytics("position").amazon;
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
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void isPro(int i) {
        C1332l c1332l = this.f36824l;
        if (c1332l == null) {
            this.f36823l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("plays").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final int loadAd() {
        C1332l c1332l = this.f36824l;
        if (c1332l == null) {
            return this.f36823l;
        }
        long j = c1332l.crashlytics("plays").amazon;
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
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
    }

    public final boolean purchase() {
        C1332l c1332l = this.f36824l;
        if (c1332l == null) {
            return this.f36822l;
        }
        long j = c1332l.crashlytics("isFavorite").amazon;
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
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void remoteconfig(int i) {
        C1332l c1332l = this.f36824l;
        if (c1332l == null) {
            this.f36825l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("position").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void subs(boolean z) {
        C1332l c1332l = this.f36824l;
        if (c1332l == null) {
            this.f36822l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isFavorite").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final String toString() {
        return C2782l.ad(this);
    }

    public final String yandex() {
        C1332l c1332l = this.f36824l;
        if (c1332l == null) {
            return this.f36821l;
        }
        long j = c1332l.crashlytics("description").amazon;
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
