package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌؓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8509l {
    public final boolean admob;
    public final Map amazon;
    public final C5664l billing;
    public final int crashlytics;
    public boolean firebase;
    public final Object isPro;
    public final C11969l loadAd;
    public final C7094l mopub;
    public final Map purchase;
    public final C11878l remoteconfig;
    public C16053l smaato;
    public final int subs;
    public final InterfaceC11450l yandex;

    public C8509l(InterfaceC11450l interfaceC11450l, C11969l c11969l, int i, Map map, Map map2, C5664l c5664l, C7094l c7094l, boolean z) {
        this.yandex = interfaceC11450l;
        this.loadAd = c11969l;
        this.crashlytics = i;
        this.amazon = map;
        this.purchase = map2;
        this.billing = c5664l;
        this.mopub = c7094l;
        this.admob = z;
        C11879l c11879l = AbstractC10494l.yandex;
        c11879l.getClass();
        this.subs = C11879l.loadAd.incrementAndGet(c11879l);
        this.isPro = new Object();
        List list = c5664l.f12043l;
        C11878l c11878lLoadAd = null;
        if (!list.isEmpty()) {
            C8278l c8278l = (C8278l) AbstractC16901l.m4231native(list);
            Surface inputSurface = interfaceC11450l.getInputSurface();
            if (inputSurface == null) {
                C8339l.smaato("inputSurface is required to create instance of imageWriter.");
                throw null;
            }
            try {
                c11878lLoadAd = AbstractC7985l.loadAd(inputSurface, c8278l.yandex, new C10134l(c8278l.loadAd), c11969l.yandex());
            } catch (RuntimeException e) {
                Log.e("CXCP", "Failed to create ImageWriter for session " + this.yandex + "! Reprocessing will not be supported!", e);
            }
            if (c11878lLoadAd != null) {
                Log.d("CXCP", "Created ImageWriter " + c11878lLoadAd + " for session " + this.yandex);
            }
        }
        this.remoteconfig = c11878lLoadAd;
    }

    public static final void loadAd(C8509l c8509l, C16053l c16053l) {
        Log.d("CXCP", "Waiting for the last repeating request sequence: " + c16053l);
        if (((Unit) c8509l.loadAd.loadAd(2000L, new C13954l(c16053l, null, 1))) == null) {
            Log.e("CXCP", c8509l + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + c16053l);
        }
    }

    public final void amazon() {
        C16053l c16053l;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.isPro) {
                try {
                    if (this.firebase) {
                        c16053l = null;
                    } else {
                        this.firebase = true;
                        C11878l c11878l = this.remoteconfig;
                        if (c11878l != null) {
                            AbstractC14814l.pro(c11878l);
                        }
                        Surface inputSurface = this.yandex.getInputSurface();
                        if (inputSurface != null) {
                            inputSurface.release();
                        }
                        c16053l = this.smaato;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.admob && c16053l != null) {
                loadAd(this, c16053l);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:227:0x0493 A[LOOP:8: B:209:0x044d->B:227:0x0493, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0192  */
    public final C16053l crashlytics(boolean z, List list, Map map, Map map2, Map map3, C13161l c13161l, List list2) {
        String str;
        boolean z2;
        String str2;
        boolean z3;
        ArrayMap arrayMap;
        C5664l c5664l;
        long j;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean zYandex;
        Iterator it;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Map map4 = map3;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        String str3 = "build(...) should never be called with an empty request list!";
        if (list.isEmpty()) {
            C8339l.smaato("build(...) should never be called with an empty request list!");
            return null;
        }
        InterfaceC11450l interfaceC11450l = this.yandex;
        boolean z14 = interfaceC11450l instanceof C4453l;
        String str4 = "CXCP";
        C5664l c5664l2 = this.billing;
        if (!z14) {
            str = str3;
            interfaceC11450l = interfaceC11450l;
            arrayList = arrayList;
            z2 = true;
            break;
        }
        Iterator it2 = list.iterator();
        Boolean bool = null;
        Boolean bool2 = null;
        while (true) {
            if (!it2.hasNext()) {
                str = str3;
                interfaceC11450l = interfaceC11450l;
                arrayList = arrayList;
                z2 = true;
                break;
            }
            C15390l c15390l = (C15390l) it2.next();
            List list3 = c15390l.yandex;
            if (list3 != null && list3.isEmpty()) {
                it = it2;
                str = str3;
                interfaceC11450l = interfaceC11450l;
                arrayList = arrayList;
                z9 = false;
                break;
            }
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    it = it2;
                    str = str3;
                    interfaceC11450l = interfaceC11450l;
                    arrayList = arrayList;
                    z9 = false;
                    break;
                }
                ((C16755l) it3.next()).getClass();
                it = it2;
                ArrayList arrayList3 = c5664l2.f12038l;
                if (arrayList3 != null && arrayList3.isEmpty()) {
                    str = str3;
                    interfaceC11450l = interfaceC11450l;
                    it3 = it3;
                    arrayList = arrayList;
                    z8 = false;
                    break;
                }
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        str = str3;
                        interfaceC11450l = interfaceC11450l;
                        it3 = it3;
                        arrayList = arrayList;
                        z8 = false;
                        break;
                    }
                    Iterator it5 = it4;
                    C16853l c16853l = (C16853l) it4.next();
                    str = str3;
                    C5565l c5565l = c16853l.mopub;
                    if (c5565l == null ? false : C5565l.yandex(c5565l.yandex, 1L)) {
                        z7 = true;
                    } else {
                        C5959l c5959l = c16853l.subs;
                        if ((c5959l == null ? false : C5959l.yandex(c5959l.yandex, 0L)) || c5959l == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    }
                    if (z7) {
                        z8 = true;
                        break;
                    }
                    str3 = str;
                    it4 = it5;
                    interfaceC11450l = interfaceC11450l;
                    arrayList = arrayList;
                    it3 = it3;
                }
                if (z8) {
                    z9 = true;
                    break;
                }
                it2 = it;
                str3 = str;
                interfaceC11450l = interfaceC11450l;
                arrayList = arrayList;
                it3 = it3;
            }
            Boolean boolValueOf = Boolean.valueOf(z9);
            if (bool != null && !bool.equals(boolValueOf)) {
                Log.e("CXCP", "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: " + bool.booleanValue() + ". Current request contains preview stream use case or hint: " + z9 + '.');
            }
            List list4 = c15390l.yandex;
            if (!(list4 != null) || !list4.isEmpty()) {
                Iterator it6 = list4.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z12 = false;
                        break;
                    }
                    ((C16755l) it6.next()).getClass();
                    ArrayList arrayList4 = c5664l2.f12038l;
                    if (!(arrayList4 != null) || !arrayList4.isEmpty()) {
                        Iterator it7 = arrayList4.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                z11 = false;
                                break;
                            }
                            C16853l c16853l2 = (C16853l) it7.next();
                            C5565l c5565l2 = c16853l2.mopub;
                            if (c5565l2 == null ? false : C5565l.yandex(c5565l2.yandex, 3L)) {
                                z10 = true;
                            } else {
                                C5959l c5959l2 = c16853l2.subs;
                                if (c5959l2 == null ? false : C5959l.yandex(c5959l2.yandex, 1L)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                            if (z10) {
                                z11 = true;
                                break;
                            }
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                    if (z11) {
                        z12 = true;
                        break;
                    }
                }
            } else {
                z12 = false;
                break;
            }
            Object objValueOf = Boolean.valueOf(z12);
            Boolean bool3 = bool2;
            if (bool3 != null && !bool3.equals(objValueOf)) {
                Log.e("CXCP", "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: " + bool3.booleanValue() + ". Current request contains video stream use case: " + z12 + '.');
            }
            ArrayList arrayList5 = c5664l2.f12038l;
            if (!(arrayList5 != null) || !arrayList5.isEmpty()) {
                Iterator it8 = arrayList5.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        z13 = true;
                        break;
                    }
                    if (!((C16853l) it8.next()).yandex()) {
                        z13 = false;
                        break;
                    }
                }
            } else {
                z13 = true;
                break;
            }
            if (!z13) {
                Log.e("CXCP", "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + c5664l2.f12038l);
                z2 = false;
                break;
            }
            bool = boolValueOf;
            bool2 = objValueOf;
            it2 = it;
            str3 = str;
            interfaceC11450l = interfaceC11450l;
            arrayList = arrayList;
        }
        if (z2) {
            if (list.isEmpty()) {
                C8339l.smaato(str);
                return null;
            }
            Iterator it9 = list.iterator();
            while (true) {
                str2 = "Check failed.";
                if (!it9.hasNext()) {
                    z3 = true;
                    break;
                }
                C15390l c15390l2 = (C15390l) it9.next();
                Iterator it10 = c15390l2.yandex.iterator();
                boolean z15 = false;
                while (it10.hasNext()) {
                    int i = ((C16755l) it10.next()).yandex;
                    if (!arrayMap4.containsKey(new C16755l(i))) {
                        Surface surface = (Surface) this.amazon.get(new C16755l(i));
                        if (surface != null) {
                            arrayMap2.put(surface, new C16755l(i));
                            arrayMap4.put(new C16755l(i), surface);
                            C9494l c9494lYandex = c5664l2.yandex(i);
                            if (c9494lYandex == null) {
                                C8339l.smaato("Required value was null.");
                                return null;
                            }
                            for (C16853l c16853l3 : c9494lYandex.loadAd) {
                                Iterator it11 = it9;
                                Object obj = this.purchase.get(new C13172l(c16853l3.yandex));
                                if (obj == null) {
                                    C8339l.smaato("Required value was null.");
                                    return null;
                                }
                                arrayMap3.put((Surface) obj, new C13172l(c16853l3.yandex));
                                it9 = it11;
                            }
                        } else {
                            continue;
                        }
                    }
                    z15 = true;
                }
                Iterator it12 = it9;
                if (!z15) {
                    Log.i("CXCP", "  Failed to bind any surfaces for " + c15390l2 + '!');
                    z3 = false;
                    break;
                }
                if (!z15) {
                    C8339l.smaato("Check failed.");
                    return null;
                }
                it9 = it12;
            }
            if (z3) {
                Iterator it13 = list.iterator();
                while (it13.hasNext()) {
                    C15390l c15390l3 = (C15390l) it13.next();
                    Log.d(str4, "Building CaptureRequest for " + c15390l3);
                    C18221l c18221l = c15390l3.purchase;
                    int i2 = c18221l != null ? c18221l.yandex : this.crashlytics;
                    CaptureRequest.Builder builderMo839private = interfaceC11450l.mo2281try().mo839private(i2);
                    if (builderMo839private == null) {
                        Log.i(str4, "Failed to create a CaptureRequest.Builder from " + ((Object) C18221l.loadAd(i2)) + '!');
                        builderMo839private = null;
                    }
                    if (builderMo839private == null) {
                        return null;
                    }
                    C5192l c5192l = AbstractC12634l.loadAd;
                    Object obj2 = map4.get(c5192l);
                    if (obj2 == null) {
                        obj2 = map.get(c5192l);
                    }
                    builderMo839private.setTag(obj2);
                    int size = c15390l3.yandex.size();
                    boolean z16 = false;
                    for (int i3 = 0; i3 < size; i3++) {
                        Surface surface2 = (Surface) arrayMap4.get(c15390l3.yandex.get(i3));
                        if (surface2 != null) {
                            builderMo839private.addTarget(surface2);
                            z16 = true;
                        }
                    }
                    if (!z16) {
                        C8339l.smaato(str2);
                        return null;
                    }
                    AbstractC7370l.isPro(builderMo839private, map);
                    AbstractC7370l.isPro(builderMo839private, map2);
                    AbstractC7370l.isPro(builderMo839private, c15390l3.loadAd);
                    AbstractC7370l.isPro(builderMo839private, map4);
                    C3897l c3897l = AbstractC10494l.crashlytics;
                    c3897l.getClass();
                    long jIncrementAndGet = C3897l.loadAd.incrementAndGet(c3897l);
                    CaptureRequest captureRequestBuild = builderMo839private.build();
                    InterfaceC11450l interfaceC11450l2 = this.yandex;
                    if (interfaceC11450l2 instanceof C4453l) {
                        C4453l c4453l = (C4453l) interfaceC11450l2;
                        InterfaceC2413l interfaceC2413l = c4453l.f29603l;
                        try {
                            Trace.beginSection("CXCP#createHighSpeedRequestList");
                            List<CaptureRequest> listCreateHighSpeedRequestList = c4453l.f9064l.createHighSpeedRequestList(captureRequestBuild);
                            try {
                                Trace.endSection();
                            } catch (IllegalArgumentException unused) {
                                Log.w(str4, "Failed to createHighSpeedRequestList from " + interfaceC2413l + " because the output surface was destroyed before calling createHighSpeedRequestList.");
                                listCreateHighSpeedRequestList = null;
                            } catch (IllegalStateException unused2) {
                                Log.w(str4, "Failed to createHighSpeedRequestList. " + interfaceC2413l + " may be closed.");
                                listCreateHighSpeedRequestList = null;
                            } catch (UnsupportedOperationException unused3) {
                                Log.w(str4, "Failed to createHighSpeedRequestList from " + interfaceC2413l + " because the output surface was not available.");
                                listCreateHighSpeedRequestList = null;
                            }
                            if (listCreateHighSpeedRequestList == null) {
                                return null;
                            }
                            List list5 = c15390l3.yandex;
                            if ((list5 != null) && list5.isEmpty()) {
                                arrayMap = arrayMap3;
                                z4 = false;
                                j = 1;
                            } else {
                                Iterator it14 = list5.iterator();
                                while (true) {
                                    if (!it14.hasNext()) {
                                        arrayMap = arrayMap3;
                                        j = 1;
                                        z4 = false;
                                        break;
                                    }
                                    ((C16755l) it14.next()).getClass();
                                    ArrayList arrayList6 = c5664l2.f12038l;
                                    if ((arrayList6 != null) && arrayList6.isEmpty()) {
                                        arrayMap = arrayMap3;
                                        it14 = it14;
                                        z5 = false;
                                        j = 1;
                                    } else {
                                        Iterator it15 = arrayList6.iterator();
                                        while (true) {
                                            if (!it15.hasNext()) {
                                                arrayMap = arrayMap3;
                                                it14 = it14;
                                                j = 1;
                                                z5 = false;
                                                break;
                                            }
                                            C16853l c16853l4 = (C16853l) it15.next();
                                            arrayMap = arrayMap3;
                                            C5565l c5565l3 = c16853l4.mopub;
                                            if (c5565l3 == null ? false : C5565l.yandex(c5565l3.yandex, 3L)) {
                                                j = 1;
                                            } else {
                                                C5959l c5959l3 = c16853l4.subs;
                                                if (c5959l3 == null) {
                                                    zYandex = false;
                                                    j = 1;
                                                } else {
                                                    j = 1;
                                                    zYandex = C5959l.yandex(c5959l3.yandex, 1L);
                                                }
                                                if (!zYandex) {
                                                    z6 = false;
                                                }
                                                if (z6) {
                                                    z5 = true;
                                                    break;
                                                }
                                                it14 = it14;
                                                arrayMap3 = arrayMap;
                                                it15 = it15;
                                            }
                                            z6 = true;
                                            if (z6) {
                                                z5 = true;
                                                break;
                                            }
                                            it14 = it14;
                                            arrayMap3 = arrayMap;
                                            it15 = it15;
                                        }
                                    }
                                    if (z5) {
                                        z4 = true;
                                        break;
                                    }
                                    it14 = it14;
                                    arrayMap3 = arrayMap;
                                }
                            }
                            if (z4) {
                                ArrayList arrayList7 = arrayList;
                                c5664l = c5664l2;
                                int size2 = listCreateHighSpeedRequestList.size();
                                int i4 = 0;
                                while (i4 < size2) {
                                    int i5 = size2;
                                    ArrayList arrayList8 = arrayList7;
                                    ArrayMap arrayMap5 = arrayMap2;
                                    int i6 = i4;
                                    C10719l c10719l = new C10719l(this.yandex, listCreateHighSpeedRequestList.get(i4), map, map2, map3, arrayMap4, z, c15390l3, jIncrementAndGet);
                                    arrayList2.add(listCreateHighSpeedRequestList.get(i6));
                                    arrayList8.add(c10719l);
                                    i4 = i6 + 1;
                                    arrayList7 = arrayList8;
                                    size2 = i5;
                                    arrayMap2 = arrayMap5;
                                }
                                map4 = map3;
                                arrayList = arrayList7;
                            } else {
                                c5664l = c5664l2;
                                C10719l c10719l2 = new C10719l(this.yandex, listCreateHighSpeedRequestList.get(0), map, map2, map4, arrayMap4, z, c15390l3, jIncrementAndGet);
                                arrayList2.add(listCreateHighSpeedRequestList.get(0));
                                arrayList.add(c10719l2);
                                map4 = map3;
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        arrayMap = arrayMap3;
                        c5664l = c5664l2;
                        map4 = map3;
                        C10719l c10719l3 = new C10719l(interfaceC11450l2, captureRequestBuild, map, map2, map4, arrayMap4, z, c15390l3, jIncrementAndGet);
                        arrayList2.add(captureRequestBuild);
                        arrayList.add(c10719l3);
                    }
                    str4 = str4;
                    str2 = str2;
                    c5664l2 = c5664l;
                    arrayMap3 = arrayMap;
                }
                return new C16053l(interfaceC11450l.mo2281try().vip(), z, arrayList2, arrayList, list2, c13161l, arrayMap2, arrayMap3, this.billing, this.mopub);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006b A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    public final Integer purchase(C16053l c16053l) {
        boolean z;
        InterfaceC11450l interfaceC11450l;
        ArrayList arrayList;
        Integer numMo2276case;
        synchronized (this.isPro) {
            if (this.firebase) {
                Log.w("CXCP", this + " disconnected. " + c16053l + " won't be submitted");
                return null;
            }
            if (c16053l.crashlytics.size() == 1) {
                InterfaceC11450l interfaceC11450l2 = this.yandex;
                if (interfaceC11450l2 instanceof C4453l) {
                    z = c16053l.loadAd;
                    interfaceC11450l = this.yandex;
                    arrayList = c16053l.crashlytics;
                    if (z) {
                        numMo2276case = interfaceC11450l.mo2277l(arrayList, c16053l);
                    } else {
                        numMo2276case = interfaceC11450l.mo2276case(arrayList, c16053l);
                    }
                } else if (c16053l.loadAd) {
                    if (this.admob) {
                        this.smaato = c16053l;
                    }
                    numMo2276case = interfaceC11450l2.Signature((CaptureRequest) c16053l.crashlytics.get(0), c16053l);
                } else {
                    numMo2276case = interfaceC11450l2.mo2278l((CaptureRequest) c16053l.crashlytics.get(0), c16053l);
                }
            } else {
                z = c16053l.loadAd;
                interfaceC11450l = this.yandex;
                arrayList = c16053l.crashlytics;
                if (z) {
                    numMo2276case = interfaceC11450l.mo2277l(arrayList, c16053l);
                } else {
                    numMo2276case = interfaceC11450l.mo2276case(arrayList, c16053l);
                }
            }
            return numMo2276case;
        }
    }

    public final String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.subs;
    }

    public final void yandex() {
        synchronized (this.isPro) {
            Log.d("CXCP", this + "#abortCaptures");
            this.yandex.mo2275abstract();
            Unit unit = Unit.INSTANCE;
        }
    }
}
