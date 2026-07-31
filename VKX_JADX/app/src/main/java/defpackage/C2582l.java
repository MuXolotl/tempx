package defpackage;

import android.media.MediaDrmException;
import android.util.Size;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lّؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2582l implements InterfaceC6553l, InterfaceC9407l, InterfaceC11893l, InterfaceC10315l, InterfaceC9765l, InterfaceC15244l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5628l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C2582l f5623l = new C2582l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C2582l f5620l = new C2582l(17);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C2582l f5625l = new C2582l(18);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C2582l f5624l = new C2582l(19);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C2582l f5627l = new C2582l(20);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C2582l f5621l = new C2582l(21);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C2582l f5622l = new C2582l(22);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C2582l f5626l = new C2582l(23);

    public C2582l() {
        this.f5628l = 9;
        String str = C16412l.amazon;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    public static C2483l Signature(int i, Size size, C7179l c7179l, int i2, int i3, EnumC18632l enumC18632l) {
        LinkedHashMap linkedHashMap = c7179l.billing;
        EnumC13290l enumC13290l = (EnumC13290l) C2483l.admob.get(Integer.valueOf(i));
        if (enumC13290l == null) {
            enumC13290l = EnumC13290l.f26074l;
        }
        EnumC7005l enumC7005l = EnumC7005l.NOT_SUPPORT;
        Size size2 = AbstractC5513l.yandex;
        int height = size.getHeight() * size.getWidth();
        if (i2 == 1) {
            if (height <= AbstractC5513l.yandex((Size) c7179l.loadAd.get(Integer.valueOf(i)))) {
                enumC7005l = EnumC7005l.S720P_16_9;
            } else if (height <= AbstractC5513l.yandex((Size) c7179l.amazon.get(Integer.valueOf(i)))) {
                enumC7005l = EnumC7005l.S1440P_4_3;
            }
        } else if (i3 == 1) {
            Size size3 = (Size) linkedHashMap.get(Integer.valueOf(i));
            for (EnumC7005l enumC7005l2 : C2483l.billing) {
                if (size.equals(enumC7005l2.f14693l)) {
                    enumC7005l = enumC7005l2;
                    break;
                }
            }
            if (enumC7005l == EnumC7005l.NOT_SUPPORT && size.equals(size3)) {
                enumC7005l = EnumC7005l.MAXIMUM;
            }
        } else if (height <= AbstractC5513l.yandex(c7179l.yandex)) {
            enumC7005l = EnumC7005l.VGA;
        } else if (height <= AbstractC5513l.yandex(c7179l.crashlytics)) {
            enumC7005l = EnumC7005l.PREVIEW;
        } else {
            Size size4 = c7179l.purchase;
            if (height <= size4.getHeight() * size4.getWidth()) {
                enumC7005l = EnumC7005l.RECORD;
            } else {
                Size size5 = (Size) linkedHashMap.get(Integer.valueOf(i));
                Size size6 = (Size) c7179l.subs.get(Integer.valueOf(i));
                if (size5 != null) {
                    if (height <= size5.getHeight() * size5.getWidth()) {
                        if (i2 != 2) {
                            enumC7005l = EnumC7005l.MAXIMUM;
                        } else if (size6 != null) {
                            if (height <= size6.getHeight() * size6.getWidth()) {
                                enumC7005l = EnumC7005l.ULTRA_MAXIMUM;
                            }
                        }
                    } else if (size6 != null) {
                        if (height <= size6.getHeight() * size6.getWidth()) {
                            enumC7005l = EnumC7005l.ULTRA_MAXIMUM;
                        }
                    }
                } else if (i2 != 2) {
                    enumC7005l = EnumC7005l.MAXIMUM;
                } else if (size6 != null) {
                    if (height <= size6.getHeight() * size6.getWidth()) {
                        enumC7005l = EnumC7005l.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new C2483l(enumC13290l, enumC7005l, enumC18632l);
    }

    public static final InterfaceC9971l license(long j, Object obj) {
        InterfaceC9971l interfaceC9971l = (InterfaceC9971l) AbstractC1823l.subs(j, obj);
        if (((AbstractC1277l) interfaceC9971l).f3328l) {
            return interfaceC9971l;
        }
        int size = interfaceC9971l.size();
        InterfaceC9971l interfaceC9971lLicense = interfaceC9971l.license(size == 0 ? 10 : size + size);
        AbstractC1823l.isPro(j, obj, interfaceC9971lLicense);
        return interfaceC9971lLicense;
    }

    public static C2483l tapsense(EnumC13290l enumC13290l, EnumC7005l enumC7005l) {
        EnumC18632l enumC18632l = C2483l.purchase;
        return new C2483l(enumC13290l, enumC7005l, C2483l.purchase);
    }

    @Override // defpackage.InterfaceC6553l
    public int adcel() {
        return 1;
    }

    @Override // defpackage.InterfaceC6553l
    public byte[] admob() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.InterfaceC6553l
    public C11102l amazon(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC10315l
    public Object billing(Object obj) {
        List list = (List) obj;
        return new C0574l(((Integer) list.get(0)).intValue(), (String) list.get(1), (String) list.get(2), AbstractC2296l.loadAd(((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue()), AbstractC2296l.loadAd(((Integer) list.get(5)).intValue(), ((Integer) list.get(6)).intValue()), ((Long) list.get(7)).longValue(), false, 64);
    }

    @Override // defpackage.InterfaceC6553l
    public C1441l crashlytics() {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC9407l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public void mo1228extends(InterfaceC0207l interfaceC0207l) {
        if (interfaceC0207l == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    @Override // defpackage.InterfaceC6553l
    public void firebase(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC11893l
    public AbstractC4350l isPro(InterfaceC1388l interfaceC1388l, C3806l c3806l) {
        return mopub(((InterfaceC13937l) interfaceC1388l).mo1730private(), c3806l);
    }

    @Override // defpackage.InterfaceC6553l
    public void metrica(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC11893l
    public AbstractC4350l mopub(Class cls, C3806l c3806l) {
        return purchase(cls);
    }

    @Override // defpackage.InterfaceC11893l
    public AbstractC4350l purchase(Class cls) {
        return new C7966l(true);
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        return new C2187l(c11644l.mo619l(C17334l.class));
    }

    @Override // defpackage.InterfaceC6553l
    public C3584l startapp(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC10315l
    public Object subs(C15543l c15543l, Object obj) {
        C0574l c0574l = (C0574l) obj;
        Integer numValueOf = Integer.valueOf(c0574l.yandex);
        String str = c0574l.loadAd;
        String str2 = c0574l.crashlytics;
        long j = c0574l.amazon;
        int i = C12814l.crashlytics;
        Integer numValueOf2 = Integer.valueOf((int) (j >> 32));
        Integer numValueOf3 = Integer.valueOf((int) (j & 4294967295L));
        long j2 = c0574l.purchase;
        return AbstractC14055l.remoteconfig(numValueOf, str, str2, numValueOf2, numValueOf3, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (4294967295L & j2)), Long.valueOf(c0574l.billing));
    }

    @Override // defpackage.InterfaceC6553l
    public boolean subscription(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    public String toString() {
        switch (this.f5628l) {
            case 5:
                return "REMOVE_FROZEN";
            case 10:
                return AbstractC16648l.ads(new byte[]{51, 48, 53, 57, 51, 48, 49, 51, 48, 54, 48, 55, 50, 65, 56, 54, 52, 56, 67, 69, 51, 68, 48, 50, 48, 49, 48, 54, 48, 56, 50, 65, 56, 54, 52, 56, 67, 69, 51, 68, 48, 51, 48, 49, 48, 55, 48, 51, 52, 50, 48, 48, 48, 52, 55, 55, 52, 49, 51, 65, 69, 50, 56, 66, 68, 49, 68, 67, 65, 56, 67, 65, 68, 48, 67, 65, 69, 57, 67, 48, 48, 69, 68, 50, 53, 66, 48, 54, 66, 54, 55, 50, 52, 53, 69, 67, 49, 53, 57, 53, 70, 55, 56, 52, 56, 48, 57, 70, 56, 56, 53, 55, 52, 70, 56, 69, 50, 70, 55, 53, 57, 57, 68, 56, 48, 69, 68, 52, 49, 69, 70, 70, 56, 57, 70, 52, 55, 49, 54, 66, 69, 55, 52, 55, 68, 65, 56, 67, 67, 48, 70, 51, 68, 51, 50, 65, 48, 50, 68, 53, 50, 65, 66, 69, 54, 70, 49, 66, 65, 48, 56, 49, 53, 65, 54, 50, 65, 49, 69, 53, 66, 50});
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC6553l
    public byte[] vip(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC6553l
    public Map yandex(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f5628l) {
            case 16:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(3600000L, 1, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.sgtm.upload.backoff_http_codes", 45, "404,429,503,504").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(3600000L, 79, "measurement.upload.window_interval").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list4 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(4L, 17, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
            case 20:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(604800000L, 61, "measurement.sdk.attribution.cache.ttl").get();
            case 21:
                List list6 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(16L, 54, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            case 22:
                List list7 = AbstractC5981l.yandex;
                return (Boolean) C17766l.yandex.get();
            default:
                List list8 = AbstractC5981l.yandex;
                C2156l.f4791l.get();
                return (Boolean) C18242l.yandex.yandex("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true, 4).get();
        }
    }

    public /* synthetic */ C2582l(int i) {
        this.f5628l = i;
    }

    public C2582l(C9731l c9731l) {
        this.f5628l = 3;
    }

    @Override // defpackage.InterfaceC6553l
    public void release() {
    }

    @Override // defpackage.InterfaceC6553l
    public void loadAd(C7972l c7972l) {
    }

    @Override // defpackage.InterfaceC6553l
    public void smaato(byte[] bArr) {
    }

    @Override // defpackage.InterfaceC6553l
    public /* synthetic */ void ads(byte[] bArr, C17849l c17849l) {
    }

    @Override // defpackage.InterfaceC9407l
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public void mo1227continue(InterfaceC17477l interfaceC17477l, ArrayList arrayList) {
    }
}
