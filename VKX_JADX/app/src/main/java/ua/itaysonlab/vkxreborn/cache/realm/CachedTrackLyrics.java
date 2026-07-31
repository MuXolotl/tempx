package ua.itaysonlab.vkxreborn.cache.realm;

import defpackage.AbstractC0593l;
import defpackage.AbstractC10340l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC15011l;
import defpackage.AbstractC15684l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC5293l;
import defpackage.AbstractC6710l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC8676l;
import defpackage.AbstractC9795l;
import defpackage.C10070l;
import defpackage.C12466l;
import defpackage.C1332l;
import defpackage.C13423l;
import defpackage.C18725l;
import defpackage.C2336l;
import defpackage.C2782l;
import defpackage.C3971l;
import defpackage.C7507l;
import defpackage.C8195l;
import defpackage.InterfaceC11334l;
import defpackage.InterfaceC13166l;
import defpackage.InterfaceC13226l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC2463l;
import defpackage.InterfaceC2851l;
import defpackage.InterfaceC3327l;
import defpackage.InterfaceC9671l;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrackLyrics;", "Llؘْٙ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CachedTrackLyrics implements InterfaceC13166l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Map f36792l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final int f36793l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final InterfaceC1388l f36794l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final String f36795l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC11334l f36796l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f36797l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f36798l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C1332l f36799l;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrackLyrics$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return CachedTrackLyrics.f36793l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            CachedTrackLyrics cachedTrackLyrics = new CachedTrackLyrics();
            cachedTrackLyrics.f36798l = "";
            cachedTrackLyrics.f36797l = "";
            cachedTrackLyrics.f36796l = AbstractC15684l.purchase(new CachedTrackLyricsSynchronizedLine[0]);
            return cachedTrackLyrics;
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return CachedTrackLyrics.f36792l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return CachedTrackLyrics.f36794l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            Companion companion = CachedTrackLyrics.INSTANCE;
            return null;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            return new C3971l(new C7507l("CachedTrackLyrics", "", 3L, 0L, AbstractC10340l.crashlytics(), 1), AbstractC14055l.remoteconfig(AbstractC0593l.loadAd("credits", 3, 1, null, "", false, false, false), AbstractC0593l.loadAd("plainLyrics", 3, 1, null, "", false, false, false), AbstractC0593l.loadAd("synchronizedLyrics", 9, 2, AbstractC18202l.yandex.loadAd(CachedTrackLyricsSynchronizedLine.class), "", false, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return CachedTrackLyrics.f36795l;
        }
    }

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        f36794l = c2336l.loadAd(CachedTrackLyrics.class);
        f36795l = "CachedTrackLyrics";
        f36792l = AbstractC8676l.remoteconfig(new C8195l("credits", new C8195l(c2336l.loadAd(String.class), C12466l.f24598l)), new C8195l("plainLyrics", new C8195l(c2336l.loadAd(String.class), C13423l.f26335l)), new C8195l("synchronizedLyrics", new C8195l(c2336l.loadAd(CachedTrackLyricsSynchronizedLine.class), C10070l.f20548l)));
        f36793l = 2;
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF3035l() {
        return this.f36799l;
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f36799l = c1332l;
    }

    public final InterfaceC11334l crashlytics() {
        C1332l c1332l = this.f36799l;
        if (c1332l == null) {
            return this.f36796l;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(CachedTrackLyricsSynchronizedLine.class);
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(interfaceC1388lLoadAd);
        int i = 2;
        if (interfaceC13226lYandex != null) {
            i = interfaceC13226lYandex.amazon() == 2 ? 4 : 3;
        } else if (!interfaceC1388lLoadAd.equals(c2336l.loadAd(InterfaceC3327l.class))) {
            i = 1;
        }
        return C2782l.license(c1332l, c1332l.crashlytics("synchronizedLyrics"), interfaceC1388lLoadAd, i, false, false);
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
        C1332l c1332l = this.f36799l;
        if (c1332l == null) {
            return this.f36797l;
        }
        long j = c1332l.crashlytics("plainLyrics").amazon;
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

    public final String toString() {
        return C2782l.ad(this);
    }

    public final String yandex() {
        C1332l c1332l = this.f36799l;
        if (c1332l == null) {
            return this.f36798l;
        }
        long j = c1332l.crashlytics("credits").amazon;
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
