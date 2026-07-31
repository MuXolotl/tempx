package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: lَٚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10398l implements InterfaceC0049l, InterfaceC10367l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C7025l f21221l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinkedHashMap f21220l = new LinkedHashMap();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public EnumC2467l f21219l = EnumC2467l.f5252l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f21218l = new ArrayList();

    public C10398l(C7025l c7025l) {
        this.f21221l = c7025l;
    }

    @Override // defpackage.InterfaceC10367l
    public final void amazon(Executor executor, InterfaceC15984l interfaceC15984l) {
        this.f21221l.admob.execute(new RunnableC10613l(this, interfaceC15984l, executor, 18));
    }

    @Override // defpackage.InterfaceC10367l
    public final ListenableFuture mopub() {
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            this.f21221l.admob.execute(new RunnableC0336l(this, c5807l, 17));
            c5807l.yandex = "fetchData";
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        return c16565l;
    }

    @Override // defpackage.InterfaceC10367l
    public final void remoteconfig(InterfaceC15984l interfaceC15984l) {
        this.f21221l.admob.execute(new RunnableC0336l(this, interfaceC15984l, 16));
    }

    public final void yandex(boolean z) {
        EnumC2467l enumC2467l = EnumC2467l.f5252l;
        EnumC2467l enumC2467l2 = z ? EnumC2467l.f5253l : enumC2467l;
        if (this.f21219l == enumC2467l2) {
            return;
        }
        this.f21219l = enumC2467l2;
        if (enumC2467l2 == enumC2467l) {
            ArrayList arrayList = this.f21218l;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.f21220l.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new RunnableC0336l(entry, enumC2467l2, 15));
            } catch (RejectedExecutionException e) {
                AbstractC5088l.amazon(this.f21221l.yandex, "Unable to post to the supplied executor.", e);
            }
        }
    }
}
