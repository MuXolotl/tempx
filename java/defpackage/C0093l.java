package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: lٟؑؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0093l implements InterfaceC2257l, InterfaceC17435l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final long[] f1003l = new long[0];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f1004l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f1005l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f1006l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f1007l;

    public C0093l(InterfaceC18035l interfaceC18035l, C14959l c14959l) {
        this.f1005l = interfaceC18035l;
        this.f1004l = c14959l;
        int iMopub = interfaceC18035l.mopub();
        if (iMopub <= 64) {
            this.f1006l = iMopub != 64 ? (-1) << iMopub : 0L;
            this.f1007l = f1003l;
            return;
        }
        this.f1006l = 0L;
        int i = (iMopub - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMopub & 63) != 0) {
            jArr[i - 1] = (-1) << iMopub;
        }
        this.f1007l = jArr;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0100 A[PHI: r6 r16 r17
  0x0100: PHI (r6v3 android.database.Cursor) = (r6v4 android.database.Cursor), (r6v6 android.database.Cursor) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r16v3 lؓٔؖ) = (r16v5 lؓٔؖ), (r16v9 lؓٔؖ) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public C1841l amazon(String str, C1841l c1841l) throws Throwable {
        Cursor cursor;
        C1841l c1841l2;
        long j;
        Cursor cursorRawQuery;
        Pair pair;
        Object obj;
        Pair pair2;
        String strAdvert = c1841l.advert();
        List listLicense = c1841l.license();
        C13370l c13370l = (C13370l) this.f1007l;
        C6901l c6901l = c13370l.f13233l;
        C6901l c6901l2 = c13370l.f13233l;
        C17417l c17417l = (C17417l) c13370l.f833l;
        c6901l.m2113try();
        C0420l c0420lM3695l = C13718l.m3695l("_eid", c1841l);
        Long l = (Long) (c0420lM3695l == null ? null : C13718l.m3702l(c0420lM3695l));
        if (l != null) {
            if (strAdvert.equals("_ep")) {
                c6901l.m2113try();
                C0420l c0420lM3695l2 = C13718l.m3695l("_en", c1841l);
                String str2 = (String) (c0420lM3695l2 == null ? null : C13718l.m3702l(c0420lM3695l2));
                if (TextUtils.isEmpty(str2)) {
                    C8118l c8118l = c17417l.f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16909l.loadAd(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((C1841l) this.f1005l) == null || ((Long) this.f1004l) == null || l.longValue() != ((Long) this.f1004l).longValue()) {
                    C8648l c8648l = c6901l.f14451l;
                    C6901l.m2082case(c8648l);
                    C17417l c17417l2 = (C17417l) c8648l.f833l;
                    c8648l.mo211l();
                    c8648l.m2927l();
                    try {
                        cursorRawQuery = c8648l.m2395l().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    c1841l2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((C1841l) ((C13135l) C13718l.m3698l(C1841l.m1049volatile(), cursorRawQuery.getBlob(0))).amazon(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair2 = pairCreate;
                                        } catch (IOException e) {
                                            C8118l c8118l2 = c17417l2.f33950l;
                                            C17417l.admob(c8118l2);
                                            j = 0;
                                            try {
                                                c8118l2.f16908l.amazon("Failed to merge main event. appId, eventId", C8118l.m2260l(str), l, e);
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                C8118l c8118l3 = c17417l2.f33950l;
                                                C17417l.admob(c8118l3);
                                                c8118l3.f16908l.loadAd(e, "Error selecting main event");
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                pair = c1841l2;
                                                if (pair != 0) {
                                                }
                                                C8118l c8118l4 = c17417l.f33950l;
                                                C17417l.admob(c8118l4);
                                                c8118l4.f16909l.crashlytics(str2, l, "Extra parameter without existing main event. eventName, eventId");
                                                return c1841l2;
                                            }
                                            cursorRawQuery.close();
                                            pair = c1841l2;
                                        }
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        j = 0;
                                        C8118l c8118l5 = c17417l2.f33950l;
                                        C17417l.admob(c8118l5);
                                        c8118l5.f16908l.loadAd(e, "Error selecting main event");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        pair = c1841l2;
                                    }
                                } else {
                                    C8118l c8118l6 = c17417l2.f33950l;
                                    C17417l.admob(c8118l6);
                                    c8118l6.f16911l.yandex("Main event not found");
                                    cursorRawQuery.close();
                                    pair2 = null;
                                    c1841l2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorRawQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            c1841l2 = null;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        c1841l2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        C8118l c8118l7 = c17417l.f33950l;
                        C17417l.admob(c8118l7);
                        c8118l7.f16909l.crashlytics(str2, l, "Extra parameter without existing main event. eventName, eventId");
                        return c1841l2;
                    }
                    this.f1005l = (C1841l) obj;
                    this.f1006l = ((Long) pair.second).longValue();
                    c6901l2.m2113try();
                    this.f1004l = (Long) C13718l.m3697l("_eid", (C1841l) this.f1005l);
                } else {
                    j = 0;
                }
                long j2 = this.f1006l - 1;
                this.f1006l = j2;
                if (j2 <= j) {
                    C8648l c8648l2 = c6901l2.f14451l;
                    C6901l.m2082case(c8648l2);
                    C17417l c17417l3 = (C17417l) c8648l2.f833l;
                    c8648l2.mo211l();
                    C8118l c8118l8 = c17417l3.f33950l;
                    C17417l.admob(c8118l8);
                    c8118l8.f16911l.loadAd(str, "Clearing complex main event info. appId");
                    try {
                        c8648l2.m2395l().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        C8118l c8118l9 = c17417l3.f33950l;
                        C17417l.admob(c8118l9);
                        c8118l9.f16908l.loadAd(e6, "Error clearing complex main event");
                    }
                } else {
                    C8648l c8648l3 = c6901l2.f14451l;
                    C6901l.m2082case(c8648l3);
                    c8648l3.m2383l(str, l, this.f1006l, (C1841l) this.f1005l);
                }
                ArrayList arrayList = new ArrayList();
                for (C0420l c0420l : ((C1841l) this.f1005l).license()) {
                    c6901l2.m2113try();
                    if (C13718l.m3695l(c0420l.Signature(), c1841l) == null) {
                        arrayList.add(c0420l);
                    }
                }
                if (arrayList.isEmpty()) {
                    C8118l c8118l10 = c17417l.f33950l;
                    C17417l.admob(c8118l10);
                    c8118l10.f16909l.loadAd(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listLicense);
                    listLicense = arrayList;
                }
                strAdvert = str2;
            } else {
                this.f1004l = l;
                this.f1005l = c1841l;
                c6901l.m2113try();
                C0420l c0420lM3695l3 = C13718l.m3695l("_epc", c1841l);
                Serializable serializableM3702l = c0420lM3695l3 == null ? null : C13718l.m3702l(c0420lM3695l3);
                long jLongValue = ((Long) (serializableM3702l != null ? serializableM3702l : 0L)).longValue();
                this.f1006l = jLongValue;
                if (jLongValue <= 0) {
                    C8118l c8118l11 = c17417l.f33950l;
                    C17417l.admob(c8118l11);
                    c8118l11.f16909l.loadAd(strAdvert, "Complex event with zero extra param count. eventName");
                } else {
                    C8648l c8648l4 = c6901l.f14451l;
                    C6901l.m2082case(c8648l4);
                    c8648l4.m2383l(str, l, this.f1006l, c1841l);
                }
            }
        }
        C13135l c13135l = (C13135l) c1841l.firebase();
        c13135l.metrica(strAdvert);
        c13135l.loadAd();
        ((C1841l) c13135l.f20498l).m1055for();
        c13135l.loadAd();
        ((C1841l) c13135l.f20498l).m1054extends(listLicense);
        return (C1841l) c13135l.amazon();
    }

    @Override // defpackage.InterfaceC2257l
    public InterfaceC3999l billing(AbstractC6139l abstractC6139l) {
        C6067l c6067lRemoteconfig = abstractC6139l.remoteconfig();
        NativePointer nativePointer = (NativePointer) this.f1005l;
        long j = this.f1006l;
        InterfaceC1388l interfaceC1388l = (InterfaceC1388l) this.f1004l;
        C5501l c5501l = (C5501l) this.f1007l;
        NativePointer nativePointer2 = c6067lRemoteconfig.f12835l;
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer2).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return new C15825l(c6067lRemoteconfig, new LongPointerWrapper(realmcJNI.realm_results_resolve_in(ptr$cinterop_release, ptr$cinterop_release2), false, 2, null), j, interfaceC1388l, c5501l);
    }

    public int crashlytics(C13247l c13247l, long j) {
        TimeZone timeZone = AbstractC11432l.yandex;
        ArrayList arrayList = c13247l.startapp;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c13247l.crashlytics.yandex.admob + " was leaked. Did you forget to close a response body?";
                AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
                AbstractC16844l.yandex.isPro(((C13222l) reference).yandex, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    c13247l.adcel = j - this.f1006l;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    @Override // defpackage.InterfaceC17435l
    public boolean firebase(long j, C11379l c11379l, int i) {
        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) ((C6205l) this.f1004l).invoke();
        if (interfaceC18212l == null) {
            return false;
        }
        C11611l c11611l = (C11611l) this.f1007l;
        if (!interfaceC18212l.mopub()) {
            return false;
        }
        c11611l.amazon(interfaceC18212l, j, c11379l, false);
        this.f1006l = j;
        return AbstractC8548l.yandex(c11611l, ((Number) ((C6205l) this.f1005l).invoke()).longValue());
    }

    public void loadAd(C5071l c5071l, int i) {
        AbstractC5641l.loadAd(i >= 1 && i <= 7, "Invalid metering mode " + i);
        if ((i & 1) != 0) {
            ((ArrayList) this.f1005l).add(c5071l);
        }
        if ((i & 2) != 0) {
            ((ArrayList) this.f1004l).add(c5071l);
        }
    }

    @Override // defpackage.InterfaceC2257l
    public AbstractC6107l metrica(C12428l c12428l) {
        return new C2270l(c12428l, 4);
    }

    @Override // defpackage.InterfaceC17435l
    public boolean remoteconfig(long j, C11379l c11379l) {
        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) ((C6205l) this.f1004l).invoke();
        if (interfaceC18212l == null) {
            return true;
        }
        C11611l c11611l = (C11611l) this.f1007l;
        if (!interfaceC18212l.mopub() || !AbstractC8548l.yandex(c11611l, ((Number) ((C6205l) this.f1005l).invoke()).longValue())) {
            return false;
        }
        if (!c11611l.loadAd(interfaceC18212l, j, this.f1006l, c11379l, false)) {
            return true;
        }
        this.f1006l = j;
        return true;
    }

    @Override // defpackage.InterfaceC17435l
    public void subs() {
        ((C11611l) this.f1007l).crashlytics();
    }

    @Override // defpackage.InterfaceC17435l
    public boolean vip(long j) {
        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) ((C6205l) this.f1004l).invoke();
        if (interfaceC18212l == null) {
            return false;
        }
        C11611l c11611l = (C11611l) this.f1007l;
        if (!interfaceC18212l.mopub()) {
            return false;
        }
        if (c11611l.loadAd(interfaceC18212l, j, this.f1006l, C1461l.f3667l, false)) {
            this.f1006l = j;
        }
        return AbstractC8548l.yandex(c11611l, ((Number) ((C6205l) this.f1005l).invoke()).longValue());
    }

    @Override // defpackage.InterfaceC17435l
    public boolean yandex(long j) {
        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) ((C6205l) this.f1004l).invoke();
        if (interfaceC18212l == null) {
            return true;
        }
        C11611l c11611l = (C11611l) this.f1007l;
        if (!interfaceC18212l.mopub() || !AbstractC8548l.yandex(c11611l, ((Number) ((C6205l) this.f1005l).invoke()).longValue())) {
            return false;
        }
        if (!c11611l.loadAd(interfaceC18212l, j, this.f1006l, C1461l.f3667l, false)) {
            return true;
        }
        this.f1006l = j;
        return true;
    }

    public C0093l(File file, ParcelFileDescriptor parcelFileDescriptor, long j, Uri uri) {
        this.f1005l = file;
        this.f1004l = parcelFileDescriptor;
        this.f1006l = j;
        this.f1007l = uri;
    }

    public C0093l(NativePointer nativePointer, long j, InterfaceC1388l interfaceC1388l, C5501l c5501l) {
        this.f1005l = nativePointer;
        this.f1006l = j;
        this.f1004l = interfaceC1388l;
        this.f1007l = c5501l;
    }

    public C0093l(C3097l c3097l) {
        this.f1006l = 300000000000L;
        this.f1005l = c3097l.amazon();
        this.f1004l = new C5973l(this, AbstractC0653l.ads(new StringBuilder(), AbstractC11432l.loadAd, " ConnectionPool connection closer"));
        this.f1007l = new ConcurrentLinkedQueue();
    }

    public C0093l() {
        this.f1006l = 0L;
        this.f1007l = new C13601l();
    }

    public C0093l(C0093l c0093l) {
        this.f1005l = DesugarCollections.unmodifiableList((ArrayList) c0093l.f1005l);
        this.f1004l = DesugarCollections.unmodifiableList((ArrayList) c0093l.f1004l);
        this.f1007l = DesugarCollections.unmodifiableList((ArrayList) c0093l.f1007l);
        this.f1006l = c0093l.f1006l;
    }

    public C0093l(C5071l c5071l) {
        this.f1005l = new ArrayList();
        this.f1004l = new ArrayList();
        this.f1007l = new ArrayList();
        this.f1006l = 5000L;
        loadAd(c5071l, 1);
    }

    public C0093l(C6205l c6205l, C6205l c6205l2, C11611l c11611l) {
        this.f1005l = c6205l;
        this.f1004l = c6205l2;
        this.f1007l = c11611l;
        this.f1006l = 0L;
    }
}
