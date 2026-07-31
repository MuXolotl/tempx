package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: lْٔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15203l implements InterfaceC11791l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f29802l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f29803l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29804l;

    public /* synthetic */ C15203l(Object obj, Object obj2, int i) {
        this.f29804l = i;
        this.f29803l = obj;
        this.f29802l = obj2;
    }

    @Override // defpackage.InterfaceC11791l
    public final void yandex() {
        switch (this.f29804l) {
            case 0:
                C2975l c2975l = (C2975l) this.f29803l;
                c2975l.f6459l.removeCallbacks((Runnable) this.f29802l);
                return;
            default:
                String str = (String) this.f29803l;
                C8854l c8854l = (C8854l) this.f29802l;
                synchronized (FileObserverC14818l.loadAd) {
                    try {
                        LinkedHashMap linkedHashMap = FileObserverC14818l.crashlytics;
                        FileObserverC14818l fileObserverC14818l = (FileObserverC14818l) linkedHashMap.get(str);
                        if (fileObserverC14818l != null) {
                            fileObserverC14818l.yandex.remove(c8854l);
                            if (fileObserverC14818l.yandex.isEmpty()) {
                                linkedHashMap.remove(str);
                                fileObserverC14818l.stopWatching();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
