package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕؒۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15395l implements InterfaceC9094l {
    public static final LinkedHashSet amazon = new LinkedHashSet();
    public static final Object purchase = new Object();
    public final Function0 crashlytics;
    public final Function1 loadAd;
    public final InterfaceC18477l yandex;

    public /* synthetic */ C15395l(InterfaceC18477l interfaceC18477l, Function0 function0) {
        this(interfaceC18477l, new C4741l(25), function0);
    }

    @Override // defpackage.InterfaceC9094l
    public final InterfaceC5137l yandex() throws IOException {
        File canonicalFile = ((File) this.crashlytics.invoke()).getCanonicalFile();
        synchronized (purchase) {
            String absolutePath = canonicalFile.getAbsolutePath();
            LinkedHashSet linkedHashSet = amazon;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(absolutePath);
        }
        return new C6805l(canonicalFile, this.yandex, (InterfaceC4335l) this.loadAd.invoke(canonicalFile), new C7730l(2, canonicalFile));
    }

    public C15395l(InterfaceC18477l interfaceC18477l, Function1 function1, Function0 function0) {
        this.yandex = interfaceC18477l;
        this.loadAd = function1;
        this.crashlytics = function0;
    }
}
