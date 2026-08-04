package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lٌؕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3285l extends AbstractBinderC5395l {
    public final /* synthetic */ int billing = 3;
    public final /* synthetic */ Object mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3285l(C0189l c0189l) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 2);
        this.mopub = c0189l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lٕؓۡ */
    public final boolean mo1129l(int i, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i2 = this.billing;
        Object obj = this.mopub;
        int i3 = 1;
        switch (i2) {
            case 0:
                AbstractC11229l abstractC11229l = (AbstractC11229l) obj;
                switch (i) {
                    case 1:
                        BinderC14844l binderC14844l = new BinderC14844l(abstractC11229l);
                        parcel2.writeNoException();
                        AbstractC14627l.crashlytics(parcel2, binderC14844l);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) AbstractC14627l.yandex(parcel, Bundle.CREATOR);
                        AbstractC14627l.amazon(parcel);
                        ((C0189l) abstractC11229l).billing(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) AbstractC14627l.yandex(parcel, Bundle.CREATOR);
                        AbstractC14627l.amazon(parcel);
                        ((C0189l) abstractC11229l).billing(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i4 = AbstractC14627l.yandex;
                        int i5 = parcel.readInt() != 0 ? 1 : 0;
                        AbstractC14627l.amazon(parcel);
                        C0189l c0189l = (C0189l) abstractC11229l;
                        InterfaceC2695l interfaceC2695l = c0189l.purchase;
                        if (interfaceC2695l != null) {
                            try {
                                C17513l c17513l = (C17513l) interfaceC2695l;
                                Parcel parcelM743l = c17513l.m743l();
                                parcelM743l.writeInt(i5);
                                parcelM743l.writeInt(0);
                                c17513l.m741l(parcelM743l, 6);
                            } catch (RemoteException e) {
                                C0189l.remoteconfig.yandex(e, "Unable to call %s on %s.", "disconnectFromDevice", InterfaceC2695l.class.getSimpleName());
                            }
                            c0189l.yandex(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        C0189l c0189l2 = (C0189l) abstractC11229l;
                        c0189l2.getClass();
                        AbstractC1051l.purchase("Must be called from the main thread.");
                        C17186l c17186l = c0189l2.isPro;
                        long jPurchase = c17186l == null ? 0L : c17186l.purchase() - c0189l2.isPro.yandex();
                        parcel2.writeNoException();
                        parcel2.writeLong(jPurchase);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) AbstractC14627l.yandex(parcel, Bundle.CREATOR);
                        AbstractC14627l.amazon(parcel);
                        C0189l c0189l3 = (C0189l) abstractC11229l;
                        c0189l3.getClass();
                        c0189l3.firebase = CastDevice.billing(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) AbstractC14627l.yandex(parcel, Bundle.CREATOR);
                        AbstractC14627l.amazon(parcel);
                        C0189l c0189l4 = (C0189l) abstractC11229l;
                        c0189l4.getClass();
                        c0189l4.firebase = CastDevice.billing(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) AbstractC14627l.yandex(parcel, Bundle.CREATOR);
                        AbstractC14627l.amazon(parcel);
                        C0189l c0189l5 = (C0189l) abstractC11229l;
                        c0189l5.getClass();
                        CastDevice castDeviceBilling = CastDevice.billing(bundle5);
                        if (castDeviceBilling != null) {
                            String str = castDeviceBilling.f532l;
                            if (!castDeviceBilling.equals(c0189l5.firebase)) {
                                byte b = !TextUtils.isEmpty(str) && ((castDevice2 = c0189l5.firebase) == null || !TextUtils.equals(castDevice2.f532l, str));
                                c0189l5.firebase = castDeviceBilling;
                                C0189l.remoteconfig.loadAd("update to device (%s) with name %s", castDeviceBilling, true != b ? "unchanged" : "changed");
                                if (b != false && (castDevice = c0189l5.firebase) != null) {
                                    C9937l c9937l = c0189l5.admob;
                                    if (c9937l != null) {
                                        C0022l c0022l = C9937l.license;
                                        Log.i(c0022l.yandex, c0022l.amazon("update Cast device to %s", castDevice));
                                        c9937l.metrica = castDevice;
                                        c9937l.loadAd();
                                    }
                                    Iterator it = new HashSet(c0189l5.amazon).iterator();
                                    while (it.hasNext()) {
                                        ((C1021l) it.next()).getClass();
                                    }
                                    C7214l c7214l = c0189l5.smaato;
                                    if (c7214l != null) {
                                        ((C3557l) c7214l.f15044l).isPro().Signature++;
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                    default:
                        return false;
                }
                return true;
            case 1:
                C15318l c15318l = (C15318l) obj;
                if (i == 1) {
                    String string = parcel.readString();
                    AbstractC14627l.amazon(parcel);
                    c15318l.getClass();
                    Context context = c15318l.yandex;
                    String str2 = c15318l.loadAd;
                    Context context2 = c15318l.yandex;
                    C12100l c12100l = c15318l.amazon;
                    BinderC2728l binderC2728l = c15318l.purchase;
                    InterfaceC3396l interfaceC3396lCrashlytics = new C0189l(context, str2, string, c12100l, binderC2728l, new C9937l(context2, c12100l, binderC2728l)).crashlytics();
                    parcel2.writeNoException();
                    AbstractC14627l.crashlytics(parcel2, interfaceC3396lCrashlytics);
                } else if (i == 2) {
                    boolean z = c15318l.amazon.f24040l;
                    parcel2.writeNoException();
                    int i6 = AbstractC14627l.yandex;
                    parcel2.writeInt(z ? 1 : 0);
                } else if (i == 3) {
                    String str3 = c15318l.loadAd;
                    parcel2.writeNoException();
                    parcel2.writeString(str3);
                } else {
                    if (i != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
            case 2:
                if (i == 1) {
                    long j = parcel.readLong();
                    long j2 = parcel.readLong();
                    AbstractC14627l.amazon(parcel);
                    ((AsyncTaskC13171l) obj).publishProgress(Long.valueOf(j), Long.valueOf(j2));
                    parcel2.writeNoException();
                } else {
                    if (i != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
            default:
                C0189l c0189l6 = (C0189l) obj;
                int i7 = 5;
                if (i == 1) {
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    AbstractC14627l.amazon(parcel);
                    C16014l c16014l = c0189l6.subs;
                    if (c16014l != null && c16014l.f31393throws == 3) {
                        c16014l.getClass();
                        C10147l c10147lYandex = C8662l.yandex();
                        c10147lYandex.yandex = new C2019l(c16014l, string2, string3, i3);
                        c10147lYandex.purchase = 8407;
                        c16014l.purchase(1, c10147lYandex.yandex()).yandex(new C17190l(i7, this));
                    }
                    parcel2.writeNoException();
                } else if (i == 2) {
                    String string4 = parcel.readString();
                    C1901l c1901l = (C1901l) AbstractC14627l.yandex(parcel, C1901l.CREATOR);
                    AbstractC14627l.amazon(parcel);
                    C16014l c16014l2 = c0189l6.subs;
                    if (c16014l2 != null && c16014l2.f31393throws == 3) {
                        c16014l2.getClass();
                        C10147l c10147lYandex2 = C8662l.yandex();
                        c10147lYandex2.yandex = new C5991l(c16014l2, string4, c1901l, 15);
                        c10147lYandex2.purchase = 8406;
                        c16014l2.purchase(1, c10147lYandex2.yandex()).yandex(new C10846l(this));
                    }
                    parcel2.writeNoException();
                } else if (i == 3) {
                    String string5 = parcel.readString();
                    AbstractC14627l.amazon(parcel);
                    C16014l c16014l3 = c0189l6.subs;
                    if (c16014l3 != null && c16014l3.f31393throws == 3) {
                        c16014l3.getClass();
                        C10147l c10147lYandex3 = C8662l.yandex();
                        c10147lYandex3.yandex = new C7847l(c16014l3, string5);
                        c10147lYandex3.purchase = 8409;
                        c16014l3.purchase(1, c10147lYandex3.yandex());
                    }
                    parcel2.writeNoException();
                } else if (i == 4) {
                    int i8 = parcel.readInt();
                    AbstractC14627l.amazon(parcel);
                    c0189l6.purchase(i8);
                    parcel2.writeNoException();
                } else {
                    if (i != 5) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3285l(AbstractC11229l abstractC11229l) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 2);
        this.mopub = abstractC11229l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3285l(C15318l c15318l) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 2);
        this.mopub = c15318l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3285l(AsyncTaskC13171l asyncTaskC13171l) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 2);
        this.mopub = asyncTaskC13171l;
    }
}
