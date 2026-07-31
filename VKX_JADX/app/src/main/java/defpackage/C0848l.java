package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseIntArray;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؘؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0848l implements InterfaceC2353l, InterfaceC0983l, InterfaceC5194l, InterfaceC17641l, InterfaceC11545l, InterfaceC9526l, InterfaceC1953l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f2498l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f2499l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2500l;

    public C0848l(int i) {
        this.f2500l = i;
        switch (i) {
            case 5:
                C7181l c7181l = C7181l.purchase;
                this.f2499l = new SparseIntArray();
                this.f2498l = c7181l;
                break;
            case 13:
                break;
            default:
                this.f2499l = new C17893l(0, new Reference[16]);
                this.f2498l = new ReferenceQueue();
                break;
        }
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        switch (this.f2500l) {
            case 8:
                C11963l c11963l = (C11963l) obj;
                C13132l c13132l = new C13132l((C2350l) obj2);
                String str = (String) this.f2499l;
                C18096l c18096l = (C18096l) this.f2498l;
                c11963l.getClass();
                BinderC11396l binderC11396l = new BinderC11396l(c11963l.crashlytics, c18096l, c11963l.f23840volatile);
                c11963l.f23839throws.add(binderC11396l);
                C13452l c13452l = (C13452l) c11963l.metrica();
                C8745l c8745l = new C8745l();
                c8745l.f18005l = new BinderC13190l(c13132l);
                c8745l.f18001l = str;
                c8745l.f18006l = binderC11396l;
                Parcel parcelM743l = c13452l.m743l();
                int i = AbstractC14866l.yandex;
                parcelM743l.writeInt(1);
                c8745l.writeToParcel(parcelM743l, 0);
                c13452l.m742l(parcelM743l, 2006);
                break;
            case 9:
            default:
                int i2 = C1539l.firebase;
                BinderC15695l binderC15695l = new BinderC15695l((C2350l) obj2);
                C18414l c18414l = (C18414l) ((C8900l) obj).metrica();
                String[] strArr = (String[]) this.f2498l;
                String str2 = (String) this.f2499l;
                Parcel parcelM743l2 = c18414l.m743l();
                AbstractC15425l.crashlytics(parcelM743l2, binderC15695l);
                parcelM743l2.writeString(str2);
                parcelM743l2.writeInt(0);
                parcelM743l2.writeStringArray(strArr);
                parcelM743l2.writeByteArray(null);
                c18414l.m741l(parcelM743l2, 1);
                break;
            case 10:
                BinderC17818l binderC17818l = new BinderC17818l((C7560l) this.f2499l, (C2350l) obj2);
                C7132l c7132l = (C7132l) ((C18304l) obj).metrica();
                C3448l c3448lRemoteconfig = AbstractC11990l.remoteconfig();
                String[] strArr2 = (String[]) this.f2498l;
                Parcel parcelM743l3 = c7132l.m743l();
                AbstractC14627l.crashlytics(parcelM743l3, binderC17818l);
                parcelM743l3.writeStringArray(strArr2);
                AbstractC14627l.loadAd(parcelM743l3, c3448lRemoteconfig);
                c7132l.m747l(parcelM743l3, 5);
                break;
        }
    }

    public int admob(int i) {
        int i2;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2499l;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    @Override // defpackage.InterfaceC0983l
    public int amazon(int i) {
        do {
            i = ((C11522l) this.f2498l).m3121static(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f2499l).charAt(i)));
        return i;
    }

    @Override // defpackage.InterfaceC5194l
    public void billing(String str, long j, long j2, long j3) {
        InterfaceC5194l interfaceC5194l = (InterfaceC5194l) this.f2499l;
        if (interfaceC5194l != null) {
            interfaceC5194l.billing(str, j, j2, j3);
        }
    }

    @Override // defpackage.InterfaceC9526l
    public ListenableFuture call() {
        C5702l c5702l = (C5702l) this.f2498l;
        RunnableC9543l runnableC9543lTapsense = c5702l.admob.tapsense("Initialize ".concat(String.valueOf(c5702l.yandex)));
        try {
            synchronized (c5702l.mopub) {
                try {
                    if (((List) this.f2499l) == null) {
                        this.f2499l = c5702l.subs;
                        c5702l.subs = Collections.EMPTY_LIST;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList(((List) this.f2499l).size());
            C15174l c15174l = new C15174l((C5702l) this.f2498l);
            Iterator it = ((List) this.f2499l).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((InterfaceC12538l) it.next()).apply(c15174l));
                } catch (Exception e) {
                    arrayList.add(AbstractC7151l.amazon(e));
                }
            }
            AbstractC1186l abstractC1186lTapsense = AbstractC1186l.tapsense(arrayList);
            CallableC15551l callableC15551l = new CallableC15551l(7, this);
            C8911l c8911l = new C8911l(abstractC1186lTapsense, true);
            c8911l.f18308l = new C10313l(c8911l, callableC15551l);
            c8911l.subscription();
            runnableC9543lTapsense.yandex(c8911l);
            runnableC9543lTapsense.close();
            return c8911l;
        } catch (Throwable th2) {
            try {
                runnableC9543lTapsense.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC17641l
    public C7502l crashlytics(InterfaceC2167l interfaceC2167l) {
        C7502l c7502lIsPro = ((C7502l) this.f2499l).isPro();
        String str = (String) this.f2498l;
        c7502lIsPro.remoteconfig(str, interfaceC2167l);
        ((HashMap) c7502lIsPro.f15512l).put(str, Boolean.TRUE);
        return c7502lIsPro;
    }

    @Override // defpackage.InterfaceC0983l
    public int loadAd(int i) {
        do {
            i = ((C11522l) this.f2498l).m3121static(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f2499l).charAt(i - 1)));
        return i;
    }

    public int mopub(Context context, InterfaceC1168l interfaceC1168l) {
        AbstractC1051l.subs(context);
        AbstractC1051l.subs(interfaceC1168l);
        int iCrashlytics = 0;
        if (!interfaceC1168l.yandex()) {
            return 0;
        }
        int iLoadAd = interfaceC1168l.loadAd();
        int iAdmob = admob(iLoadAd);
        if (iAdmob != -1) {
            return iAdmob;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2499l;
        synchronized (sparseIntArray) {
            int i = 0;
            while (true) {
                try {
                    if (i >= sparseIntArray.size()) {
                        iCrashlytics = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iLoadAd && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iCrashlytics == -1) {
                iCrashlytics = ((C7181l) this.f2498l).crashlytics(context, iLoadAd);
            }
            sparseIntArray.put(iLoadAd, iCrashlytics);
        }
        return iCrashlytics;
    }

    @Override // defpackage.InterfaceC0983l
    public int purchase(int i) {
        do {
            i = ((C11522l) this.f2498l).m3115native(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f2499l).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) {
        Bundle bundle;
        C14302l c14302l = (C14302l) this.f2499l;
        Bundle bundle2 = (Bundle) this.f2498l;
        c14302l.getClass();
        return (c3823l.smaato() && (bundle = (Bundle) c3823l.isPro()) != null && bundle.containsKey("google.messenger")) ? c14302l.yandex(bundle2).remoteconfig(ExecutorC12908l.f25368l, C7472l.f15455l) : c3823l;
    }

    @Override // defpackage.InterfaceC5194l
    public void subs(String str, long j, int i, Object obj, long j2, long j3) {
        ((C7427l) this.f2498l).mopub = null;
        InterfaceC5194l interfaceC5194l = (InterfaceC5194l) this.f2499l;
        if (interfaceC5194l != null) {
            interfaceC5194l.subs(str, j, i, obj, j2, j3);
        }
    }

    public String toString() {
        switch (this.f2500l) {
            case 0:
                return ((C1693l) this.f2499l) + ".push(" + ((C1693l) this.f2498l) + ");";
            case 1:
                return ((C1693l) this.f2499l) + " != " + ((C14513l) this.f2498l);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC0983l
    public int yandex(int i) {
        CharSequence charSequence = (CharSequence) this.f2499l;
        do {
            i = ((C11522l) this.f2498l).m3115native(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    public /* synthetic */ C0848l(Object obj, Object obj2, int i) {
        this.f2500l = i;
        this.f2499l = obj;
        this.f2498l = obj2;
    }

    public /* synthetic */ C0848l(C1062l c1062l, String str, C18096l c18096l) {
        this.f2500l = 8;
        this.f2499l = str;
        this.f2498l = c18096l;
    }

    public C0848l(AppMeasurementSdk appMeasurementSdk, C3797l c3797l) {
        this.f2500l = 9;
        this.f2498l = c3797l;
        appMeasurementSdk.yandex(new C13730l(0, this));
        this.f2499l = new HashSet();
    }

    public C0848l(C7427l c7427l, InterfaceC5194l interfaceC5194l) {
        this.f2500l = 6;
        this.f2499l = interfaceC5194l;
        Objects.requireNonNull(c7427l);
        this.f2498l = c7427l;
    }

    public /* synthetic */ C0848l(int i, Object obj) {
        this.f2500l = i;
        this.f2498l = obj;
    }
}
