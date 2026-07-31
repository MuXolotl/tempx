package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lٜ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18003l {
    public static final C18003l yandex = new C18003l();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(String str, AbstractC0283l abstractC0283l) {
        C4051l c4051l;
        if (abstractC0283l instanceof C4051l) {
            c4051l = (C4051l) abstractC0283l;
            int i = c4051l.f8347l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4051l.f8347l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4051l = new C4051l(this, abstractC0283l);
            }
        } else {
            c4051l = new C4051l(this, abstractC0283l);
        }
        Object objAdmob = c4051l.f8346l;
        int i2 = c4051l.f8347l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            C16534l c16534l = new C16534l(new String[]{str});
            c4051l.f8347l = 1;
            objAdmob = AbstractC8189l.admob(c16534l, c4051l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAdmob);
        }
        AudioTrack audioTrack = (AudioTrack) AbstractC16901l.m4217extends((List) objAdmob);
        String str2 = audioTrack != null ? audioTrack.isPro : null;
        return str2 == null ? "" : str2;
    }
}
