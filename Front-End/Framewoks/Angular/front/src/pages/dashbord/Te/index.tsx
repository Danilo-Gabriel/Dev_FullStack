import { ReactNode } from 'react';

import { Container } from './styles';

interface TeProps {
  children: ReactNode;
}

export function Te({ children }: TeProps) {
  return (
    <Container>
      <h1>Te</h1>
      {children}
    </Container>
  );
}
