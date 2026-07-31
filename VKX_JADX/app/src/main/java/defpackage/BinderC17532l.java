package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: renamed from: lٗۥُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC17532l extends AbstractBinderC5395l implements InterfaceC15669l, InterfaceC11821l {
    public static final C5795l remoteconfig = AbstractC6002l.yandex;
    public final C5795l admob;
    public final Context billing;
    public C12582l firebase;
    public final C1424l isPro;
    public final Handler mopub;
    public C16557l smaato;
    public final Set subs;

    public BinderC17532l(Context context, HandlerC4052l handlerC4052l, C1424l c1424l) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 1);
        this.billing = context;
        this.mopub = handlerC4052l;
        this.isPro = c1424l;
        this.subs = (Set) c1424l.f3603l;
        this.admob = remoteconfig;
    }

    @Override // defpackage.InterfaceC11821l
    public final void crashlytics(C10602l c10602l) {
        this.smaato.amazon(c10602l);
    }

    @Override // defpackage.InterfaceC15669l
    public final void isPro(int i) {
        C16557l c16557l = this.smaato;
        C3714l c3714l = (C3714l) ((C14138l) c16557l.f32507l).f27644l.get((C7800l) c16557l.f32503l);
        if (c3714l != null) {
            if (c3714l.remoteconfig) {
                c3714l.vip(new C10602l(17, null, null));
            } else {
                c3714l.isPro(i);
            }
        }
    }

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lْؕ۠ */
    public final boolean mo1774l(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (i) {
            case 3:
                AbstractC1763l.crashlytics(parcel);
                break;
            case 4:
                AbstractC1763l.crashlytics(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC1763l.crashlytics(parcel);
                break;
            case 7:
                AbstractC1763l.crashlytics(parcel);
                break;
            case 8:
                C8074l c8074l = (C8074l) AbstractC1763l.yandex(parcel, C8074l.CREATOR);
                AbstractC1763l.crashlytics(parcel);
                this.mopub.post(new RunnableC9929l(this, c8074l, z, 24));
                break;
            case 9:
                AbstractC1763l.crashlytics(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.InterfaceC15669l
    /* JADX INFO: renamed from: lَٖؔ */
    public final void mo1410l() {
        GoogleSignInAccount googleSignInAccountBilling;
        C12582l c12582l = this.firebase;
        c12582l.getClass();
        try {
            c12582l.appmetrica.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = c12582l.crashlytics;
                ReentrantLock reentrantLock = C0585l.crashlytics;
                AbstractC1051l.subs(context);
                ReentrantLock reentrantLock2 = C0585l.crashlytics;
                reentrantLock2.lock();
                try {
                    if (C0585l.amazon == null) {
                        C0585l.amazon = new C0585l(context.getApplicationContext());
                    }
                    C0585l c0585l = C0585l.amazon;
                    reentrantLock2.unlock();
                    String strYandex = c0585l.yandex("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strYandex)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(strYandex).length() + 20);
                        sb.append("googleSignInAccount:");
                        sb.append(strYandex);
                        String strYandex2 = c0585l.yandex(sb.toString());
                        if (strYandex2 != null) {
                            try {
                                googleSignInAccountBilling = GoogleSignInAccount.billing(strYandex2);
                            } catch (JSONException unused) {
                                googleSignInAccountBilling = null;
                            }
                        }
                    }
                    googleSignInAccountBilling = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountBilling = null;
            }
            Integer num = c12582l.f24767throws;
            AbstractC1051l.subs(num);
            C10742l c10742l = new C10742l(2, account, num.intValue(), googleSignInAccountBilling);
            C16806l c16806l = (C16806l) c12582l.metrica();
            C4078l c4078l = new C4078l(1, c10742l);
            Parcel parcelCrashlytics = c16806l.crashlytics();
            AbstractC1763l.loadAd(parcelCrashlytics, c4078l);
            parcelCrashlytics.writeStrongBinder(this);
            c16806l.isPro(parcelCrashlytics, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.mopub.post(new RunnableC9929l(this, new C8074l(1, new C10602l(8, null, null), null), false, 24));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
