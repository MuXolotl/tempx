package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import ua.itaysonlab.vkxnative.VKXNative;

/* JADX INFO: renamed from: lِؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11544l {
    public static final C11544l yandex = new C11544l();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C10109l c10109l;
        if (abstractC0283l instanceof C10109l) {
            c10109l = (C10109l) abstractC0283l;
            int i = c10109l.f20580l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10109l.f20580l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10109l = new C10109l(this, abstractC0283l);
            }
        } else {
            c10109l = new C10109l(this, abstractC0283l);
        }
        Object objBilling = c10109l.f20579l;
        int i2 = c10109l.f20580l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objBilling);
            C7644l c7644lLoadAd = AbstractC16584l.loadAd();
            c10109l.f20580l = 1;
            C17464l c17464l = new C17464l("apps.get", C6168l.f12996l);
            c17464l.crashlytics(51931326L, "app_id");
            objBilling = c7644lLoadAd.billing(c17464l, c10109l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objBilling == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objBilling);
        }
        String str = ((C0452l) AbstractC16901l.m4231native(((C11979l) AbstractC10802l.subs((AbstractC14237l) objBilling)).loadAd)).f1637catch;
        if (str == null) {
            str = "";
        }
        Object[] objArr = VKXNative.x02(str).yandex;
        if (objArr.length - 1 < 0) {
            C8339l.smaato("idx 0 size mismatch");
            return null;
        }
        Object obj = objArr[0];
        if (obj == null) {
            C8339l.smaato("idx 0 is empty");
            return null;
        }
        if (obj instanceof String) {
            return Collections.singletonMap("code", obj);
        }
        C8339l.smaato("idx 0 type mismatch");
        return null;
    }
}
