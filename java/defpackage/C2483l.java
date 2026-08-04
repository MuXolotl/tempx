package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًٟؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2483l {
    public static final LinkedHashMap admob;
    public static final Map mopub;
    public final int amazon;
    public final EnumC18632l crashlytics;
    public final EnumC7005l loadAd;
    public final EnumC13290l yandex;
    public static final EnumC18632l purchase = EnumC18632l.DEFAULT;
    public static final EnumC7005l[] billing = {EnumC7005l.S720P_16_9, EnumC7005l.S1080P_4_3, EnumC7005l.S1080P_16_9, EnumC7005l.S1440P_16_9, EnumC7005l.UHD, EnumC7005l.X_VGA};

    static {
        Map mapRemoteconfig = AbstractC8676l.remoteconfig(new C8195l(EnumC13290l.f26073l, 35), new C8195l(EnumC13290l.f26072l, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES)), new C8195l(EnumC13290l.f26076l, 4101), new C8195l(EnumC13290l.f26075l, 32), new C8195l(EnumC13290l.f26074l, 34));
        mopub = mapRemoteconfig;
        Set<Map.Entry> setEntrySet = mapRemoteconfig.entrySet();
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(setEntrySet, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (EnumC13290l) entry.getKey());
        }
        admob = linkedHashMap;
    }

    public C2483l(EnumC13290l enumC13290l, EnumC7005l enumC7005l, EnumC18632l enumC18632l) {
        this.yandex = enumC13290l;
        this.loadAd = enumC7005l;
        this.crashlytics = enumC18632l;
        Integer num = (Integer) mopub.get(enumC13290l);
        this.amazon = num != null ? num.intValue() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2483l)) {
            return false;
        }
        C2483l c2483l = (C2483l) obj;
        return this.yandex == c2483l.yandex && this.loadAd == c2483l.loadAd && this.crashlytics == c2483l.crashlytics;
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.yandex + ", configSize=" + this.loadAd + ", streamUseCase=" + this.crashlytics + ')';
    }
}
