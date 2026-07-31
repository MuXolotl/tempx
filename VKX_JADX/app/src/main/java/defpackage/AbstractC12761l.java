package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lّٟۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12761l {
    public static final InterfaceC6272l yandex = AbstractC1937l.loadAd("io.ktor.server.engine.DefaultTransform");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(InterfaceC9354l interfaceC9354l, Charset charset, AbstractC0283l abstractC0283l) throws Exception {
        C8416l c8416l;
        if (abstractC0283l instanceof C8416l) {
            c8416l = (C8416l) abstractC0283l;
            int i = c8416l.f17424l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8416l.f17424l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8416l = new C8416l(abstractC0283l);
            }
        } else {
            c8416l = new C8416l(abstractC0283l);
        }
        Object objSignatures = c8416l.f17422l;
        int i2 = c8416l.f17424l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objSignatures);
            c8416l.f17423l = charset;
            c8416l.f17424l = 1;
            objSignatures = AbstractC10310l.signatures(interfaceC9354l, Long.MAX_VALUE, c8416l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSignatures == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charset = c8416l.f17423l;
            AbstractC2829l.crashlytics(objSignatures);
        }
        InterfaceC14189l interfaceC14189l = (InterfaceC14189l) objSignatures;
        if (interfaceC14189l.subs()) {
            return "";
        }
        try {
            return (AbstractC8576l.yandex(charset, AbstractC9050l.yandex) || AbstractC8576l.yandex(charset, AbstractC9050l.amazon)) ? AbstractC17291l.mopub(interfaceC14189l) : AbstractC11397l.isVip(interfaceC14189l, charset);
        } finally {
            interfaceC14189l.close();
        }
    }
}
