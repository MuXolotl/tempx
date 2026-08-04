package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lُؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4985l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f10211l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f10212l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f10213l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f10214l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f10215l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f10216l;

    public /* synthetic */ RunnableC4985l(C13350l c13350l, C12417l c12417l, int i, C16701l c16701l, InterfaceC0119l interfaceC0119l) {
        this.f10213l = 1;
        this.f10211l = c13350l;
        this.f10215l = c12417l;
        this.f10212l = i;
        this.f10214l = c16701l;
        this.f10216l = interfaceC0119l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        int i = this.f10213l;
        int i2 = this.f10212l;
        Object obj = this.f10216l;
        Object obj2 = this.f10214l;
        Object obj3 = this.f10215l;
        Object obj4 = this.f10211l;
        switch (i) {
            case 0:
                C0188l c0188l = (C0188l) obj4;
                List list = (List) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (((AtomicInteger) obj3).incrementAndGet() == list.size() && !c0188l.firebase && (((C10730l) c0188l.subs.f35934l).yandex.getFlags() & 4) != 0) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        ListenableFuture listenableFuture = (ListenableFuture) arrayList.get(i3);
                        if (listenableFuture != null) {
                            try {
                                bitmap = (Bitmap) AbstractC7151l.crashlytics(listenableFuture);
                            } catch (CancellationException | ExecutionException e) {
                                AbstractC6427l.mopub("MCImplLegacy", "Failed to get bitmap", e);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        c0188l.subs.subscription(AbstractC18585l.subs((C2427l) list.get(i3), bitmap), i2 + i3);
                    }
                    break;
                }
                break;
            case 1:
                C13350l c13350l = (C13350l) obj4;
                C12417l c12417l = (C12417l) obj3;
                C16701l c16701l = (C16701l) obj2;
                InterfaceC0119l interfaceC0119l = (InterfaceC0119l) obj;
                if (!c13350l.admob.metrica()) {
                    if (!((C1139l) c13350l.vip.f1691l).yandex.isActive()) {
                        StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb.append(c12417l == null ? Integer.valueOf(i2) : c12417l.loadAd);
                        sb.append(", pid=");
                        sb.append(c16701l.yandex.loadAd);
                        AbstractC6427l.vip("MediaSessionLegacyStub", sb.toString());
                    } else {
                        C6499l c6499lM3639super = c13350l.m3639super(c16701l);
                        C12014l c12014l = c13350l.mopub;
                        if (c12417l != null) {
                            if (!c12014l.m3302for(c6499lM3639super, c12417l)) {
                            }
                        } else if (!c12014l.m3301extends(c6499lM3639super, i2)) {
                        }
                        try {
                            interfaceC0119l.crashlytics(c6499lM3639super);
                        } catch (RemoteException e2) {
                            AbstractC6427l.metrica("MediaSessionLegacyStub", "Exception in " + c6499lM3639super, e2);
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                Pair pair = (Pair) obj3;
                ((C17505l) ((C7065l) obj4).f14805l.subs).mo1600class(((Integer) pair.first).intValue(), (C5019l) pair.second, (C13071l) obj2, (C2040l) obj, this.f10212l);
                break;
        }
    }

    public /* synthetic */ RunnableC4985l(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f10213l = i2;
        this.f10211l = obj;
        this.f10215l = obj2;
        this.f10214l = obj3;
        this.f10216l = obj4;
        this.f10212l = i;
    }
}
