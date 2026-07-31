package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَۛ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10577l extends AbstractC3386l {
    public final C10086l loadAd;
    public C8030l yandex;

    public C10577l(C8030l c8030l, C8896l c8896l) {
        this.yandex = c8030l;
        this.loadAd = AbstractC8020l.smaato(c8896l);
    }

    @Override // defpackage.AbstractC3386l
    public final AbstractC3386l admob() {
        return C10323l.yandex;
    }

    @Override // defpackage.AbstractC3386l
    public final C8896l billing(C14509l c14509l) {
        Object obj;
        C8896l c8896lCrashlytics = crashlytics();
        if (c8896lCrashlytics != null) {
            return c8896lCrashlytics;
        }
        if (crashlytics() == null) {
            C8030l c8030l = this.yandex;
            if (c8030l == null) {
                List listLoadAd = c14509l.loadAd();
                int size = listLoadAd.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listLoadAd.get(i);
                    if (c14509l.crashlytics().contains((C0633l) obj)) {
                        break;
                    }
                    i++;
                }
                C0633l c0633l = (C0633l) obj;
                c8030l = c0633l != null ? c0633l.f2093l : null;
            }
            C8896l c8896lLoadAd = AbstractC17549l.loadAd(c14509l, c8030l);
            if (c8896lLoadAd != null) {
                this.loadAd.setValue(c8896lLoadAd);
            }
        }
        return crashlytics();
    }

    @Override // defpackage.AbstractC3386l
    public final C8896l crashlytics() {
        return (C8896l) this.loadAd.getValue();
    }

    @Override // defpackage.AbstractC3386l
    public final boolean loadAd() {
        return true;
    }

    @Override // defpackage.AbstractC3386l
    public final AbstractC3386l mopub(C8030l c8030l) {
        if (this.yandex == null) {
            this.yandex = c8030l;
        }
        return this;
    }

    @Override // defpackage.AbstractC3386l
    public final C12014l purchase() {
        return null;
    }

    @Override // defpackage.AbstractC3386l
    public final void subs(C8896l c8896l) {
        this.loadAd.setValue(c8896l);
    }

    @Override // defpackage.AbstractC3386l
    public final AbstractC3386l yandex(C14509l c14509l, C8030l c8030l, long j, long j2, long j3) {
        Object obj;
        C12014l c12014l = new C12014l(j, C1187l.admob(j2, j3), j3);
        C8896l c8896lCrashlytics = crashlytics();
        if (c8896lCrashlytics == null) {
            C8030l c8030l2 = this.yandex;
            if (c8030l2 == null) {
                List listLoadAd = c14509l.loadAd();
                int size = listLoadAd.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listLoadAd.get(i);
                    if (c14509l.crashlytics().contains((C0633l) obj)) {
                        break;
                    }
                    i++;
                }
                C0633l c0633l = (C0633l) obj;
                c8030l2 = c0633l != null ? c0633l.f2093l : null;
            }
            c8896lCrashlytics = AbstractC17549l.loadAd(c14509l, c8030l2);
            if (c8896lCrashlytics == null) {
                c8896lCrashlytics = AbstractC7470l.isPro(j2, j);
            }
        }
        AbstractC17549l.crashlytics(c12014l, j, j2, j3, true);
        return new C8247l(c12014l, c8030l, c8896lCrashlytics);
    }
}
