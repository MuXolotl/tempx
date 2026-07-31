package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٍؚْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7230l {
    public final C4910l yandex = AbstractC8618l.yandex();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C10856l c10856l;
        C4910l c4910l;
        if (abstractC0283l instanceof C10856l) {
            c10856l = (C10856l) abstractC0283l;
            int i = c10856l.f21947l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10856l.f21947l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10856l = new C10856l(this, abstractC0283l);
            }
        } else {
            c10856l = new C10856l(this, abstractC0283l);
        }
        Object obj = c10856l.f21948l;
        int i2 = c10856l.f21947l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c4910l = this.yandex;
            c10856l.f21949l = c4910l;
            c10856l.f21947l = 1;
            Object objYandex = c4910l.yandex(c10856l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4910l = c10856l.f21949l;
            AbstractC2829l.crashlytics(obj);
        }
        return new C17726l(c4910l);
    }
}
