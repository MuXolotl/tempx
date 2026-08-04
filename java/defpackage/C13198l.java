package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًؚْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13198l {
    public static final Range billing = new Range(120, 120);
    public final C8688l amazon;
    public final C8688l crashlytics;
    public final C8688l loadAd;
    public final C8688l purchase;
    public final InterfaceC5389l yandex;

    public C13198l(InterfaceC5389l interfaceC5389l) {
        this.yandex = interfaceC5389l;
        final int i = 0;
        this.loadAd = new C8688l(new Function0(this) { // from class: lْٔٛ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13198l f29512l;

            {
                this.f29512l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C13198l c13198l = this.f29512l;
                switch (i2) {
                    case 0:
                        int[] iArr = (int[]) ((C10861l) c13198l.yandex).crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i3 : iArr) {
                                if (i3 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) c13198l.purchase.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            C4875l.firebase();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iYandex = AbstractC5513l.yandex((Size) next);
                            do {
                                Object next2 = it.next();
                                int iYandex2 = AbstractC5513l.yandex((Size) next2);
                                if (iYandex < iYandex2) {
                                    next = next2;
                                    iYandex = iYandex2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        InterfaceC5389l interfaceC5389l2 = c13198l.yandex;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C10861l) interfaceC5389l2).crashlytics(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new C5979l(streamConfigurationMap, new C3111l(interfaceC5389l2));
                        }
                        C8339l.metrica("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((C5979l) c13198l.amazon.getValue()).crashlytics.f16631l;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? AbstractC8669l.m2415super(highSpeedVideoSizes) : C2580l.f5619l;
                }
            }
        });
        final int i2 = 1;
        this.crashlytics = new C8688l(new Function0(this) { // from class: lْٔٛ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13198l f29512l;

            {
                this.f29512l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C13198l c13198l = this.f29512l;
                switch (i3) {
                    case 0:
                        int[] iArr = (int[]) ((C10861l) c13198l.yandex).crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i4 : iArr) {
                                if (i4 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) c13198l.purchase.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            C4875l.firebase();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iYandex = AbstractC5513l.yandex((Size) next);
                            do {
                                Object next2 = it.next();
                                int iYandex2 = AbstractC5513l.yandex((Size) next2);
                                if (iYandex < iYandex2) {
                                    next = next2;
                                    iYandex = iYandex2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        InterfaceC5389l interfaceC5389l2 = c13198l.yandex;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C10861l) interfaceC5389l2).crashlytics(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new C5979l(streamConfigurationMap, new C3111l(interfaceC5389l2));
                        }
                        C8339l.metrica("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((C5979l) c13198l.amazon.getValue()).crashlytics.f16631l;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? AbstractC8669l.m2415super(highSpeedVideoSizes) : C2580l.f5619l;
                }
            }
        });
        final int i3 = 2;
        this.amazon = new C8688l(new Function0(this) { // from class: lْٔٛ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13198l f29512l;

            {
                this.f29512l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                C13198l c13198l = this.f29512l;
                switch (i4) {
                    case 0:
                        int[] iArr = (int[]) ((C10861l) c13198l.yandex).crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i5 : iArr) {
                                if (i5 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) c13198l.purchase.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            C4875l.firebase();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iYandex = AbstractC5513l.yandex((Size) next);
                            do {
                                Object next2 = it.next();
                                int iYandex2 = AbstractC5513l.yandex((Size) next2);
                                if (iYandex < iYandex2) {
                                    next = next2;
                                    iYandex = iYandex2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        InterfaceC5389l interfaceC5389l2 = c13198l.yandex;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C10861l) interfaceC5389l2).crashlytics(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new C5979l(streamConfigurationMap, new C3111l(interfaceC5389l2));
                        }
                        C8339l.metrica("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((C5979l) c13198l.amazon.getValue()).crashlytics.f16631l;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? AbstractC8669l.m2415super(highSpeedVideoSizes) : C2580l.f5619l;
                }
            }
        });
        final int i4 = 3;
        this.purchase = new C8688l(new Function0(this) { // from class: lْٔٛ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13198l f29512l;

            {
                this.f29512l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                C13198l c13198l = this.f29512l;
                switch (i5) {
                    case 0:
                        int[] iArr = (int[]) ((C10861l) c13198l.yandex).crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i6 : iArr) {
                                if (i6 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) c13198l.purchase.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            C4875l.firebase();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iYandex = AbstractC5513l.yandex((Size) next);
                            do {
                                Object next2 = it.next();
                                int iYandex2 = AbstractC5513l.yandex((Size) next2);
                                if (iYandex < iYandex2) {
                                    next = next2;
                                    iYandex = iYandex2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        InterfaceC5389l interfaceC5389l2 = c13198l.yandex;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C10861l) interfaceC5389l2).crashlytics(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new C5979l(streamConfigurationMap, new C3111l(interfaceC5389l2));
                        }
                        C8339l.metrica("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((C5979l) c13198l.amazon.getValue()).crashlytics.f16631l;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? AbstractC8669l.m2415super(highSpeedVideoSizes) : C2580l.f5619l;
                }
            }
        });
    }

    public static List yandex(List list) {
        if (list.isEmpty()) {
            return C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList((Collection) AbstractC16901l.m4231native(list));
        Iterator it = AbstractC16901l.m4233package(1, list).iterator();
        while (it.hasNext()) {
            arrayList.retainAll((List) it.next());
        }
        return arrayList;
    }

    public final List crashlytics(Size size) {
        Object c18435l;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C5979l) this.amazon.getValue()).crashlytics.f16631l;
            c18435l = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size) : null;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Range[] rangeArr = (Range[]) (c18435l instanceof C18435l ? null : c18435l);
        return rangeArr != null ? AbstractC16901l.m4213const(AbstractC8669l.m2420volatile(rangeArr)) : C2580l.f5619l;
    }

    public final Range[] loadAd(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && AbstractC16901l.m4245throws(list).size() == 1) {
            List listCrashlytics = crashlytics((Size) list.get(0));
            if (listCrashlytics.isEmpty()) {
                listCrashlytics = null;
            }
            if (listCrashlytics != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listCrashlytics) {
                        Range range = (Range) obj;
                        if (AbstractC8576l.yandex(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    listCrashlytics = arrayList;
                }
                return (Range[]) listCrashlytics.toArray(new Range[0]);
            }
        }
        return null;
    }
}
