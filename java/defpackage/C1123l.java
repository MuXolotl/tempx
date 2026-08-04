package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒ٘ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1123l extends C1538l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C18524l f3077l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1123l(C18524l c18524l) {
        super(1, AbstractC6791l.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f3077l = c18524l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((C10924l) obj).yandex;
        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) this.f3077l.f36159l.getValue();
        if (interfaceC18212l != null) {
            if (!interfaceC18212l.mopub()) {
                interfaceC18212l = null;
            }
            if (interfaceC18212l != null) {
                interfaceC18212l.subs(fArr);
            }
        }
        return Unit.INSTANCE;
    }
}
