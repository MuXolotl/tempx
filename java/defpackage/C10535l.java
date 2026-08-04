package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lَؚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10535l implements InterfaceC17172l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C9912l f21433l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public ThreadPoolExecutor f21434l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public AbstractC15422l f21435l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C17129l f21436l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f21437l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Handler f21438l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f21439l = new Object();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public ThreadPoolExecutor f21440l;

    public C10535l(Context context, C17129l c17129l) {
        AbstractC5641l.amazon(context, "Context cannot be null");
        this.f21437l = context.getApplicationContext();
        this.f21436l = c17129l;
        this.f21433l = C9412l.amazon;
    }

    @Override // defpackage.InterfaceC17172l
    public final void amazon(AbstractC15422l abstractC15422l) {
        synchronized (this.f21439l) {
            this.f21435l = abstractC15422l;
        }
        loadAd();
    }

    public final C5882l crashlytics() {
        try {
            C9912l c9912l = this.f21433l;
            Context context = this.f21437l;
            C17129l c17129l = this.f21436l;
            c9912l.getClass();
            Object[] objArr = {c17129l};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C17368l c17368lYandex = AbstractC16813l.yandex(context, DesugarCollections.unmodifiableList(arrayList));
            int i = c17368lYandex.yandex;
            if (i != 0) {
                C18073l.license(AbstractC15560l.tapsense("fetchFonts failed (", i, ")"));
                return null;
            }
            C5882l[] c5882lArr = (C5882l[]) c17368lYandex.loadAd.get(0);
            if (c5882lArr != null && c5882lArr.length != 0) {
                return c5882lArr[0];
            }
            C18073l.license("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            C18073l.Signature("provider not found", e);
            return null;
        }
    }

    public final void loadAd() {
        synchronized (this.f21439l) {
            try {
                if (this.f21435l == null) {
                    return;
                }
                if (this.f21440l == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC17493l("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f21434l = threadPoolExecutor;
                    this.f21440l = threadPoolExecutor;
                }
                this.f21440l.execute(new RunnableC11297l(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void yandex() {
        synchronized (this.f21439l) {
            try {
                this.f21435l = null;
                Handler handler = this.f21438l;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f21438l = null;
                ThreadPoolExecutor threadPoolExecutor = this.f21434l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f21440l = null;
                this.f21434l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
