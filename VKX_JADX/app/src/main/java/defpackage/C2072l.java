package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: renamed from: lؓۘۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2072l {
    public final AtomicReference crashlytics = new AtomicReference();
    public final InterfaceC15829l loadAd;
    public final C3982l yandex;

    public C2072l(InterfaceC12932l interfaceC12932l, C3982l c3982l, InterfaceC15829l interfaceC15829l) {
        this.yandex = c3982l;
        this.loadAd = interfaceC15829l;
        AbstractC10999l.mopub(AbstractC11990l.yandex(interfaceC12932l), null, 0, new C2799l(this, null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(C15067l c15067l, AbstractC0283l abstractC0283l) {
        C5838l c5838l;
        if (abstractC0283l instanceof C5838l) {
            c5838l = (C5838l) abstractC0283l;
            int i = c5838l.f12296l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5838l.f12296l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5838l = new C5838l(this, abstractC0283l);
            }
        } else {
            c5838l = new C5838l(this, abstractC0283l);
        }
        Object obj = c5838l.f12295l;
        int i2 = c5838l.f12296l;
        InterfaceC14029l interfaceC14029l = null;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                InterfaceC15829l interfaceC15829l = this.loadAd;
                C14019l c14019l = new C14019l(c15067l, interfaceC14029l, 13);
                c5838l.f12296l = 1;
                Object objLoadAd = interfaceC15829l.loadAd(c14019l, c5838l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objLoadAd == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
        } catch (IOException e) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e);
        }
        return Unit.INSTANCE;
    }

    public final boolean loadAd() {
        Long l = yandex().purchase;
        Integer num = yandex().amazon;
        return l == null || num == null || this.yandex.yandex().crashlytics - l.longValue() >= ((long) num.intValue());
    }

    public final C15067l yandex() throws Throwable {
        AtomicReference atomicReference = this.crashlytics;
        if (atomicReference.get() == null) {
            Object objSubs = AbstractC10999l.subs(C17218l.f33421l, new C2799l(this, null, 1));
            while (!atomicReference.compareAndSet(null, objSubs) && atomicReference.get() == null) {
            }
        }
        return (C15067l) atomicReference.get();
    }
}
