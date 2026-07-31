package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍؖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9334l {
    public static final C15578l yandex = new C15578l(478937230, false, new C3755l(28));
    public static final C15578l loadAd = new C15578l(-1644738313, false, new C3755l(29));
    public static final C15578l crashlytics = new C15578l(-83189779, false, new C2039l(8));

    static {
        new C15578l(-825320064, false, new C4606l(0));
    }

    public static String admob(Context context, Uri uri, String str) throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        Exception exc;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                        amazon(cursorQuery);
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    amazon(cursorQuery);
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e) {
                exc = e;
                Log.w("DocumentFile", "Failed query: " + exc);
                amazon(cursorQuery);
                return null;
            }
        } catch (Exception e2) {
            exc = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th = th3;
        }
        th = th2;
        amazon(cursorQuery);
        throw th;
    }

    public static void amazon(Cursor cursor) {
        if (cursor != null) {
            try {
                AbstractC9361l.applovin(cursor);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long billing(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{"_size"}, null, null, null);
            if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                return 0L;
            }
            return cursorQuery.getLong(0);
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return 0L;
        } finally {
            amazon(cursorQuery);
        }
        amazon(cursorQuery);
    }

    public static final void crashlytics(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbSignature = AbstractC0653l.Signature(j, "size=", " offset=");
            sbSignature.append(j2);
            sbSignature.append(" byteCount=");
            sbSignature.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbSignature.toString());
        }
    }

    public static final String firebase(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = AbstractC2632l.loadAd;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        return AbstractC16648l.startapp(cArr2, i2, 8);
    }

    public static final long isPro(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final boolean loadAd(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static C7893l mopub(C16936l c16936l, C10282l c10282l) {
        List listSingletonList;
        ArrayList<C17841l> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = c10282l.yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC9278l abstractC9278l = (AbstractC9278l) list.get(i);
            List list2 = abstractC9278l.yandex;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((abstractC9278l instanceof C3524l) && i2 == list2.size() / 2) {
                    arrayList2.add(new C8195l(abstractC9278l, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list2.get(i2));
            }
        }
        Float fValueOf = Float.valueOf(0.0f);
        int iBilling = AbstractC14055l.billing(arrayList, 9);
        if (iBilling == 0) {
            listSingletonList = Collections.singletonList(fValueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(iBilling + 1);
            arrayList3.add(fValueOf);
            for (C17841l c17841l : arrayList) {
                float fFloatValue = fValueOf.floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (C16936l.amazon(c17841l, Float.POSITIVE_INFINITY) & 4294967295L));
                if (fIntBitsToFloat < 0.0f) {
                    C8339l.metrica("Measured cubic is expected to be greater or equal to zero");
                    return null;
                }
                Unit unit = Unit.INSTANCE;
                fValueOf = Float.valueOf(fFloatValue + fIntBitsToFloat);
                arrayList3.add(fValueOf);
            }
            listSingletonList = arrayList3;
        }
        float fFloatValue2 = ((Number) AbstractC16901l.m4214continue(listSingletonList)).floatValue();
        C4974l c4974l = new C4974l(listSingletonList.size());
        int size3 = listSingletonList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            c4974l.yandex(((Number) listSingletonList.get(i3)).floatValue() / fFloatValue2);
        }
        C10227l c10227lAdmob = AbstractC14055l.admob();
        int size4 = arrayList2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            int iIntValue = ((Number) ((C8195l) arrayList2.get(i4)).f17097l).intValue();
            c10227lAdmob.add(new C11964l(AbstractC12481l.crashlytics((c4974l.loadAd(iIntValue + 1) + c4974l.loadAd(iIntValue)) / 2.0f), (AbstractC9278l) ((C8195l) arrayList2.get(i4)).f17098l));
        }
        return new C7893l(c16936l, AbstractC14055l.purchase(c10227lAdmob), arrayList, c4974l);
    }

    public static boolean purchase(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return false;
        } finally {
            amazon(cursorQuery);
        }
    }

    public static final int subs(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final void yandex(C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        C10327l c10327l = C10327l.isPro;
        long j = c6956l.f14595continue;
        int i = (int) (j ^ (j >>> 32));
        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
        InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
        InterfaceC8801l.firebase.getClass();
        C16395l c16395l = C3438l.loadAd;
        c6956l.m2140super();
        if (c6956l.f14603switch) {
            c6956l.firebase(c16395l);
        } else {
            c6956l.m2136protected();
        }
        AbstractC8182l.billing(c6956l, c10327l, C3438l.mopub);
        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
        AbstractC8182l.purchase(c6956l, C3438l.firebase);
        AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
        AbstractC8182l.billing(c6956l, Integer.valueOf(i), C3438l.isPro);
        c6956l.startapp(true);
    }
}
