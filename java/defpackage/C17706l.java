package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.IInterface;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.isPro;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.utils.billing;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: l٘ؗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C17706l implements InterfaceC1953l, InterfaceC16975l, InterfaceC12350l, InterfaceC18044l, InterfaceC9746l, InterfaceC6610l, InterfaceC7456l, InterfaceC11724l, InterfaceC0945l, InterfaceC0119l, InterfaceC18679l, InterfaceC2792l, InterfaceC0407l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f34500l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f34501l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34502l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f34503l;

    public /* synthetic */ C17706l(C5597l c5597l, C13071l c13071l, C2040l c2040l, IOException iOException, boolean z) {
        this.f34502l = 1;
        this.f34501l = c5597l;
        this.f34500l = c2040l;
        this.f34503l = iOException;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        C13698l c13698l = (C13698l) this.f34501l;
        ((InterfaceC4784l) obj).crashlytics(c13698l.f26744l, (C5019l) this.f34500l, (C2040l) this.f34503l);
    }

    @Override // defpackage.InterfaceC2792l
    public void admob(C13808l c13808l) {
        AbstractC12694l abstractC12694l;
        C7026l c7026l = (C7026l) this.f34501l;
        InterfaceC18690l interfaceC18690l = (InterfaceC18690l) this.f34500l;
        C15691l c15691l = (C15691l) this.f34503l;
        C7591l c7591l = (C7591l) c7026l.f14720l;
        AbstractC5088l.yandex("PreviewView", "Preview transformation info updated. " + c13808l);
        boolean z = interfaceC18690l.adcel().metrica() == 0;
        C8788l c8788l = c7591l.f15605l;
        Size size = c15691l.loadAd;
        c8788l.getClass();
        AbstractC5088l.yandex("PreviewTransform", "Transformation info set: " + c13808l + " " + size + " " + z);
        c8788l.billing = c13808l.yandex;
        c8788l.yandex = c13808l.loadAd;
        int i = c13808l.crashlytics;
        c8788l.loadAd = i;
        c8788l.purchase = size;
        c8788l.crashlytics = z;
        c8788l.amazon = c13808l.amazon;
        c8788l.mopub = c13808l.purchase;
        if (i == -1 || ((abstractC12694l = c7591l.f15600l) != null && (abstractC12694l instanceof C14439l))) {
            c7591l.f15604l = true;
        } else {
            c7591l.f15604l = false;
        }
        c7591l.loadAd();
    }

    @Override // defpackage.InterfaceC0407l
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        C16163l c16163l;
        EnumC4628l enumC4628l;
        int i = this.f34502l;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        EnumC4628l enumC4628l2 = EnumC4628l.CACHE_FULL;
        int i6 = 2;
        Object obj2 = this.f34503l;
        Object obj3 = this.f34500l;
        Object obj4 = this.f34501l;
        int i7 = 0;
        int i8 = 1;
        switch (i) {
            case 16:
                C16163l c16163l2 = (C16163l) obj4;
                C10555l c10555l = (C10555l) obj3;
                C3385l c3385l = c10555l.crashlytics;
                String str = c10555l.yandex;
                C4330l c4330l = (C4330l) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = c16163l2.yandex().compileStatement("PRAGMA page_size").simpleQueryForLong() * c16163l2.yandex().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C17964l c17964l = c16163l2.f31662l;
                if (jSimpleQueryForLong >= c17964l.yandex) {
                    c16163l2.adcel(1L, enumC4628l2, str);
                    return -1L;
                }
                Long lBilling = C16163l.billing(sQLiteDatabase, c4330l);
                if (lBilling != null) {
                    jInsert = lBilling.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c4330l.yandex);
                    contentValues.put("priority", Integer.valueOf(AbstractC8542l.yandex(c4330l.crashlytics)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c4330l.loadAd;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = c17964l.purchase;
                byte[] bArr2 = c3385l.loadAd;
                boolean z = bArr2.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(c10555l.amazon));
                contentValues2.put("uptime_ms", Long.valueOf(c10555l.purchase));
                contentValues2.put("payload_encoding", c3385l.yandex.yandex);
                contentValues2.put("code", c10555l.loadAd);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", c10555l.mopub);
                contentValues2.put("pseudonymous_id", c10555l.admob);
                contentValues2.put("experiment_ids_clear_blob", c10555l.subs);
                contentValues2.put("experiment_ids_encrypted_blob", c10555l.isPro);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i9));
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(c10555l.billing).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C16163l c16163l3 = (C16163l) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                C4330l c4330l2 = (C4330l) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i11 = cursor2.getInt(7) != 0 ? i8 : 0;
                    C18289l c18289l = new C18289l(i8);
                    c18289l.mopub = new HashMap();
                    String string = cursor2.getString(i8);
                    if (string == null) {
                        C6541l.subs("Null transportName");
                        return null;
                    }
                    c18289l.loadAd = string;
                    c18289l.purchase = Long.valueOf(cursor2.getLong(i6));
                    c18289l.billing = Long.valueOf(cursor2.getLong(3));
                    if (i11 != 0) {
                        String string2 = cursor2.getString(4);
                        c18289l.amazon = new C3385l(string2 == null ? C16163l.f31657l : new C7017l(string2), cursor2.getBlob(5));
                        c16163l = c16163l3;
                    } else {
                        String string3 = cursor2.getString(4);
                        C7017l c7017l = string3 == null ? C16163l.f31657l : new C7017l(string3);
                        Cursor cursorQuery = c16163l3.yandex().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i12 = 0;
                            int length2 = 0;
                            while (i12 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i12);
                                C16163l c16163l4 = c16163l3;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i12++;
                                    cursorQuery = cursor;
                                    c16163l3 = c16163l4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            c16163l = c16163l3;
                            cursorQuery.close();
                            c18289l.amazon = new C3385l(c7017l, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c18289l.crashlytics = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        c18289l.admob = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        c18289l.subs = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        c18289l.isPro = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        c18289l.firebase = cursor2.getBlob(11);
                    }
                    arrayList.add(new C6468l(j, c4330l2, c18289l.crashlytics()));
                    c16163l3 = c16163l;
                    i6 = 2;
                    i8 = 1;
                }
                return null;
            default:
                C16163l c16163l5 = (C16163l) obj4;
                HashMap map = (HashMap) obj3;
                C12014l c12014l = (C12014l) obj2;
                ArrayList arrayList3 = (ArrayList) c12014l.f23944l;
                Cursor cursor3 = (Cursor) obj;
                c16163l5.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i7);
                    int i13 = cursor3.getInt(1);
                    EnumC4628l enumC4628l3 = EnumC4628l.REASON_UNKNOWN;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            enumC4628l3 = EnumC4628l.MESSAGE_TOO_OLD;
                        } else if (i13 == 2) {
                            enumC4628l = enumC4628l2;
                        } else if (i13 == i5) {
                            enumC4628l3 = EnumC4628l.PAYLOAD_TOO_BIG;
                        } else if (i13 == i4) {
                            enumC4628l3 = EnumC4628l.MAX_RETRIES_REACHED;
                        } else if (i13 == i3) {
                            enumC4628l3 = EnumC4628l.INVALID_PAYLOD;
                        } else if (i13 == i2) {
                            enumC4628l3 = EnumC4628l.SERVER_ERROR;
                        } else {
                            AbstractC2991l.subs("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i13));
                        }
                        enumC4628l = enumC4628l3;
                    } else {
                        enumC4628l = enumC4628l3;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new C13062l(j2, enumC4628l));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i7 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i14 = C9291l.crashlytics;
                    new ArrayList();
                    arrayList3.add(new C9291l((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long jAdmob = c16163l5.f31659l.admob();
                SQLiteDatabase sQLiteDatabaseYandex = c16163l5.yandex();
                sQLiteDatabaseYandex.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseYandex.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        C7873l c7873l = new C7873l(cursorRawQuery.getLong(0), jAdmob);
                        cursorRawQuery.close();
                        sQLiteDatabaseYandex.setTransactionSuccessful();
                        sQLiteDatabaseYandex.endTransaction();
                        c12014l.f23940l = c7873l;
                        c12014l.f23943l = new C14642l(new C5677l(c16163l5.yandex().compileStatement("PRAGMA page_size").simpleQueryForLong() * c16163l5.yandex().compileStatement("PRAGMA page_count").simpleQueryForLong(), C17964l.billing.yandex));
                        c12014l.f23941l = (String) c16163l5.f31661l.get();
                        return new C8724l((C7873l) c12014l.f23940l, DesugarCollections.unmodifiableList(arrayList3), (C14642l) c12014l.f23943l, (String) c12014l.f23941l);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseYandex.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        C13208l c13208l = (C13208l) this.f34501l;
        interfaceC4725l.vip(c13208l.crashlytics, i, (String) this.f34500l, ((C1673l) this.f34503l).crashlytics());
    }

    @Override // defpackage.InterfaceC6610l
    public Object call() {
        C15858l c15858l;
        int i = this.f34502l;
        Object obj = this.f34503l;
        Object obj2 = this.f34500l;
        Object obj3 = this.f34501l;
        switch (i) {
            case 5:
                String str = (String) obj2;
                InterfaceC1082l interfaceC1082l = (InterfaceC1082l) obj;
                IInterface iInterfaceYandex = ((isPro) obj3).yandex("app");
                if (iInterfaceYandex != null) {
                    interfaceC1082l.firebase(iInterfaceYandex);
                } else {
                    Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call ".concat(str));
                }
                break;
            case 14:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) obj3;
                String str2 = (String) obj;
                if (obj2 == null) {
                    c15858l = null;
                } else {
                    try {
                        c15858l = new C15858l(obj2);
                    } catch (C9954l e) {
                        billing.billing(iOnDoneCallback, str2, e);
                        return null;
                    }
                }
                iOnDoneCallback.onSuccess(c15858l);
                break;
            default:
                String str3 = (String) obj;
                try {
                    ((IOnDoneCallback) obj3).onFailure(new C15858l(new FailureResponse((Exception) obj2)));
                } catch (C9954l e2) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str3), e2);
                }
                break;
        }
        return null;
    }

    @Override // defpackage.InterfaceC0119l
    public void crashlytics(C6499l c6499l) {
        C13350l c13350l = (C13350l) this.f34501l;
        c13350l.admob.tapsense(c6499l, (C12417l) this.f34500l, (Bundle) this.f34503l);
    }

    @Override // defpackage.InterfaceC7456l
    /* JADX INFO: renamed from: default */
    public Object mo672default(C5807l c5807l) {
        int i = this.f34502l;
        Object obj = this.f34503l;
        Object obj2 = this.f34500l;
        Object obj3 = this.f34501l;
        switch (i) {
            case 6:
                String str = (String) obj2;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                c5807l.yandex(new RunnableC16663l(atomicBoolean, 0), EnumC13705l.f26759l);
                ((Executor) obj3).execute(new RunnableC10364l(atomicBoolean, c5807l, (Function0) obj, 0));
                return str;
            default:
                C12158l c12158l = (C12158l) obj3;
                C15691l c15691l = (C15691l) obj2;
                C5274l c5274l = (C5274l) obj;
                try {
                    C11983l c11983l = (C11983l) c12158l.purchase;
                    Executor executor = (Executor) c12158l.crashlytics;
                    int i2 = c15691l.mopub;
                    c11983l.getClass();
                    C7025l c7025l = new C7025l(executor, c5274l, i2);
                    InterfaceC0049l interfaceC0049l = c7025l.billing;
                    c12158l.billing = c7025l;
                    if (interfaceC0049l instanceof C14315l) {
                        Surface surfaceYandex = ((C14315l) interfaceC0049l).yandex();
                        c12158l.mopub = surfaceYandex;
                        AbstractC5088l.yandex("VideoEncoderSession", "provide surface: " + surfaceYandex);
                        c15691l.yandex(surfaceYandex, (Executor) c12158l.amazon, new C10927l(3, c12158l));
                        c12158l.loadAd = 4;
                        c5807l.loadAd((C7025l) c12158l.billing);
                    } else {
                        c5807l.amazon(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
                    }
                } catch (C8104l e) {
                    AbstractC5088l.amazon("VideoEncoderSession", "Unable to initialize video encoder.", e);
                    c5807l.amazon(e);
                }
                return "ConfigureVideoEncoderFuture " + c12158l;
        }
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        int i = this.f34502l;
        Object obj2 = this.f34503l;
        Object obj3 = this.f34500l;
        Object obj4 = this.f34501l;
        switch (i) {
            case 1:
                ((InterfaceC5252l) obj).admob((C5597l) obj4, (C2040l) obj3, (IOException) obj2);
                break;
            default:
                ((InterfaceC13521l) obj).firebase(((C1908l) ((C1424l) obj4).f3603l).crashlytics.yandex, ((C1908l) ((C1424l) obj3).f3603l).crashlytics.yandex, ((Integer) obj2).intValue());
                break;
        }
    }

    @Override // defpackage.InterfaceC0945l
    public void mopub(InterfaceC3270l interfaceC3270l, int i) {
        boolean zYandex;
        C3726l c3726l = (C3726l) this.f34501l;
        String str = (String) this.f34500l;
        C17425l c17425l = (C17425l) this.f34503l;
        synchronized (c3726l) {
            zYandex = c3726l.f7787synchronized.yandex(interfaceC3270l, str);
        }
        if (zYandex) {
            interfaceC3270l.metrica(i, c17425l, str);
        }
    }

    @Override // defpackage.InterfaceC12350l
    public Object purchase() {
        C5379l c5379l = (C5379l) this.f34501l;
        C4330l c4330l = (C4330l) this.f34500l;
        C10555l c10555l = (C10555l) this.f34503l;
        C16163l c16163l = c5379l.amazon;
        c16163l.getClass();
        EnumC14251l enumC14251l = c4330l.crashlytics;
        String str = c10555l.yandex;
        String str2 = c4330l.yandex;
        String strRemoteconfig = AbstractC2991l.remoteconfig("SQLiteEventStore");
        if (Log.isLoggable(strRemoteconfig, 3)) {
            Log.d(strRemoteconfig, "Storing event with priority=" + enumC14251l + ", name=" + str + " for destination " + str2);
        }
        ((Long) c16163l.mopub(new C17706l(c16163l, c10555l, c4330l, 16))).getClass();
        c5379l.yandex.m2883strictfp(c4330l, 1, false);
        return null;
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) {
        C2350l c2350l = (C2350l) this.f34501l;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f34500l;
        C1770l c1770l = (C1770l) this.f34503l;
        if (c3823l.smaato()) {
            c2350l.amazon(c3823l.isPro());
        } else if (c3823l.subs() != null) {
            c2350l.crashlytics(c3823l.subs());
        } else if (atomicBoolean.getAndSet(true)) {
            c1770l.purchase();
        }
        return AbstractC4311l.mopub(null);
    }

    @Override // defpackage.InterfaceC18044l
    public C13708l subs(int i, C11916l c11916l, int[] iArr) {
        C9205l c9205l = (C9205l) this.f34501l;
        String str = (String) this.f34500l;
        String str2 = (String) this.f34503l;
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        for (int i2 = 0; i2 < c11916l.yandex; i2++) {
            c16971lMetrica.crashlytics(new C6949l(i, c11916l, i2, c9205l, iArr[i2], str, str2));
        }
        return c16971lMetrica.mopub();
    }

    @Override // defpackage.InterfaceC9746l
    public C3823l vip(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f34501l;
        String str = (String) this.f34500l;
        C8043l c8043l = (C8043l) this.f34503l;
        String str2 = (String) obj;
        C5138l c5138lCrashlytics = FirebaseMessaging.crashlytics(firebaseMessaging.loadAd);
        C14184l c14184l = firebaseMessaging.yandex;
        c14184l.yandex();
        String strAmazon = "[DEFAULT]".equals(c14184l.loadAd) ? "" : c14184l.amazon();
        String strCrashlytics = firebaseMessaging.admob.crashlytics();
        synchronized (c5138lCrashlytics) {
            String strAdmob = C8043l.admob(System.currentTimeMillis(), str2, strCrashlytics);
            if (strAdmob != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) c5138lCrashlytics.f11181l).edit();
                editorEdit.putString(strAmazon + "|T|" + str + "|*", strAdmob);
                editorEdit.commit();
            }
        }
        if (c8043l == null || !str2.equals((String) c8043l.f16742l)) {
            C14184l c14184l2 = firebaseMessaging.yandex;
            c14184l2.yandex();
            if ("[DEFAULT]".equals(c14184l2.loadAd)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    c14184l2.yandex();
                    sb.append(c14184l2.loadAd);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new C18595l(firebaseMessaging.loadAd).pro(intent);
            }
        }
        return AbstractC4311l.mopub(str2);
    }

    public void yandex() {
        C7026l c7026l = (C7026l) this.f34501l;
        C10970l c10970l = (C10970l) this.f34500l;
        InterfaceC18690l interfaceC18690l = (InterfaceC18690l) this.f34503l;
        AtomicReference atomicReference = ((C7591l) c7026l.f14720l).f15598l;
        do {
            if (atomicReference.compareAndSet(c10970l, null)) {
                c10970l.loadAd(EnumC7384l.f15311l);
                break;
            }
        } while (atomicReference.get() == c10970l);
        C15815l c15815l = c10970l.purchase;
        if (c15815l != null) {
            c15815l.cancel(false);
            c10970l.purchase = null;
        }
        interfaceC18690l.yandex().remoteconfig(c10970l);
    }

    public /* synthetic */ C17706l(Object obj, Object obj2, Object obj3, int i) {
        this.f34502l = i;
        this.f34501l = obj;
        this.f34500l = obj2;
        this.f34503l = obj3;
    }
}
