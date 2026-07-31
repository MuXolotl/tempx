package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lٌٕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9061l implements AutoCloseable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f18650l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C18662l f18651l;

    public C9061l(C12014l c12014l, String str) {
        C18662l c18662lYandex = AbstractC11990l.yandex(AbstractC10586l.billing(((C11969l) c12014l.f23940l).amazon, new C2993l((InterfaceC7042l) c12014l.f23944l)));
        this.f18651l = c18662lYandex;
        this.f18650l = new CopyOnWriteArrayList();
        AbstractC10999l.mopub(c18662lYandex, null, 0, new C7641l(c12014l, str, this, (InterfaceC14029l) null, 20), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC11990l.billing(this.f18651l, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(long j, AbstractC0283l abstractC0283l) {
        C10396l c10396l;
        Object obj;
        if (abstractC0283l instanceof C10396l) {
            c10396l = (C10396l) abstractC0283l;
            int i = c10396l.f21214l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10396l.f21214l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10396l = new C10396l(this, abstractC0283l);
            }
        } else {
            c10396l = new C10396l(this, abstractC0283l);
        }
        Object obj2 = c10396l.f21215l;
        int i2 = c10396l.f21214l;
        byte b = 0;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18650l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj2);
            C9426l c9426l = new C9426l();
            copyOnWriteArrayList.add(c9426l);
            C17680l c17680l = new C17680l(c9426l, interfaceC14029l, b == true ? 1 : 0);
            c10396l.f21216l = c9426l;
            c10396l.f21214l = 1;
            Object objAdmob = AbstractC15342l.admob(j, c17680l, c10396l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
            obj2 = objAdmob;
            obj = c9426l;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = c10396l.f21216l;
            AbstractC2829l.crashlytics(obj2);
        }
        boolean z = obj2 != null;
        copyOnWriteArrayList.remove(obj);
        return Boolean.valueOf(z);
    }
}
