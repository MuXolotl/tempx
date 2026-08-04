package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: renamed from: lِٛ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11963l extends AbstractC18433l {
    public long applovin;
    public final C10834l appmetrica;
    public final C10834l inmobi;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C10834l f23836package;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final C10834l f23837strictfp;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C10834l f23838synchronized;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C10834l f23839throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public C7945l f23840volatile;

    public C11963l(Context context, Looper looper, C1424l c1424l, C3714l c3714l, C3714l c3714l2) {
        super(context, looper, 54, c1424l, c3714l, c3714l2);
        this.appmetrica = new C10834l(0);
        this.inmobi = new C10834l(0);
        this.f23839throws = new C10834l(0);
        this.f23836package = new C10834l(0);
        this.f23838synchronized = new C10834l(0);
        this.f23837strictfp = new C10834l(0);
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            Log.e("NearbyConnections", "Cannot set null temp directory");
        } else {
            AbstractC16814l.loadAd = cacheDir;
        }
    }

    public static Status appmetrica(int i) {
        String strBilling;
        if (i == 8025) {
            strBilling = "MISSING_SETTING_LOCATION_MUST_BE_ON";
        } else if (i != 8050) {
            switch (i) {
                case 8000:
                    strBilling = "STATUS_NETWORK_NOT_CONNECTED";
                    break;
                case 8001:
                    strBilling = "STATUS_ALREADY_ADVERTISING";
                    break;
                case 8002:
                    strBilling = "STATUS_ALREADY_DISCOVERING";
                    break;
                case 8003:
                    strBilling = "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";
                    break;
                case 8004:
                    strBilling = "STATUS_CONNECTION_REJECTED";
                    break;
                case 8005:
                    strBilling = "STATUS_NOT_CONNECTED_TO_ENDPOINT";
                    break;
                case 8006:
                    strBilling = "STATUS_CAN_NOT_OBTAIN_DEVICE_PROVIDER";
                    break;
                case 8007:
                    strBilling = "STATUS_RADIO_ERROR";
                    break;
                case 8008:
                    strBilling = "STATUS_ALREADY_HAVE_ACTIVE_STRATEGY";
                    break;
                case 8009:
                    strBilling = "STATUS_OUT_OF_ORDER_API_CALL";
                    break;
                case 8010:
                    strBilling = "STATUS_UNSUPPORTED_PAYLOAD_TYPE_FOR_STRATEGY";
                    break;
                case 8011:
                    strBilling = "STATUS_ENDPOINT_UNKNOWN";
                    break;
                case 8012:
                    strBilling = "STATUS_ENDPOINT_IO_ERROR";
                    break;
                case 8013:
                    strBilling = "STATUS_PAYLOAD_IO_ERROR";
                    break;
                case 8014:
                    strBilling = "STATUS_PAYLOAD_UNKNOWN";
                    break;
                case 8015:
                    strBilling = "STATUS_ALREADY_LISTENING";
                    break;
                case 8016:
                    strBilling = "STATUS_AUTH_ERROR";
                    break;
                default:
                    switch (i) {
                        case 8029:
                            strBilling = "MISSING_PERMISSION_NEARBY_WIFI_DEVICES";
                            break;
                        case 8030:
                            strBilling = "MISSING_PERMISSION_BLUETOOTH";
                            break;
                        case 8031:
                            strBilling = "MISSING_PERMISSION_BLUETOOTH_ADMIN";
                            break;
                        case 8032:
                            strBilling = "MISSING_PERMISSION_ACCESS_WIFI_STATE";
                            break;
                        case 8033:
                            strBilling = "MISSING_PERMISSION_CHANGE_WIFI_STATE";
                            break;
                        case 8034:
                            strBilling = "MISSING_PERMISSION_ACCESS_COARSE_LOCATION";
                            break;
                        case 8035:
                            strBilling = "MISSING_PERMISSION_RECORD_AUDIO";
                            break;
                        case 8036:
                            strBilling = "MISSING_PERMISSION_ACCESS_FINE_LOCATION";
                            break;
                        case 8037:
                            strBilling = "MISSING_PERMISSION_BLUETOOTH_SCAN";
                            break;
                        case 8038:
                            strBilling = "MISSING_PERMISSION_BLUETOOTH_ADVERTISE";
                            break;
                        case 8039:
                            strBilling = "MISSING_PERMISSION_BLUETOOTH_CONNECT";
                            break;
                        default:
                            strBilling = AbstractC13766l.billing(i);
                            break;
                    }
                    break;
            }
        } else {
            strBilling = "API_CONNECTION_FAILED_ALREADY_IN_USE";
        }
        return new Status(i, strBilling, null, null);
    }

    @Override // defpackage.AbstractC4620l
    public final void Signature(IInterface iInterface) {
        System.currentTimeMillis();
        this.f23840volatile = new C7945l();
    }

    @Override // defpackage.AbstractC4620l
    public final String adcel() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // defpackage.AbstractC4620l
    public final boolean advert() {
        return true;
    }

    @Override // defpackage.AbstractC4620l
    public final void billing() {
        if (subscription()) {
            try {
                C13452l c13452l = (C13452l) metrica();
                Parcel parcelM743l = c13452l.m743l();
                int i = AbstractC14866l.yandex;
                parcelM743l.writeInt(1);
                AbstractC9968l.Signature(parcelM743l, AbstractC9968l.tapsense(parcelM743l, 20293));
                c13452l.m742l(parcelM743l, 2011);
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        inmobi();
        super.billing();
    }

    public final void inmobi() {
        C10834l c10834l = this.appmetrica;
        c10834l.getClass();
        C11786l c11786l = new C11786l(c10834l);
        while (c11786l.hasNext()) {
            BinderC15733l binderC15733l = (BinderC15733l) c11786l.next();
            synchronized (binderC15733l) {
                try {
                    C10834l c10834l2 = binderC15733l.mopub;
                    c10834l2.getClass();
                    C11786l c11786l2 = new C11786l(c10834l2);
                    while (c11786l2.hasNext()) {
                        binderC15733l.billing.yandex(new C9952l((String) c11786l2.next(), 2));
                    }
                    binderC15733l.mopub.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C10834l c10834l3 = this.inmobi;
        c10834l3.getClass();
        C11786l c11786l3 = new C11786l(c10834l3);
        if (c11786l3.hasNext()) {
            c11786l3.next().getClass();
            C18725l.loadAd();
            return;
        }
        C10834l c10834l4 = this.f23839throws;
        c10834l4.getClass();
        C11786l c11786l4 = new C11786l(c10834l4);
        while (c11786l4.hasNext()) {
            ((InterfaceC12038l) c11786l4.next()).amazon();
        }
        C10834l c10834l5 = this.f23836package;
        c10834l5.getClass();
        C11786l c11786l5 = new C11786l(c10834l5);
        while (c11786l5.hasNext()) {
            ((InterfaceC12038l) c11786l5.next()).amazon();
        }
        C10834l c10834l6 = this.f23838synchronized;
        c10834l6.getClass();
        C11786l c11786l6 = new C11786l(c10834l6);
        while (c11786l6.hasNext()) {
            ((InterfaceC12038l) c11786l6.next()).amazon();
        }
        C10834l c10834l7 = this.f23837strictfp;
        c10834l7.getClass();
        C11786l c11786l7 = new C11786l(c10834l7);
        while (c11786l7.hasNext()) {
            ((InterfaceC12038l) c11786l7.next()).amazon();
        }
        this.appmetrica.clear();
        this.inmobi.clear();
        this.f23839throws.clear();
        this.f23836package.clear();
        this.f23838synchronized.clear();
        this.f23837strictfp.clear();
        C7945l c7945l = this.f23840volatile;
        if (c7945l != null) {
            c7945l.crashlytics();
            this.f23840volatile = null;
        }
    }

    @Override // defpackage.AbstractC4620l
    public final int loadAd() {
        return 12451000;
    }

    @Override // defpackage.AbstractC4620l
    public final void pro(int i) {
        if (i == 1) {
            inmobi();
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.AbstractC4620l
    public final IInterface purchase(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return iInterfaceQueryLocalInterface instanceof C13452l ? (C13452l) iInterfaceQueryLocalInterface : new C13452l(iBinder, "com.google.android.gms.nearby.internal.connection.INearbyConnectionService", 4);
    }

    @Override // defpackage.AbstractC4620l
    public final Bundle smaato() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.applovin);
        return bundle;
    }

    @Override // defpackage.AbstractC4620l
    public final String startapp() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // defpackage.AbstractC4620l
    public final C9138l[] subs() {
        return new C9138l[]{AbstractC11621l.crashlytics, AbstractC11621l.billing, AbstractC11621l.isPro, AbstractC11621l.admob, AbstractC11621l.firebase, AbstractC11621l.mopub, AbstractC11621l.amazon, AbstractC11621l.subs, AbstractC11621l.purchase, AbstractC11621l.smaato};
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x0119 A[Catch: all -> 0x0124, TryCatch #4 {all -> 0x0124, blocks: (B:79:0x010f, B:81:0x0119, B:84:0x0126), top: B:100:0x010f }] */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x00f6, please report this as an issue */
    @Override // defpackage.AbstractC4620l, defpackage.InterfaceC1168l
    public final boolean yandex() {
        Object obj;
        String str;
        Boolean bool;
        String string;
        HashMap map;
        Context context = this.crashlytics;
        boolean z = true;
        if (((Context) C16797l.yandex(context).yandex).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) {
            return true;
        }
        ContentResolver contentResolver = context.getContentResolver();
        C15615l c15615l = AbstractC3579l.yandex;
        c15615l.getClass();
        if (contentResolver == null) {
            C8339l.smaato("ContentResolver needed with GservicesDelegateSupplier.init()");
            return false;
        }
        synchronized (c15615l) {
            try {
                c15615l.inmobi(contentResolver);
                obj = c15615l.f30482l;
                HashMap map2 = (HashMap) c15615l.f30480l;
                Object obj2 = Boolean.TRUE;
                str = null;
                if (map2.containsKey("gms:nearby:requires_gms_check")) {
                    Object obj3 = map2.get("gms:nearby:requires_gms_check");
                    if (obj3 != null) {
                        obj2 = obj3;
                    }
                } else {
                    obj2 = null;
                }
                bool = (Boolean) obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (c15615l) {
            try {
                c15615l.inmobi(contentResolver);
                Object obj4 = c15615l.f30482l;
                if (((HashMap) c15615l.f30483l).containsKey("gms:nearby:requires_gms_check")) {
                    String str2 = (String) ((HashMap) c15615l.f30483l).get("gms:nearby:requires_gms_check");
                    if (str2 != null) {
                        str = str2;
                    }
                } else {
                    try {
                        Cursor cursorQuery = contentResolver.query(AbstractC4586l.yandex, null, null, new String[]{"gms:nearby:requires_gms_check"}, null);
                        try {
                            if (cursorQuery == null) {
                                throw new C3028l("Failed to connect to GservicesProvider");
                            }
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(1);
                                cursorQuery.close();
                            } else {
                                cursorQuery.close();
                                string = null;
                            }
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (c15615l) {
                                try {
                                    if (obj4 == c15615l.f30482l) {
                                        ((HashMap) c15615l.f30483l).put("gms:nearby:requires_gms_check", string);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (string != null) {
                                str = string;
                            }
                        } catch (Throwable th3) {
                            if (cursorQuery == null) {
                                throw th3;
                            }
                            try {
                                cursorQuery.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                            if (str != null) {
                                if (AbstractC4586l.loadAd.matcher(str).matches()) {
                                    bool = Boolean.TRUE;
                                } else if (AbstractC4586l.crashlytics.matcher(str).matches()) {
                                    bool = Boolean.FALSE;
                                    z = false;
                                } else {
                                    Log.w("Gservices", "attempt to read Gservices key gms:nearby:requires_gms_check (value \"" + str + "\") as boolean");
                                }
                            }
                            synchronized (c15615l) {
                                try {
                                    map = (HashMap) c15615l.f30480l;
                                    if (obj == c15615l.f30482l) {
                                        map.put("gms:nearby:requires_gms_check", bool);
                                        ((HashMap) c15615l.f30483l).remove("gms:nearby:requires_gms_check");
                                    }
                                    return z;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    } catch (C3028l unused) {
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        if (str != null && !str.isEmpty()) {
            if (AbstractC4586l.loadAd.matcher(str).matches()) {
                bool = Boolean.TRUE;
            } else if (AbstractC4586l.crashlytics.matcher(str).matches()) {
                bool = Boolean.FALSE;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read Gservices key gms:nearby:requires_gms_check (value \"" + str + "\") as boolean");
            }
        }
        synchronized (c15615l) {
            map = (HashMap) c15615l.f30480l;
            if (obj == c15615l.f30482l) {
                map.put("gms:nearby:requires_gms_check", bool);
                ((HashMap) c15615l.f30483l).remove("gms:nearby:requires_gms_check");
            }
        }
        return z;
    }
}
