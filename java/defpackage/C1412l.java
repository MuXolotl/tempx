package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.internal.objects.VKResponse;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؒۡۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1412l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f3582l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3583l;

    public /* synthetic */ C1412l(int i, Object obj) {
        this.f3583l = i;
        this.f3582l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x03be  */
    /* JADX WARN: Code duplicated, block: B:147:0x0412  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        C0534l c0534l;
        boolean z;
        long j;
        C13601l c13601l;
        C18449l c18449l;
        float f;
        float f2;
        long jM4551private;
        InterfaceC13349l interfaceC13349l;
        int i2 = this.f3583l;
        int i3 = 5;
        int i4 = 6;
        int i5 = 17;
        int i6 = 3;
        boolean z2 = false;
        int i7 = 1;
        Object obj2 = this.f3582l;
        switch (i2) {
            case 0:
                return obj == ((AbstractC7095l) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                C7090l c7090l = (C7090l) obj2;
                Map.Entry entry = (Map.Entry) obj;
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == c7090l ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != c7090l ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                C12236l c12236l = (C12236l) obj2;
                c12236l.f24294l.invoke((C18624l) obj, AbstractC13402l.loadAd(c12236l, AbstractC1242l.loadAd));
                return Unit.INSTANCE;
            case 3:
                AbstractC1213l.billing(((C9231l) obj2).f5081l, new C17398l((AudioPlaylist) obj));
                return Unit.INSTANCE;
            case 4:
                ((InterfaceC17593l) obj).amazon(AbstractC1848l.yandex, new C13620l(EnumC1826l.f4235l, ((InterfaceC7316l) obj2).yandex(), 2, true));
                return Unit.INSTANCE;
            case 5:
                ((C1336l) obj).firebase(EnumC6358l.f13324l.pro(), null, new C2911l(i6), new C15578l(802480018, true, new C5666l((C16553l) obj2, 0)));
                return Unit.INSTANCE;
            case 6:
                List list = ((AudioFollowingsUpdateInfo) obj2).crashlytics;
                ((C1336l) obj).firebase(list.size(), null, new Creturn(list, 7, false), new C15578l(802480018, true, new C7340l(1, list)));
                return Unit.INSTANCE;
            case 7:
                ((C9174l) obj2).ad().mo2753continue(!((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 8:
                ((C7721l) obj2).m2209this().mo2753continue(!((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 9:
                ((AbstractC5392l) obj2).f11555l.subs(((Number) ((C5616l) obj).amazon()).floatValue() % 1.0f);
                return Unit.INSTANCE;
            case 10:
                return (VKResponse) VKXApplication.f36629l.yandex(AbstractC15639l.mopub(VKResponse.class, AbstractC15639l.mopub(VKResponseWithItems.class, ((AbstractC8189l) obj2).yandex))).yandex((InterfaceC9473l) obj);
            case 11:
                return ((AbstractC7188l) obj2).yandex((InterfaceC9473l) obj);
            case 12:
                return (VKResponse) VKXApplication.f36629l.yandex(AbstractC15639l.mopub(VKResponse.class, ((C16534l) obj2).yandex)).yandex((InterfaceC9473l) obj);
            case 13:
                return new C9582l(i4, (C2769l) obj2);
            case 14:
                return new C9582l(8, (C15178l) obj2);
            case 15:
                C18572l c18572l = (C18572l) obj2;
                Rect rect = (Rect) obj;
                C9478l c9478l = c18572l.f36260l;
                boolean z3 = c18572l.f36259l;
                C14689l c14689l = c9478l.subs;
                Rect rect2 = c9478l.yandex;
                rect2.set(rect);
                final C6344l c6344l = c9478l.isPro;
                Rect rect3 = (Rect) c6344l.f13303l;
                if (!rect.isEmpty()) {
                    c6344l.f13305l = -1;
                    c6344l.f13306l = z3;
                    if (!Objects.equals(rect3, rect)) {
                        rect3.set(rect);
                        final int i8 = 0;
                        c6344l.f13308l = new C8924l(6000L, new InterfaceC0631l() { // from class: lٜ٘ۗ
                            @Override // defpackage.InterfaceC0631l
                            public final C17270l amazon(Float f3) {
                                float fHeight;
                                int i9 = i8;
                                float f4 = 10.0f;
                                C6344l c6344l2 = c6344l;
                                switch (i9) {
                                    case 0:
                                        Rect rect4 = (Rect) c6344l2.f13303l;
                                        if (rect4.isEmpty()) {
                                            C8339l.metrica("buildATrajectory Bounds is empty. Please check it");
                                            return null;
                                        }
                                        float fWidth = c6344l2.f13306l ? -(rect4.height() / 2.2f) : rect4.width() / 2.2f;
                                        int iWidth = c6344l2.f13306l ? rect4.width() : rect4.height();
                                        float interpolation = (((AbstractC0917l.yandex.getInterpolation(f3.floatValue()) * 6000.0f) / 1000.0f) + 1.5f) * 120.0f;
                                        PointF pointF = new PointF();
                                        pointF.x = (float) (Math.sin((((double) (interpolation / 2.0f)) * 3.141592653589793d) / 180.0d) * ((double) fWidth));
                                        pointF.y = (float) (Math.sin((((double) interpolation) * 3.141592653589793d) / 180.0d) * ((double) (-(iWidth / 10.0f))));
                                        return new C17270l(pointF);
                                    default:
                                        Rect rect5 = (Rect) c6344l2.f13303l;
                                        if (rect5.isEmpty()) {
                                            C8339l.metrica("buildBTrajectory Bounds is empty. Please check it");
                                            return null;
                                        }
                                        float fWidth2 = c6344l2.f13306l ? -(rect5.height() / 2.2f) : rect5.width() / 2.2f;
                                        if (c6344l2.f13306l) {
                                            fHeight = rect5.width();
                                        } else {
                                            fHeight = rect5.height();
                                            f4 = 20.0f;
                                        }
                                        float interpolation2 = (((AbstractC0917l.yandex.getInterpolation(f3.floatValue()) * 6000.0f) / 1000.0f) + 1.5f) * 120.0f;
                                        PointF pointF2 = new PointF();
                                        pointF2.x = (float) (Math.sin((((double) (interpolation2 / 2.0f)) * 3.141592653589793d) / 180.0d) * ((double) (-fWidth2)));
                                        pointF2.y = (float) (Math.sin((((double) interpolation2) * 3.141592653589793d) / 180.0d) * ((double) (fHeight / f4)));
                                        return new C17270l(pointF2);
                                }
                            }
                        });
                        final int i9 = 1;
                        c6344l.f13307l = new C8924l(6000L, new InterfaceC0631l() { // from class: lٜ٘ۗ
                            @Override // defpackage.InterfaceC0631l
                            public final C17270l amazon(Float f3) {
                                float fHeight;
                                int i10 = i9;
                                float f4 = 10.0f;
                                C6344l c6344l2 = c6344l;
                                switch (i10) {
                                    case 0:
                                        Rect rect4 = (Rect) c6344l2.f13303l;
                                        if (rect4.isEmpty()) {
                                            C8339l.metrica("buildATrajectory Bounds is empty. Please check it");
                                            return null;
                                        }
                                        float fWidth = c6344l2.f13306l ? -(rect4.height() / 2.2f) : rect4.width() / 2.2f;
                                        int iWidth = c6344l2.f13306l ? rect4.width() : rect4.height();
                                        float interpolation = (((AbstractC0917l.yandex.getInterpolation(f3.floatValue()) * 6000.0f) / 1000.0f) + 1.5f) * 120.0f;
                                        PointF pointF = new PointF();
                                        pointF.x = (float) (Math.sin((((double) (interpolation / 2.0f)) * 3.141592653589793d) / 180.0d) * ((double) fWidth));
                                        pointF.y = (float) (Math.sin((((double) interpolation) * 3.141592653589793d) / 180.0d) * ((double) (-(iWidth / 10.0f))));
                                        return new C17270l(pointF);
                                    default:
                                        Rect rect5 = (Rect) c6344l2.f13303l;
                                        if (rect5.isEmpty()) {
                                            C8339l.metrica("buildBTrajectory Bounds is empty. Please check it");
                                            return null;
                                        }
                                        float fWidth2 = c6344l2.f13306l ? -(rect5.height() / 2.2f) : rect5.width() / 2.2f;
                                        if (c6344l2.f13306l) {
                                            fHeight = rect5.width();
                                        } else {
                                            fHeight = rect5.height();
                                            f4 = 20.0f;
                                        }
                                        float interpolation2 = (((AbstractC0917l.yandex.getInterpolation(f3.floatValue()) * 6000.0f) / 1000.0f) + 1.5f) * 120.0f;
                                        PointF pointF2 = new PointF();
                                        pointF2.x = (float) (Math.sin((((double) (interpolation2 / 2.0f)) * 3.141592653589793d) / 180.0d) * ((double) (-fWidth2)));
                                        pointF2.y = (float) (Math.sin((((double) interpolation2) * 3.141592653589793d) / 180.0d) * ((double) (fHeight / f4)));
                                        return new C17270l(pointF2);
                                }
                            }
                        });
                    }
                    ((C11891l) c6344l.f13309l).invoke((C8924l) c6344l.f13308l, new C4748l(z3 ? 0.75f : 0.9f), rect, Boolean.valueOf(z3));
                    ((C11891l) c6344l.f13304l).invoke((C8924l) c6344l.f13307l, new C4748l(z3 ? 0.7f : 0.9f), rect, Boolean.valueOf(z3));
                }
                float size = ((C8924l) c6344l.f13308l).loadAd.size();
                int i10 = (int) ((0.1f * size) % size);
                c9478l.loadAd = i10;
                C17270l c17270l = (C17270l) ((C8924l) c6344l.f13308l).loadAd.get(i10);
                PointF pointF = ((C17270l) ((C8924l) c6344l.f13307l).loadAd.get(c9478l.loadAd)).yandex;
                float f3 = pointF.x;
                float f4 = pointF.y;
                PointF pointF2 = c17270l.yandex;
                float f5 = pointF2.x;
                float f6 = pointF2.y;
                int iWidth = rect2.width();
                int iHeight = rect2.height();
                boolean z4 = iWidth > iHeight;
                int i11 = z4 ? iHeight : iWidth;
                if (z4) {
                    float f7 = iWidth;
                    C13703l c13703l = c14689l.purchase;
                    C13703l c13703l2 = c14689l.amazon;
                    c13703l.amazon(f7 - (f4 * f7));
                    float f8 = iHeight;
                    c13703l.purchase(f8 - (f3 * f8));
                    c13703l2.amazon(f7 - (f6 * f7));
                    c13703l2.purchase(f8 * f5);
                    float f9 = i11;
                    c13703l2.subs.billing(Float.valueOf(1.7f * f9 * 0.5f));
                    c13703l.subs.billing(Float.valueOf(f9 * 2.5f * 0.5f));
                } else {
                    float f10 = iWidth;
                    C13703l c13703l3 = c14689l.purchase;
                    C13703l c13703l4 = c14689l.amazon;
                    c13703l3.amazon(f3 * f10);
                    float f11 = iHeight;
                    c13703l3.purchase(f11 - (f4 * f11));
                    c13703l4.amazon(f10 - (f5 * f10));
                    c13703l4.purchase(f11 - (f6 * f11));
                    float f12 = i11;
                    c13703l4.subs.billing(Float.valueOf(1.43f * f12 * 0.5f));
                    c13703l3.subs.billing(Float.valueOf(f12 * 2.3f * 0.5f));
                }
                c6344l.mopub(0.0f, c9478l.loadAd, c14689l);
                return Unit.INSTANCE;
            case 16:
                AbstractC15680l abstractC15680l = (AbstractC15680l) obj2;
                int iIntValue = ((Integer) obj).intValue();
                C11560l c11560l = abstractC15680l.f30818l;
                if (c11560l == null) {
                    c11560l = null;
                }
                if (iIntValue == c11560l.getCurrentItem()) {
                    Object obj3 = abstractC15680l.mo2201new().get(iIntValue);
                    AbstractC11519l abstractC11519l = obj3 instanceof AbstractC11519l ? (AbstractC11519l) obj3 : null;
                    if (abstractC11519l != null) {
                        abstractC11519l.pro();
                    }
                } else {
                    C11560l c11560l2 = abstractC15680l.f30818l;
                    (c11560l2 != null ? c11560l2 : null).setCurrentItem(iIntValue, true);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C12197l c12197l = (C12197l) obj2;
                C3366l c3366l = (C3366l) obj;
                if (c3366l.loadAd() * c12197l.f24244l < 0.0f || C14174l.purchase(c3366l.f7169l.admob()) <= 0.0f) {
                    return c3366l.yandex(new C10351l(i5));
                }
                final float fMin = Math.min(C14467l.loadAd(c12197l.f24244l, 0.0f) ? 1.0f : (float) Math.ceil(c3366l.loadAd() * c12197l.f24244l), (float) Math.ceil(C14174l.purchase(c3366l.f7169l.admob()) / 2.0f));
                final float f13 = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c3366l.f7169l.admob() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c3366l.f7169l.admob() & 4294967295L)) - fMin)) & 4294967295L);
                float f14 = fMin * 2.0f;
                boolean z5 = f14 > C14174l.purchase(c3366l.f7169l.admob());
                AbstractC15342l abstractC15342lYandex = c12197l.f24241l.yandex(c3366l.f7169l.admob(), c3366l.f7169l.getLayoutDirection(), c3366l);
                if (!(abstractC15342lYandex instanceof C13616l)) {
                    if (!(abstractC15342lYandex instanceof C18521l)) {
                        boolean z6 = z5;
                        if (!(abstractC15342lYandex instanceof C13080l)) {
                            C18725l.billing();
                            return null;
                        }
                        final C8990l c8990l = c12197l.f24242l;
                        if (z6) {
                            jFloatToRawIntBits = 0;
                        }
                        final long j2 = jFloatToRawIntBits;
                        if (z6) {
                            jFloatToRawIntBits2 = c3366l.f7169l.admob();
                        }
                        final long j3 = jFloatToRawIntBits2;
                        final AbstractC3239l c0404l = z6 ? C5053l.yandex : new C0404l(fMin, 0.0f, 0, 0, null, 30);
                        return c3366l.yandex(new Function1() { // from class: lؒٓؑ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                C6742l c6742l = (C6742l) obj4;
                                c6742l.yandex();
                                AbstractC9361l.vip(c6742l, c8990l, j2, j3, 0.0f, c0404l, null, 0, 104);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    final C8990l c8990l2 = c12197l.f24242l;
                    C3903l c3903l = ((C18521l) abstractC15342lYandex).amazon;
                    if (AbstractC8238l.purchase(c3903l)) {
                        final long j4 = c3903l.purchase;
                        final C0404l c0404l2 = new C0404l(fMin, 0.0f, 0, 0, null, 30);
                        final boolean z7 = z5;
                        return c3366l.yandex(new Function1() { // from class: lٜؑۖ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) throws Throwable {
                                long j5;
                                C6742l c6742l = (C6742l) obj4;
                                c6742l.yandex();
                                C13601l c13601l2 = c6742l.f14144l;
                                boolean z8 = z7;
                                AbstractC9544l abstractC9544l = c8990l2;
                                long j6 = j4;
                                if (z8) {
                                    AbstractC9361l.startapp(c6742l, abstractC9544l, 0L, 0L, j6, 0.0f, null, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                                    float f15 = f13;
                                    if (fIntBitsToFloat < f15) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c13601l2.f26629l.m4551private() >> 32));
                                        float f16 = fMin;
                                        float f17 = fIntBitsToFloat2 - f16;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c13601l2.f26629l.m4551private() & 4294967295L)) - f16;
                                        C18449l c18449l2 = c13601l2.f26629l;
                                        long jM4551private2 = c18449l2.m4551private();
                                        c18449l2.m4555synchronized().mopub();
                                        try {
                                            ((C16543l) c18449l2.f36010l).remoteconfig(f16, f16, f17, fIntBitsToFloat3, 0);
                                            j5 = jM4551private2;
                                            try {
                                                AbstractC9361l.startapp(c6742l, abstractC9544l, 0L, 0L, j6, 0.0f, null, null, 246);
                                                AbstractC0653l.license(c18449l2, j5);
                                            } catch (Throwable th) {
                                                th = th;
                                                AbstractC0653l.license(c18449l2, j5);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j5 = jM4551private2;
                                        }
                                    } else {
                                        AbstractC9361l.startapp(c6742l, abstractC9544l, jFloatToRawIntBits, jFloatToRawIntBits2, AbstractC17551l.smaato(f15, j6), 0.0f, c0404l2, null, 208);
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    boolean z8 = z5;
                    if (c12197l.f24243l == null) {
                        c12197l.f24243l = new C17844l();
                    }
                    C17844l c17844l = c12197l.f24243l;
                    C9902l c9902lYandex = c17844l.amazon;
                    if (c9902lYandex == null) {
                        c9902lYandex = AbstractC3478l.yandex();
                        c17844l.amazon = c9902lYandex;
                    }
                    c9902lYandex.admob();
                    AbstractC15560l.firebase(c9902lYandex, c3903l);
                    if (!z8) {
                        C9902l c9902lYandex2 = AbstractC3478l.yandex();
                        AbstractC15560l.firebase(c9902lYandex2, new C3903l(fMin, fMin, c3903l.loadAd() - fMin, c3903l.yandex() - fMin, AbstractC17551l.smaato(fMin, c3903l.purchase), AbstractC17551l.smaato(fMin, c3903l.billing), AbstractC17551l.smaato(fMin, c3903l.mopub), AbstractC17551l.smaato(fMin, c3903l.admob)));
                        c9902lYandex.mopub(c9902lYandex, c9902lYandex2, 0);
                    }
                    return c3366l.yandex(new C0464l(c9902lYandex, c8990l2, 19));
                }
                C8990l c8990l3 = c12197l.f24242l;
                C13616l c13616l = (C13616l) abstractC15342lYandex;
                C9902l c9902l = c13616l.amazon;
                if (z5) {
                    return c3366l.yandex(new C0464l(c13616l, c8990l3, 20));
                }
                if (AbstractC2812l.advert(c8990l3)) {
                    c0534l = new C0534l(C9735l.loadAd(1.0f, c8990l3.yandex), 5);
                    i = 1;
                } else {
                    i = 0;
                    c0534l = null;
                }
                C8896l c8896lAmazon = c9902l.amazon();
                float f15 = c8896lAmazon.loadAd;
                float f16 = c8896lAmazon.yandex;
                if (c12197l.f24243l == null) {
                    c12197l.f24243l = new C17844l();
                }
                C17844l c17844l2 = c12197l.f24243l;
                C9902l c9902lYandex3 = c17844l2.amazon;
                if (c9902lYandex3 == null) {
                    c9902lYandex3 = AbstractC3478l.yandex();
                    c17844l2.amazon = c9902lYandex3;
                }
                c9902lYandex3.admob();
                AbstractC15560l.isPro(c9902lYandex3, c8896lAmazon);
                c9902lYandex3.mopub(c9902lYandex3, c9902l, 0);
                C10700l c10700l = new C10700l();
                long jCeil = (((long) ((int) Math.ceil(c8896lAmazon.crashlytics - f16))) << 32) | (((long) ((int) Math.ceil(c8896lAmazon.amazon - f15))) & 4294967295L);
                C17844l c17844l3 = c12197l.f24243l;
                C14115l c14115lYandex = c17844l3.yandex;
                C2151l c2151lYandex = c17844l3.loadAd;
                C14836l c14836l = c14115lYandex != null ? new C14836l(AbstractC5941l.m1903return(c14115lYandex.yandex.getConfig())) : null;
                if (c14836l != null && c14836l.yandex == 0) {
                    z = true;
                } else {
                    C14836l c14836l2 = c14115lYandex != null ? new C14836l(AbstractC5941l.m1903return(c14115lYandex.yandex.getConfig())) : null;
                    if (AbstractC2812l.advert(c14836l2) && i == c14836l2.yandex) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                try {
                    try {
                        if (c14115lYandex != null && c2151lYandex != null) {
                            j = jCeil;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (c3366l.f7169l.admob() >> 32));
                            Bitmap bitmap = c14115lYandex.yandex;
                            if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (c3366l.f7169l.admob() & 4294967295L)) > bitmap.getHeight() || !z) {
                            }
                            c13601l = c17844l3.crashlytics;
                            if (c13601l == null) {
                                c13601l = new C13601l();
                                c17844l3.crashlytics = c13601l;
                            }
                            c18449l = c13601l.f26629l;
                            C4417l c4417l = c13601l.f26630l;
                            C13601l c13601l2 = c13601l;
                            long jMopub = AbstractC14707l.mopub(j);
                            EnumC9931l layoutDirection = c3366l.f7169l.getLayoutDirection();
                            InterfaceC13490l interfaceC13490l = c4417l.yandex;
                            EnumC9931l enumC9931l = c4417l.loadAd;
                            InterfaceC14859l interfaceC14859l = c4417l.crashlytics;
                            C14115l c14115l = c14115lYandex;
                            long j5 = c4417l.amazon;
                            c4417l.yandex = c3366l;
                            c4417l.loadAd = layoutDirection;
                            c4417l.crashlytics = c2151lYandex;
                            c4417l.amazon = jMopub;
                            c2151lYandex.mopub();
                            AbstractC9361l.metrica(c13601l2, C9735l.loadAd, 0L, jMopub, 0.0f, null, null, 0, 58);
                            f = -f16;
                            f2 = -f15;
                            ((C16543l) c18449l.f36010l).inmobi(f, f2);
                            AbstractC9361l.smaato(c13601l2, c13616l.amazon, c8990l3, 0.0f, new C0404l(f14, 0.0f, 0, 0, null, 30), null, 52);
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (c18449l.m4551private() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (c18449l.m4551private() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (c18449l.m4551private() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (c18449l.m4551private() & 4294967295L));
                            long jMo2070l = c13601l2.mo2070l();
                            jM4551private = c18449l.m4551private();
                            c18449l.m4555synchronized().mopub();
                            C2151l c2151l = c2151lYandex;
                            ((C16543l) c18449l.f36010l).isVip(fIntBitsToFloat2, fIntBitsToFloat3, jMo2070l);
                            AbstractC9361l.smaato(c13601l2, c9902lYandex3, c8990l3, 0.0f, null, null, 28);
                            c18449l.m4555synchronized().ads();
                            c18449l.m4534abstract(jM4551private);
                            ((C16543l) c18449l.f36010l).inmobi(-f, -f2);
                            c2151l.ads();
                            c4417l.yandex = interfaceC13490l;
                            c4417l.loadAd = enumC9931l;
                            c4417l.crashlytics = interfaceC14859l;
                            c4417l.amazon = j5;
                            c14115l.yandex.prepareToDraw();
                            c10700l.f21708l = c14115l;
                            return c3366l.yandex(new C1040l(c8896lAmazon, c10700l, j, c0534l, 2));
                        }
                        j = jCeil;
                        ((C16543l) c18449l.f36010l).isVip(fIntBitsToFloat2, fIntBitsToFloat3, jMo2070l);
                        AbstractC9361l.smaato(c13601l2, c9902lYandex3, c8990l3, 0.0f, null, null, 28);
                        c18449l.m4555synchronized().ads();
                        c18449l.m4534abstract(jM4551private);
                        ((C16543l) c18449l.f36010l).inmobi(-f, -f2);
                        c2151l.ads();
                        c4417l.yandex = interfaceC13490l;
                        c4417l.loadAd = enumC9931l;
                        c4417l.crashlytics = interfaceC14859l;
                        c4417l.amazon = j5;
                        c14115l.yandex.prepareToDraw();
                        c10700l.f21708l = c14115l;
                        return c3366l.yandex(new C1040l(c8896lAmazon, c10700l, j, c0534l, 2));
                    } catch (Throwable th) {
                        c18449l.m4555synchronized().ads();
                        c18449l.m4534abstract(jM4551private);
                        throw th;
                    }
                    AbstractC9361l.smaato(c13601l2, c13616l.amazon, c8990l3, 0.0f, new C0404l(f14, 0.0f, 0, 0, null, 30), null, 52);
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (c18449l.m4551private() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (c18449l.m4551private() >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (c18449l.m4551private() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (c18449l.m4551private() & 4294967295L));
                    long jMo2070l2 = c13601l2.mo2070l();
                    jM4551private = c18449l.m4551private();
                    c18449l.m4555synchronized().mopub();
                    C2151l c2151l2 = c2151lYandex;
                } catch (Throwable th2) {
                    ((C16543l) c18449l.f36010l).inmobi(-f, -f2);
                    throw th2;
                }
                c14115lYandex = AbstractC3925l.yandex((int) (j >> 32), (int) (j & 4294967295L), i, 24);
                c17844l3.yandex = c14115lYandex;
                c2151lYandex = AbstractC4918l.yandex(c14115lYandex);
                c17844l3.loadAd = c2151lYandex;
                c13601l = c17844l3.crashlytics;
                if (c13601l == null) {
                    c13601l = new C13601l();
                    c17844l3.crashlytics = c13601l;
                }
                c18449l = c13601l.f26629l;
                C4417l c4417l2 = c13601l.f26630l;
                C13601l c13601l3 = c13601l;
                long jMopub2 = AbstractC14707l.mopub(j);
                EnumC9931l layoutDirection2 = c3366l.f7169l.getLayoutDirection();
                InterfaceC13490l interfaceC13490l2 = c4417l2.yandex;
                EnumC9931l enumC9931l2 = c4417l2.loadAd;
                InterfaceC14859l interfaceC14859l2 = c4417l2.crashlytics;
                C14115l c14115l2 = c14115lYandex;
                long j6 = c4417l2.amazon;
                c4417l2.yandex = c3366l;
                c4417l2.loadAd = layoutDirection2;
                c4417l2.crashlytics = c2151lYandex;
                c4417l2.amazon = jMopub2;
                c2151lYandex.mopub();
                AbstractC9361l.metrica(c13601l3, C9735l.loadAd, 0L, jMopub2, 0.0f, null, null, 0, 58);
                f = -f16;
                f2 = -f15;
                ((C16543l) c18449l.f36010l).inmobi(f, f2);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC9354l interfaceC9354l = (InterfaceC9354l) obj2;
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    interfaceC9354l.yandex(th3);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C18163l c18163l = (C18163l) obj2;
                Throwable th4 = (Throwable) obj;
                if (th4 != null) {
                    c18163l.isPro.m560l(th4);
                }
                if (th4 != null) {
                    c18163l.subs.m2649l(th4);
                }
                return Unit.INSTANCE;
            case 20:
                C13492l c13492l = (C13492l) obj2;
                InterfaceC13349l interfaceC13349l2 = (InterfaceC13349l) obj;
                C7375l c7375l = c13492l.f26500l;
                C2549l c2549l = c13492l.f26496l;
                C4292l c4292l = c2549l.amazon;
                C0820l c0820l = c2549l.loadAd;
                C11775l c11775l = c2549l.crashlytics;
                c4292l.getClass();
                float f17 = c2549l.purchase;
                long jMo2070l3 = interfaceC13349l2.mo2070l();
                C18449l c18449lMo2065break = interfaceC13349l2.mo2065break();
                long jM4551private2 = c18449lMo2065break.m4551private();
                c18449lMo2065break.m4555synchronized().mopub();
                try {
                    ((C16543l) c18449lMo2065break.f36010l).isVip(f17, f17, jMo2070l3);
                    float fMin2 = Math.min(Float.intBitsToFloat((int) (interfaceC13349l2.admob() >> 32)), Float.intBitsToFloat((int) (interfaceC13349l2.admob() & 4294967295L)));
                    float f18 = c7375l.yandex;
                    float f19 = fMin2 / f18;
                    c11775l.getClass();
                    C8195l c8195lFirebase = c13492l.firebase(f19);
                    C9902l c9902l2 = (C9902l) c8195lFirebase.f17098l;
                    C9902l c9902l3 = (C9902l) c8195lFirebase.f17097l;
                    if (c13492l.startapp() || c13492l.adcel()) {
                        c13492l.vip(interfaceC13349l2, f19);
                    }
                    if (c13492l.adcel()) {
                        interfaceC13349l = interfaceC13349l2;
                    } else {
                        interfaceC13349l = interfaceC13349l2;
                        AbstractC9361l.smaato(interfaceC13349l, c9902l3, c0820l.loadAd.yandex(f19 * f18, C4565l.subs), 0.0f, null, null, 60);
                    }
                    if (!c13492l.startapp()) {
                        AbstractC9361l.smaato(interfaceC13349l, c9902l2, c0820l.yandex.yandex(f18 * f19, C4565l.subs), 0.0f, null, null, 60);
                    }
                    if (AbstractC5711l.admob(c2549l.loadAd.amazon) || c13492l.startapp()) {
                        c13492l.remoteconfig(interfaceC13349l, f19);
                    }
                    if (AbstractC5711l.admob(c2549l.loadAd.crashlytics) || c13492l.startapp()) {
                        c13492l.smaato(interfaceC13349l, f19);
                    }
                    c2549l.crashlytics.getClass();
                    return Unit.INSTANCE;
                } finally {
                    AbstractC0653l.license(c18449lMo2065break, jM4551private2);
                }
            case 21:
                return Boolean.valueOf(((C16080l) obj).yandex == ((C15615l) obj2));
            case 22:
                C12000l c12000l = (C12000l) obj2;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC1760l.purchase, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1653435412, true, new C15381l(c12000l, i6)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1517408115, true, new C15381l(c12000l, 4)), 3);
                return Unit.INSTANCE;
            case 23:
                C6433l c6433l = (C6433l) obj2;
                C1336l c1336l2 = (C1336l) obj;
                if (c6433l.m2003instanceof() == EnumC9503l.f19384l) {
                    AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC7720l.purchase, 3);
                } else if (c6433l.m2003instanceof() == EnumC9503l.f19387l || c6433l.m2003instanceof() == EnumC9503l.f19383l) {
                    AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC7720l.billing, 3);
                    AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC7720l.mopub, 3);
                    AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(-501451281, true, new C1543l(c6433l, i7)), 3);
                    AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC7720l.smaato, 3);
                    AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC7720l.remoteconfig, 3);
                    AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC7720l.ads, 3);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C18014l) obj2).m4461try(C9022l.yandex);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C14025l c14025l = (C14025l) obj;
                C18402l c18402lMo694private = ((AbstractC5921l) obj2).mo694private(c14025l);
                if (c18402lMo694private == null) {
                    return null;
                }
                return new C8195l(c14025l, c18402lMo694private);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C12752l c12752l = (C12752l) obj2;
                ArrayList arrayList = c12752l.f25125l;
                ((C1336l) obj).firebase(arrayList.size(), null, new Creturn(arrayList, 16, z2), new C15578l(2039820996, true, new C6780l(arrayList, c12752l, i3)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C12221l c12221l = (C12221l) obj2;
                C1336l c1336l3 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(-1704371521, true, new C1350l(15, c12221l)), 3);
                List list2 = C12221l.f24277l;
                c1336l3.firebase(list2.size(), null, new Creturn(list2, i5, z2), new C15578l(2039820996, true, new C6780l(list2, c12221l, i4)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return (C7695l) ((C12986l) obj2).invoke(((C8119l) obj).yandex);
            default:
                C10853l c10853l = (C10853l) obj2;
                C18625l c18625l = (C18625l) AbstractC16901l.m4220for(((Integer) obj).intValue(), c10853l.loadAd);
                return c18625l == null ? c10853l.yandex : c18625l;
        }
    }
}
