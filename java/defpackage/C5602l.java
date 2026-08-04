package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘُۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5602l implements InterfaceC4902l, InterfaceC12904l, InterfaceC11227l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f11900l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f11901l;

    public C5602l(Function1 function1) {
        this.f11901l = function1;
        this.f11900l = new C16611l();
    }

    @Override // defpackage.InterfaceC4902l
    public float billing() {
        return ((Number) ((Range) this.f11900l).getLower()).floatValue();
    }

    @Override // defpackage.InterfaceC4902l
    public InterfaceC1142l firebase(InterfaceC16983l interfaceC16983l) {
        ArrayList arrayListMetrica = AbstractC14055l.metrica(CaptureRequest.CONTROL_ZOOM_RATIO);
        if (Build.VERSION.SDK_INT >= 34) {
            arrayListMetrica.add(CaptureRequest.CONTROL_SETTINGS_OVERRIDE);
        }
        return interfaceC16983l.mopub(arrayListMetrica);
    }

    @Override // defpackage.InterfaceC4902l
    public Rect isPro() {
        return (Rect) ((C10861l) ((C15736l) this.f11901l).loadAd).crashlytics(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    @Override // defpackage.InterfaceC4902l
    public float loadAd() {
        return ((Number) ((Range) this.f11900l).getUpper()).floatValue();
    }

    @Override // defpackage.InterfaceC12904l
    public InterfaceC16588l purchase(InterfaceC1388l interfaceC1388l) {
        C12718l c12718l = (C12718l) ((C16611l) this.f11900l).get(((InterfaceC13937l) interfaceC1388l).mo1730private());
        Object c2136l = c12718l.yandex.get();
        if (c2136l == null) {
            synchronized (c12718l) {
                c2136l = c12718l.yandex.get();
                if (c2136l == null) {
                    c2136l = new C2136l((InterfaceC16588l) ((Function1) this.f11901l).invoke(interfaceC1388l));
                    c12718l.yandex = new SoftReference(c2136l);
                }
            }
        }
        return ((C2136l) c2136l).yandex;
    }

    @Override // defpackage.InterfaceC4902l
    public InterfaceC1142l smaato(float f, InterfaceC16983l interfaceC16983l) {
        float fBilling = billing();
        if (f > loadAd() || fBilling > f) {
            C8339l.metrica("Failed requirement.");
            return null;
        }
        LinkedHashMap linkedHashMapVip = AbstractC8676l.vip(new C8195l(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f)));
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C11905l c11905l = InterfaceC5389l.admob;
            InterfaceC5389l interfaceC5389l = ((C15736l) this.f11901l).loadAd;
            c11905l.getClass();
            if (i >= 34 && AbstractC5917l.advert(interfaceC5389l)) {
                AbstractC5917l.m1867for(linkedHashMapVip);
            }
        }
        return interfaceC16983l.isPro(linkedHashMapVip, AbstractC3222l.loadAd);
    }

    @Override // defpackage.InterfaceC11227l
    public Object yandex(InterfaceC1388l interfaceC1388l, ArrayList arrayList) {
        Object c18435l;
        C12718l c12718l = (C12718l) ((C16611l) this.f11900l).get(((InterfaceC13937l) interfaceC1388l).mo1730private());
        Object c5756l = c12718l.yandex.get();
        if (c5756l == null) {
            synchronized (c12718l) {
                c5756l = c12718l.yandex.get();
                if (c5756l == null) {
                    c5756l = new C5756l();
                    c12718l.yandex = new SoftReference(c5756l);
                }
            }
        }
        C5756l c5756l2 = (C5756l) c5756l;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C7425l((InterfaceC13012l) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = c5756l2.yandex;
        Object obj = concurrentHashMap.get(arrayList2);
        if (obj == null) {
            try {
                c18435l = (InterfaceC16588l) ((Function2) this.f11901l).invoke(interfaceC1388l, arrayList);
            } catch (Throwable th) {
                c18435l = new C18435l(th);
            }
            C1171l c1171l = new C1171l(c18435l);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, c1171l);
            obj = objPutIfAbsent == null ? c1171l : objPutIfAbsent;
        }
        return ((C1171l) obj).f3160l;
    }

    public C5602l(Function2 function2) {
        this.f11901l = function2;
        this.f11900l = new C16611l();
    }

    public C5602l(C15736l c15736l, Range range) {
        this.f11901l = c15736l;
        this.f11900l = range;
    }
}
