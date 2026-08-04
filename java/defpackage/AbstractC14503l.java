package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lۣٓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14503l {
    public static final C12611l yandex = new C12611l(-1, null, null, 0);
    public static final int loadAd = C16050l.ads(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int crashlytics = C16050l.ads(ModuleDescriptor.MODULE_VERSION, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final C9676l amazon = new C9676l("BUFFERED", 2);
    public static final C9676l purchase = new C9676l("SHOULD_BUFFER", 2);
    public static final C9676l billing = new C9676l("S_RESUMING_BY_RCV", 2);
    public static final C9676l mopub = new C9676l("RESUMING_BY_EB", 2);
    public static final C9676l admob = new C9676l("POISONED", 2);
    public static final C9676l subs = new C9676l("DONE_RCV", 2);
    public static final C9676l isPro = new C9676l("INTERRUPTED_SEND", 2);
    public static final C9676l firebase = new C9676l("INTERRUPTED_RCV", 2);
    public static final C9676l smaato = new C9676l("CHANNEL_CLOSED", 2);
    public static final C9676l remoteconfig = new C9676l("SUSPEND", 2);
    public static final C9676l vip = new C9676l("SUSPEND_NO_WAITER", 2);
    public static final C9676l metrica = new C9676l("FAILED", 2);
    public static final C9676l startapp = new C9676l("NO_RECEIVE_RESULT", 2);
    public static final C9676l adcel = new C9676l("CLOSE_HANDLER_CLOSED", 2);
    public static final C9676l ads = new C9676l("CLOSE_HANDLER_INVOKED", 2);
    public static final C9676l subscription = new C9676l("NO_CLOSE_CAUSE", 2);

    public static final boolean yandex(InterfaceC4305l interfaceC4305l, Object obj, Function3 function3) {
        C9676l c9676lSmaato = interfaceC4305l.smaato(obj, function3);
        if (c9676lSmaato == null) {
            return false;
        }
        interfaceC4305l.startapp(c9676lSmaato);
        return true;
    }
}
