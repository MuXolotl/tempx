package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٕٜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15752l implements InterfaceC11766l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f30929l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30930l;

    public /* synthetic */ C15752l(int i, Object obj) {
        this.f30930l = i;
        this.f30929l = obj;
    }

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        int i = this.f30930l;
        Object obj = this.f30929l;
        switch (i) {
            case 0:
                Object obj2 = C7447l.isPro;
                return new C2830l((ArrayList) obj);
            default:
                C2079l c2079l = (C2079l) obj;
                ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354l = (ScheduledExecutorServiceC6354l) c2079l.crashlytics.get();
                scheduledExecutorServiceC6354l.getClass();
                C18222l c18222l = (C18222l) c2079l.loadAd.get();
                c18222l.getClass();
                C1539l c1539l = c18222l.yandex;
                C10147l c10147lYandex = C8662l.yandex();
                c10147lYandex.yandex = new C5321l(c1539l);
                c10147lYandex.amazon = new C9138l[]{AbstractC9464l.mopub};
                c10147lYandex.crashlytics = true;
                c10147lYandex.loadAd = false;
                C3565l c3565lMopub = AbstractC7151l.mopub(AbstractC7151l.yandex(C18222l.loadAd(c1539l.purchase(0, c10147lYandex.yandex())), C9303l.class, C15952l.f31323l, scheduledExecutorServiceC6354l), new C1164l(3, c2079l), scheduledExecutorServiceC6354l);
                c3565lMopub.yandex(new RunnableC10799l(19, c3565lMopub), scheduledExecutorServiceC6354l);
                return c3565lMopub;
        }
    }
}
