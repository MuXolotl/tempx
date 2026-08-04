package defpackage;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: renamed from: lُٜۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11293l extends AbstractC15029l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final EnumC0142l f22750l;

    public C11293l(C17465l c17465l, int i, EnumC0142l enumC0142l) {
        super(c17465l, i);
        this.f22750l = enumC0142l;
        StringBuilder sb = new StringBuilder("%");
        c17465l.amazon(sb);
        sb.append(true != c17465l.crashlytics() ? 't' : 'T');
        sb.append(enumC0142l.f1043l);
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: private */
    public final void mo1994private(C2934l c2934l, Object obj) {
        C17465l c17465l = (C17465l) this.f29554l;
        StringBuilder sb = (StringBuilder) c2934l.f6385l;
        boolean z = obj instanceof Date;
        EnumC0142l enumC0142l = this.f22750l;
        if (z || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder("%");
            c17465l.amazon(sb2);
            sb2.append(true != c17465l.crashlytics() ? 't' : 'T');
            sb2.append(enumC0142l.f1043l);
            sb.append(String.format(AbstractC3559l.yandex, sb2.toString(), obj));
            return;
        }
        char c = enumC0142l.f1043l;
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 2);
        sb3.append("%t");
        sb3.append(c);
        C2934l.smaato(sb, obj, sb3.toString());
    }
}
