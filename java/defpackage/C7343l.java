package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lُؚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7343l extends RuntimeException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10097l f15248l;

    public C7343l(C10097l c10097l) {
        this.f15248l = c10097l;
        if (c10097l.loadAd) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = c10097l.yandex;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C15253l c15253l = (C15253l) list.get(i);
            if (!AbstractC8669l.tapsense(iArr, c15253l.yandex)) {
                if (c15253l.yandex == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((C15253l) list.get(i3)).yandex == 1000) {
                        break;
                    } else {
                        AbstractC3984l.signatures(arrayList);
                    }
                } else {
                    arrayList.add(c15253l);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", AbstractC0653l.vip(((C15253l) arrayList.get(i4)).yandex, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        C10097l c10097l = this.f15248l;
        if (!c10097l.loadAd) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        C10227l c10227lAdmob = AbstractC14055l.admob();
        C8892l c8892l = new C8892l(1, c10097l.yandex);
        int iPro = c8892l.pro();
        for (int i = 0; i < iPro; i++) {
            ((C15253l) c8892l.get(i)).getClass();
        }
        C8892l c8892l2 = new C8892l(1, AbstractC14055l.purchase(c10227lAdmob));
        int iPro2 = c8892l2.pro();
        for (int i2 = 0; i2 < iPro2; i2++) {
            String str = (String) c8892l2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
