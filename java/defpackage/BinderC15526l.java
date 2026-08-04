package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: lؙٕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC15526l extends AbstractBinderC4213l implements InterfaceC5496l {
    public Boolean billing;
    public String mopub;
    public final C6901l purchase;

    public BinderC15526l(C6901l c6901l) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        AbstractC1051l.subs(c6901l);
        this.purchase = c6901l;
        this.mopub = null;
    }

    @Override // defpackage.InterfaceC5496l
    public final void ad(long j, String str, String str2, String str3) {
        m4089l(new RunnableC17276l(this, str2, str3, str, j, 2));
    }

    @Override // defpackage.InterfaceC5496l
    public final List adcel(String str, String str2, String str3, boolean z) {
        m4090l(str, true);
        C6901l c6901l = this.purchase;
        try {
            List<C3477l> list = (List) c6901l.mo224l().m4447l(new CallableC14349l(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3477l c3477l : list) {
                if (z || !C17410l.m4345l(c3477l.crashlytics)) {
                    arrayList.add(new C6899l(c3477l));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            c6901l.mo200else().f16908l.crashlytics(C8118l.m2260l(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            c6901l.mo200else().f16908l.crashlytics(C8118l.m2260l(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: break */
    public final void mo1794break(C13236l c13236l, C10462l c10462l) {
        AbstractC1051l.subs(c13236l);
        m4091l(c10462l);
        m4089l(new RunnableC7706l(this, c13236l, c10462l, 7));
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: catch */
    public final void mo1795catch(C10462l c10462l) {
        AbstractC1051l.billing(c10462l.f21296l);
        AbstractC1051l.subs(c10462l.f21297l);
        isPro(new RunnableC15824l(this, c10462l, 5));
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: const */
    public final void mo1796const(C6899l c6899l, C10462l c10462l) {
        AbstractC1051l.subs(c6899l);
        m4091l(c10462l);
        m4089l(new RunnableC7706l(this, c6899l, c10462l, 9));
    }

    @Override // defpackage.AbstractBinderC4213l
    public final boolean crashlytics(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        C6901l c6901l = this.purchase;
        ArrayList arrayList = null;
        InterfaceC4992l c16406l = null;
        InterfaceC14655l c8179l = null;
        int i2 = 1;
        switch (i) {
            case 1:
                C13236l c13236l = (C13236l) AbstractC15425l.yandex(parcel, C13236l.CREATOR);
                C10462l c10462l = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                mo1794break(c13236l, c10462l);
                parcel2.writeNoException();
                return true;
            case 2:
                C6899l c6899l = (C6899l) AbstractC15425l.yandex(parcel, C6899l.CREATOR);
                C10462l c10462l2 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                mo1796const(c6899l, c10462l2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            default:
                return false;
            case 4:
                C10462l c10462l3 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                license(c10462l3);
                parcel2.writeNoException();
                return true;
            case 5:
                C13236l c13236l2 = (C13236l) AbstractC15425l.yandex(parcel, C13236l.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                AbstractC15425l.amazon(parcel);
                AbstractC1051l.subs(c13236l2);
                AbstractC1051l.billing(string);
                m4090l(string, true);
                m4089l(new RunnableC7706l(this, c13236l2, string, 8));
                parcel2.writeNoException();
                return true;
            case 6:
                C10462l c10462l4 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                mo1797else(c10462l4);
                parcel2.writeNoException();
                return true;
            case 7:
                C10462l c10462l5 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                z = parcel.readInt() != 0;
                AbstractC15425l.amazon(parcel);
                m4091l(c10462l5);
                String str = c10462l5.f21296l;
                AbstractC1051l.subs(str);
                try {
                    List<C3477l> list2 = (List) c6901l.mo224l().m4447l(new CallableC14455l(this, (Object) str, i2)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (C3477l c3477l : list2) {
                        if (z || !C17410l.m4345l(c3477l.crashlytics)) {
                            arrayList2.add(new C6899l(c3477l));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    c6901l.mo200else().f16908l.crashlytics(C8118l.m2260l(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e2) {
                    e = e2;
                    c6901l.mo200else().f16908l.crashlytics(C8118l.m2260l(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C13236l c13236l3 = (C13236l) AbstractC15425l.yandex(parcel, C13236l.CREATOR);
                String string2 = parcel.readString();
                AbstractC15425l.amazon(parcel);
                byte[] bArrMo1802l = mo1802l(string2, c13236l3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo1802l);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                AbstractC15425l.amazon(parcel);
                ad(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                C10462l c10462l6 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                String strMo1801l = mo1801l(c10462l6);
                parcel2.writeNoException();
                parcel2.writeString(strMo1801l);
                return true;
            case 12:
                C17509l c17509l = (C17509l) AbstractC15425l.yandex(parcel, C17509l.CREATOR);
                C10462l c10462l7 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                mo1798import(c17509l, c10462l7);
                parcel2.writeNoException();
                return true;
            case 13:
                C17509l c17509l2 = (C17509l) AbstractC15425l.yandex(parcel, C17509l.CREATOR);
                AbstractC15425l.amazon(parcel);
                AbstractC1051l.subs(c17509l2);
                AbstractC1051l.subs(c17509l2.f34112l);
                AbstractC1051l.billing(c17509l2.f34116l);
                m4090l(c17509l2.f34116l, true);
                m4089l(new RunnableC16301l(this, new C17509l(c17509l2), 7));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = AbstractC15425l.yandex;
                z = parcel.readInt() != 0;
                C10462l c10462l8 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                List listPremium = premium(string6, string7, z, c10462l8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listPremium);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC15425l.yandex;
                z = parcel.readInt() != 0;
                AbstractC15425l.amazon(parcel);
                List listAdcel = adcel(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listAdcel);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                C10462l c10462l9 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                List listMo1803l = mo1803l(string11, string12, c10462l9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo1803l);
                return true;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                AbstractC15425l.amazon(parcel);
                List listMo1807synchronized = mo1807synchronized(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo1807synchronized);
                return true;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C10462l c10462l10 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                mo1800l(c10462l10);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Bundle bundle = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                C10462l c10462l11 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                isVip(bundle, c10462l11);
                parcel2.writeNoException();
                return true;
            case 20:
                C10462l c10462l12 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                mo1804l(c10462l12);
                parcel2.writeNoException();
                return true;
            case 21:
                C10462l c10462l13 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                C15927l c15927lStartapp = startapp(c10462l13);
                parcel2.writeNoException();
                if (c15927lStartapp == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                c15927lStartapp.writeToParcel(parcel2, 1);
                return true;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C10462l c10462l14 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                AbstractC15425l.amazon(parcel);
                m4091l(c10462l14);
                String str2 = c10462l14.f21296l;
                AbstractC1051l.subs(str2);
                if (!c6901l.m2097import().m1682l(null, AbstractC5981l.f12689l)) {
                    try {
                        list = (List) c6901l.mo224l().m4447l(new CallableC1890l(this, c10462l14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e3) {
                        c6901l.mo200else().f16908l.crashlytics(C8118l.m2260l(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) c6901l.mo224l().m4441l(new CallableC1890l(this, c10462l14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        c6901l.mo200else().f16908l.crashlytics(C8118l.m2260l(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C10462l c10462l15 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                inmobi(c10462l15);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C10462l c10462l16 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                mo1795catch(c10462l16);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C10462l c10462l17 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                AbstractC15425l.amazon(parcel);
                mo1799l(c10462l17);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                C10462l c10462l18 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                C18032l c18032l = (C18032l) AbstractC15425l.yandex(parcel, C18032l.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    c8179l = iInterfaceQueryLocalInterface instanceof InterfaceC14655l ? (InterfaceC14655l) iInterfaceQueryLocalInterface : new C8179l(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 5);
                }
                AbstractC15425l.amazon(parcel);
                signatures(c10462l18, c18032l, c8179l);
                parcel2.writeNoException();
                return true;
            case 30:
                C10462l c10462l19 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                C17261l c17261l = (C17261l) AbstractC15425l.yandex(parcel, C17261l.CREATOR);
                AbstractC15425l.amazon(parcel);
                mo1806public(c10462l19, c17261l);
                parcel2.writeNoException();
                return true;
            case 31:
                C10462l c10462l20 = (C10462l) AbstractC15425l.yandex(parcel, C10462l.CREATOR);
                Bundle bundle3 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c16406l = iInterfaceQueryLocalInterface2 instanceof InterfaceC4992l ? (InterfaceC4992l) iInterfaceQueryLocalInterface2 : new C16406l(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 5);
                }
                AbstractC15425l.amazon(parcel);
                mo1805l(c10462l20, bundle3, c16406l);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: else */
    public final void mo1797else(C10462l c10462l) {
        m4091l(c10462l);
        m4089l(new RunnableC15824l(this, c10462l, 2));
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: import */
    public final void mo1798import(C17509l c17509l, C10462l c10462l) {
        AbstractC1051l.subs(c17509l);
        AbstractC1051l.subs(c17509l.f34112l);
        m4091l(c10462l);
        C17509l c17509l2 = new C17509l(c17509l);
        c17509l2.f34116l = c10462l.f21296l;
        m4089l(new RunnableC7706l(this, c17509l2, c10462l, 6));
    }

    @Override // defpackage.InterfaceC5496l
    public final void inmobi(C10462l c10462l) {
        AbstractC1051l.billing(c10462l.f21296l);
        AbstractC1051l.subs(c10462l.f21297l);
        isPro(new RunnableC15824l(this, c10462l, 6));
    }

    public final void isPro(Runnable runnable) {
        C6901l c6901l = this.purchase;
        if (c6901l.mo224l().m4444l()) {
            runnable.run();
        } else {
            c6901l.mo224l().m4448l(runnable);
        }
    }

    @Override // defpackage.InterfaceC5496l
    public final void isVip(Bundle bundle, C10462l c10462l) {
        m4091l(c10462l);
        String str = c10462l.f21296l;
        AbstractC1051l.subs(str);
        m4089l(new RunnableC16843l(7, this, bundle, str, c10462l, false));
    }

    @Override // defpackage.InterfaceC5496l
    public final void license(C10462l c10462l) {
        m4091l(c10462l);
        m4089l(new RunnableC15824l(this, c10462l, 0));
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final void mo1799l(C10462l c10462l) {
        m4091l(c10462l);
        m4089l(new RunnableC15824l(this, c10462l, 1));
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final void mo1800l(C10462l c10462l) {
        String str = c10462l.f21296l;
        AbstractC1051l.billing(str);
        m4090l(str, false);
        m4089l(new RunnableC15824l(this, c10462l, 3));
    }

    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public final void m4089l(Runnable runnable) {
        C6901l c6901l = this.purchase;
        if (c6901l.mo224l().m4444l()) {
            runnable.run();
        } else {
            c6901l.mo224l().m4449l(runnable);
        }
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lؗۨؑ */
    public final String mo1801l(C10462l c10462l) {
        m4091l(c10462l);
        C6901l c6901l = this.purchase;
        try {
            return (String) c6901l.mo224l().m4447l(new CallableC14455l(c6901l, c10462l)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c6901l.mo200else().f16908l.crashlytics(C8118l.m2260l(c10462l.f21296l), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lٍۤٙ */
    public final byte[] mo1802l(String str, C13236l c13236l) {
        AbstractC1051l.billing(str);
        AbstractC1051l.subs(c13236l);
        m4090l(str, true);
        C6901l c6901l = this.purchase;
        C14906l c14906l = c6901l.mo200else().f16918l;
        C17417l c17417l = c6901l.f14473l;
        C14135l c14135l = c17417l.f33942l;
        String str2 = c13236l.f26010l;
        c14906l.loadAd(c14135l.yandex(str2), "Log and bundle. event");
        c6901l.mo198abstract().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) c6901l.mo224l().m4441l(new CallableC15551l(this, c13236l, str)).get();
            if (bArr == null) {
                c6901l.mo200else().f16908l.loadAd(C8118l.m2260l(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            c6901l.mo198abstract().getClass();
            c6901l.mo200else().f16918l.amazon("Log and bundle processed. event, size, time_ms", c17417l.f33942l.yandex(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            c6901l.mo200else().f16908l.amazon("Failed to log and bundle. appId, event, error", C8118l.m2260l(str), c17417l.f33942l.yandex(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            c6901l.mo200else().f16908l.amazon("Failed to log and bundle. appId, event, error", C8118l.m2260l(str), c17417l.f33942l.yandex(str2), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public final void m4090l(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C6901l c6901l = this.purchase;
        if (zIsEmpty) {
            c6901l.mo200else().f16908l.yandex("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.billing == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.mopub) && !AbstractC15269l.loadAd(c6901l.f14473l.f33936l, Binder.getCallingUid()) && !C12585l.yandex(c6901l.f14473l.f33936l).loadAd(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.billing = Boolean.valueOf(z2);
                }
                if (this.billing.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                c6901l.mo200else().f16908l.loadAd(C8118l.m2260l(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.mopub == null) {
            Context context = c6901l.f14473l.f33936l;
            int callingUid = Binder.getCallingUid();
            int i = AbstractC4197l.purchase;
            if (AbstractC15269l.amazon(callingUid, context, str)) {
                this.mopub = str;
            }
        }
        if (str.equals(this.mopub)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final void m4091l(C10462l c10462l) {
        AbstractC1051l.subs(c10462l);
        String str = c10462l.f21296l;
        AbstractC1051l.billing(str);
        m4090l(str, false);
        this.purchase.m2086break().m4362l(c10462l.f21295l);
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lٖۥۡ */
    public final List mo1803l(String str, String str2, C10462l c10462l) {
        m4091l(c10462l);
        String str3 = c10462l.f21296l;
        AbstractC1051l.subs(str3);
        C6901l c6901l = this.purchase;
        try {
            return (List) c6901l.mo224l().m4447l(new CallableC14349l(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            c6901l.mo200else().f16908l.loadAd(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lؘٗۦ */
    public final void mo1804l(C10462l c10462l) {
        AbstractC1051l.billing(c10462l.f21296l);
        AbstractC1051l.subs(c10462l.f21297l);
        isPro(new RunnableC15824l(this, c10462l, 4));
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: l٘ۦۢ */
    public final void mo1805l(C10462l c10462l, Bundle bundle, InterfaceC4992l interfaceC4992l) {
        m4091l(c10462l);
        String str = c10462l.f21296l;
        AbstractC1051l.subs(str);
        this.purchase.mo224l().m4449l(new RunnableC7698l(this, c10462l, bundle, interfaceC4992l, str));
    }

    @Override // defpackage.InterfaceC5496l
    public final List premium(String str, String str2, boolean z, C10462l c10462l) {
        m4091l(c10462l);
        String str3 = c10462l.f21296l;
        AbstractC1051l.subs(str3);
        C6901l c6901l = this.purchase;
        try {
            List<C3477l> list = (List) c6901l.mo224l().m4447l(new CallableC14349l(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3477l c3477l : list) {
                if (z || !C17410l.m4345l(c3477l.crashlytics)) {
                    arrayList.add(new C6899l(c3477l));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            c6901l.mo200else().f16908l.crashlytics(C8118l.m2260l(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            c6901l.mo200else().f16908l.crashlytics(C8118l.m2260l(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: public */
    public final void mo1806public(C10462l c10462l, C17261l c17261l) {
        m4091l(c10462l);
        m4089l(new RunnableC7706l(this, c10462l, c17261l, false, 10));
    }

    @Override // defpackage.InterfaceC5496l
    public final void signatures(C10462l c10462l, C18032l c18032l, InterfaceC14655l interfaceC14655l) {
        m4091l(c10462l);
        String str = c10462l.f21296l;
        AbstractC1051l.subs(str);
        this.purchase.mo224l().m4449l(new RunnableC16843l(5, this, str, c18032l, interfaceC14655l, false));
    }

    @Override // defpackage.InterfaceC5496l
    public final C15927l startapp(C10462l c10462l) {
        m4091l(c10462l);
        String str = c10462l.f21296l;
        AbstractC1051l.billing(str);
        C6901l c6901l = this.purchase;
        try {
            return (C15927l) c6901l.mo224l().m4441l(new CallableC14455l(this, (Object) c10462l, 2)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c6901l.mo200else().f16908l.crashlytics(C8118l.m2260l(str), e, "Failed to get consent. appId");
            return new C15927l(null);
        }
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: synchronized */
    public final List mo1807synchronized(String str, String str2, String str3) {
        m4090l(str, true);
        C6901l c6901l = this.purchase;
        try {
            return (List) c6901l.mo224l().m4447l(new CallableC14349l(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            c6901l.mo200else().f16908l.loadAd(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }
}
