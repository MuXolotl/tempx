package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lؓۖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2027l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f4550l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4551l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4552l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f4553l;

    public /* synthetic */ RunnableC2027l(AbstractC4829l abstractC4829l, C10035l c10035l, InterfaceC10687l interfaceC10687l, int i) {
        this.f4552l = 0;
        this.f4550l = abstractC4829l;
        this.f4553l = interfaceC10687l;
        this.f4551l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5159l c5159l;
        int i = this.f4552l;
        int i2 = this.f4551l;
        Object obj = this.f4553l;
        Object obj2 = this.f4550l;
        switch (i) {
            case 0:
                ((AbstractC4829l) obj2).amazon(C10035l.crashlytics((InterfaceC10687l) obj), i2);
                break;
            case 1:
                C16166l c16166l = (C16166l) obj2;
                Serializable serializable = (Serializable) ((C3316l) obj).f7072l;
                String str = (String) c16166l.yandex.get(Integer.valueOf(i2));
                if (str != null) {
                    C1129l c1129l = (C1129l) c16166l.purchase.get(str);
                    if ((c1129l != null ? c1129l.yandex : null) == null) {
                        c16166l.mopub.remove(str);
                        c16166l.billing.put(str, serializable);
                    } else {
                        InterfaceC18517l interfaceC18517l = c1129l.yandex;
                        if (c16166l.amazon.remove(str)) {
                            interfaceC18517l.isPro(serializable);
                        }
                    }
                    break;
                }
                break;
            case 2:
                ((C16166l) obj2).yandex(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 3:
                ((InterfaceC8170l) ((C7403l) obj2).f15341l).tapsense(i2, obj);
                break;
            case 4:
                C13281l c13281l = (C13281l) obj2;
                ((InterfaceC11885l) obj).amazon(c13281l.yandex, c13281l.loadAd, i2);
                break;
            case 5:
                InterfaceC16975l interfaceC16975l = (InterfaceC16975l) obj;
                for (C18048l c18048l : (CopyOnWriteArraySet) obj2) {
                    if (!c18048l.amazon) {
                        if (i2 != -1) {
                            c18048l.loadAd.loadAd(i2);
                        }
                        c18048l.crashlytics = true;
                        interfaceC16975l.invoke(c18048l.yandex);
                    }
                }
                break;
            case 6:
                C13208l c13208l = (C13208l) obj2;
                try {
                    c5159l = (C5159l) ((ListenableFuture) obj).get();
                    AbstractC12442l.metrica(c5159l, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    AbstractC6427l.metrica("MCImplBase", "Session operation failed", e);
                    c5159l = new C5159l(-1);
                } catch (CancellationException e2) {
                    AbstractC6427l.metrica("MCImplBase", "Session operation cancelled", e2);
                    c5159l = new C5159l(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    AbstractC6427l.metrica("MCImplBase", "Session operation failed", e);
                    c5159l = new C5159l(-1);
                }
                InterfaceC4725l interfaceC4725l = c13208l.appmetrica;
                if (interfaceC4725l != null) {
                    try {
                        interfaceC4725l.smaato(c13208l.crashlytics, i2, c5159l.loadAd());
                    } catch (RemoteException unused) {
                        AbstractC6427l.vip("MCImplBase", "Error in sending");
                        return;
                    }
                    break;
                }
                break;
            default:
                Pair pair = (Pair) obj;
                ((C17505l) ((C7065l) obj2).f14805l.subs).amazon(((Integer) pair.first).intValue(), (C5019l) pair.second, i2);
                break;
        }
    }

    public /* synthetic */ RunnableC2027l(Object obj, int i, Object obj2, int i2) {
        this.f4552l = i2;
        this.f4550l = obj;
        this.f4551l = i;
        this.f4553l = obj2;
    }

    public /* synthetic */ RunnableC2027l(Object obj, Object obj2, int i, int i2) {
        this.f4552l = i2;
        this.f4550l = obj;
        this.f4553l = obj2;
        this.f4551l = i;
    }
}
