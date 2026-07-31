package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ؐؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17587l extends AbstractC6900l {
    public static List adcel(InterfaceC11075l interfaceC11075l) {
        Iterator it = interfaceC11075l.iterator();
        if (!it.hasNext()) {
            return C2580l.f5619l;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList ads(InterfaceC11075l interfaceC11075l) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC11075l.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static C14432l firebase(InterfaceC11075l interfaceC11075l, Function1 function1) {
        return new C14432l(interfaceC11075l, true, function1);
    }

    public static InterfaceC11075l isPro(InterfaceC11075l interfaceC11075l, int i) {
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return interfaceC11075l;
        }
        return interfaceC11075l instanceof InterfaceC15834l ? ((InterfaceC15834l) interfaceC11075l).loadAd(i) : new C13276l(interfaceC11075l, i, 0);
    }

    public static Object metrica(InterfaceC11075l interfaceC11075l) {
        Iterator it = interfaceC11075l.iterator();
        if (!it.hasNext()) {
            C1759l.firebase("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static InterfaceC11075l remoteconfig(Object obj, Function1 function1) {
        return obj == null ? C8360l.yandex : new C6479l(new C9577l(1, obj), function1, 0);
    }

    public static C14432l smaato(InterfaceC11075l interfaceC11075l, Function1 function1) {
        return new C14432l(interfaceC11075l, false, function1);
    }

    public static C14432l startapp(InterfaceC11075l interfaceC11075l, Function1 function1) {
        return smaato(new C11100l(interfaceC11075l, function1), new C1698l(0));
    }

    public static InterfaceC11075l subs(Iterator it) {
        return new C6714l(new C17374l(it, 1));
    }

    public static String vip(InterfaceC11075l interfaceC11075l, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : interfaceC11075l) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC15422l.yandex(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
