package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٌؒٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0928l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f2605l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f2606l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2607l;

    public /* synthetic */ C0928l(long j, Object obj, int i) {
        this.f2607l = i;
        this.f2606l = j;
        this.f2605l = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f2607l;
        long j = this.f2606l;
        Object obj2 = this.f2605l;
        switch (i) {
            case 0:
                C7136l c7136l = (C7136l) obj2;
                c7136l.admob(C5177l.crashlytics(((C5177l) ((C5616l) obj).amazon()).yandex, j));
                c7136l.crashlytics.invoke();
                break;
            case 1:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                float fMo868instanceof = interfaceC13349l.mo868instanceof(8.0f);
                float fFloatValue = ((Number) ((InterfaceC12244l) obj2).getValue()).floatValue();
                long j2 = this.f2606l;
                AbstractC9361l.adcel(interfaceC13349l, C9735l.loadAd(0.12f, j2), 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fMo868instanceof)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMo868instanceof)) << 32), null, 242);
                AbstractC9361l.adcel(interfaceC13349l, j2, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) * fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fMo868instanceof)) << 32) | (((long) Float.floatToRawIntBits(fMo868instanceof)) & 4294967295L), null, 242);
                break;
            case 2:
                AbstractC9361l.metrica((InterfaceC13349l) obj, this.f2606l, 0L, 0L, AbstractC8576l.amazon(((Number) ((Function0) obj2).invoke()).floatValue(), 0.0f, 1.0f), null, null, 0, 118);
                break;
            default:
                List list = (List) obj2;
                C3918l c3918l = (C3918l) obj;
                int i2 = 1;
                Object[] objArr = {Long.valueOf(j)};
                C2336l c2336l = AbstractC18202l.yandex;
                CachedLibrary cachedLibrary = (CachedLibrary) AbstractC11356l.loadAd(c3918l.m1449l(c2336l.loadAd(CachedLibrary.class), "uid == $0", Arrays.copyOf(objArr, 1)));
                if (cachedLibrary == null) {
                    cachedLibrary = new CachedLibrary();
                    cachedLibrary.crashlytics(j);
                }
                List listM4243this = AbstractC16901l.m4243this(c3918l.m1449l(c2336l.loadAd(CachedTrack.class), "uid IN $0", Arrays.copyOf(new Object[]{list}, 1)).crashlytics(), new C15705l(i2, list));
                C8994l c8994l = C8994l.yandex;
                c8994l.getClass();
                C8634l c8634l = C8994l.crashlytics;
                InterfaceC13922l interfaceC13922l = C8994l.loadAd[0];
                if (((Boolean) c8634l.pro(c8994l)).booleanValue()) {
                    cachedLibrary.yandex().addAll(0, listM4243this);
                } else {
                    cachedLibrary.yandex().addAll(listM4243this);
                }
                c3918l.m1450l(cachedLibrary);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0928l(Object obj, long j, int i) {
        this.f2607l = i;
        this.f2605l = obj;
        this.f2606l = j;
    }
}
